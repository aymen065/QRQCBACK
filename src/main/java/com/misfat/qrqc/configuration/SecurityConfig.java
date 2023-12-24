package com.misfat.qrqc.configuration;

import java.util.ArrayList;
import java.util.Collection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import com.misfat.qrqc.Filters.JwtAuthentificationFilter;
import com.misfat.qrqc.Filters.JwtAuthorizationFilter;
//import com.misfat.qrqc.model.AppUser;
import com.misfat.qrqc.model.Personnel;
import com.misfat.qrqc.service.PersonnelService;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	
	private PasswordEncoder pwdEnc;
	private PersonnelService persoService;

	public SecurityConfig(PersonnelService accountService, PasswordEncoder pwdEnc) {
		this.persoService = accountService;
		this.pwdEnc = pwdEnc;
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.userDetailsService(new UserDetailsService() {

			@Override
			// exécutée lors d'authentification
			public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
				// System.out.println(username);
				Personnel personnel = persoService.loadUserByUsername(username, true);
				Personnel appUser = new Personnel(personnel);
				//appUser.setPassword(pwdEnc.encode(appUser.getPassword()));
				Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
				appUser.getAppRoles().forEach(r -> {
					authorities.add(new SimpleGrantedAuthority(r.getRoleName()));
				});
				return new User(appUser.getLogin(), appUser.getPassword(), authorities);
			}
		});

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.csrf().disable();
		
		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		 http.authorizeRequests().antMatchers(HttpMethod.POST,
		 "/personnel/**").permitAll();
		 http.authorizeRequests().antMatchers(HttpMethod.POST,
				 "/ligne/**").permitAll();
		// http.authorizeRequests().antMatchers("/app/**").permitAll();
		// http.authorizeRequests().antMatchers("/login").permitAll().antMatchers(HttpMethod.OPTIONS,
		// "/**").permitAll();
		http.authorizeRequests().antMatchers("/login/**").permitAll();
		http.authorizeRequests().anyRequest().authenticated();

		http.addFilter(new JwtAuthentificationFilter(authenticationManagerBean()));
		http.addFilterBefore(new JwtAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class);
		http.cors().configurationSource(corsConfigurationSource());
	}

	@Bean
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}

	@Bean
	CorsConfigurationSource corsConfigurationSource() {
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", new CorsConfiguration().applyPermitDefaultValues());
		return source;
	}

}
