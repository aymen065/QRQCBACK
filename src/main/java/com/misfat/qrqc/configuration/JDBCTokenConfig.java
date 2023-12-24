package com.misfat.qrqc.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class JDBCTokenConfig {
	/** The datasource url. */
	@Value("${spring.datasource.url}")
	private String datasourceUrl;

	/** The db driver class name. */
	@Value("${spring.datasource.driver-class-name}")
	private String dbDriverClassName;

	/** The db username. */
	@Value("${spring.datasource.username}")
	private String dbUsername;

	/** The db password. */
	@Value("${spring.datasource.password}")
	private String dbPassword;

	/**
	 * Data source.
	 *
	 * @return the data source
	 */
	@Bean
	public DataSource dataSource() {

		final DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(dbDriverClassName);
		dataSource.setUrl(datasourceUrl);
		dataSource.setUsername(dbUsername);
		dataSource.setPassword(dbPassword);
		return dataSource;
	}

}
