package com.misfat.qrqc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

// TODO: Auto-generated Javadoc
/**
 * The Class QrqcApplication.
 */

@SpringBootApplication
@ComponentScan(basePackages = {"com.misfat.qrqc"})
//@EnableJpaRepositories("com.misfat.qrqc.repository")
public class QrqcApplication {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(QrqcApplication.class, args);
	}
	@Bean
	PasswordEncoder pwdEnc() {
		return new BCryptPasswordEncoder();
	}
}
