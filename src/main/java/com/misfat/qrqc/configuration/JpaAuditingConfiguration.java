package com.misfat.qrqc.configuration;


import java.util.Optional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.core.context.SecurityContextHolder;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
public class JpaAuditingConfiguration {

	/**
	 * Auditor provider.
	 *
	 * @return the auditor aware
	 */
	@Bean
	public AuditorAware<String> auditorProvider() {

		/*
		 * if you are using spring security, you can get the currently logged username with
		 * following code segment. SecurityContextHolder.getContext().getAuthentication().getName()
		 */
		return new AuditorAware<String>() {

			@Override
			public Optional<String> getCurrentAuditor() {

				return Optional.ofNullable(
						SecurityContextHolder.getContext().getAuthentication().getName());
			}
		};
	}
}
