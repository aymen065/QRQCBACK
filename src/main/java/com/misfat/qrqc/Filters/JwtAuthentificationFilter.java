package com.misfat.qrqc.Filters;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JwtAuthentificationFilter extends UsernamePasswordAuthenticationFilter {
	private AuthenticationManager authenticationManager;

	public JwtAuthentificationFilter(AuthenticationManager authenticationManager) {
		this.authenticationManager = authenticationManager;
	}

	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
			throws AuthenticationException {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		//response.setHeader("Access-Control-Allow-Origin", "*");
		UsernamePasswordAuthenticationToken authentificationToken = new UsernamePasswordAuthenticationToken(userName,
				password);
		System.out.println("token : "+authentificationToken);
		return authenticationManager.authenticate(authentificationToken);
	}

	@Override
	protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
			Authentication authResult) throws IOException, ServletException {
		Date expire_in= new Date(System.currentTimeMillis() + 4 * 60 * 60 * 1000);
		User user = (User) authResult.getPrincipal();
		Algorithm algorithm = Algorithm.HMAC256("mySecret1234");
		String jwtAccessToken = JWT.create().withSubject(user.getUsername())
				.withExpiresAt(expire_in)
				.withIssuer(request.getRequestURI().toString())
				.withClaim("roles",
						user.getAuthorities().stream().map(ga -> ga.getAuthority()).collect(Collectors.toList()))
				.sign(algorithm);
//30 * 24 * 60 * 60 * 1000
		String jwtRefreshToken = JWT.create().withSubject(user.getUsername())
				.withExpiresAt(new Date(System.currentTimeMillis() +  30 * 60 * 1000))
				.withIssuer(request.getRequestURI().toString())
				.withClaim("roles",
						user.getAuthorities().stream().map(ga -> ga.getAuthority()).collect(Collectors.toList()))
				.sign(algorithm);
		Map<String, String> idToken = new HashMap<>();
		idToken.put("access_token", jwtAccessToken);
		idToken.put("refresh_token", jwtRefreshToken);
		
		// response.setHeader("Authorization", jwtAccessToken);
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setContentType("application/json");
		new ObjectMapper().writeValue(response.getOutputStream(), idToken);
	}

}
