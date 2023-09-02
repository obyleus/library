package com.onur.library.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LibraryDataBaseConfiguration {
	
	@Bean
	DataSource getDataSource() {
		return DataSourceBuilder.create()
				.driverClassName("com.mysql.cj.jdbc.Driver")
				.url("jdbc:mysql://127.0.0.1:3306/library")
				.username("root")
				.password("root")
				.build();
	}

}
