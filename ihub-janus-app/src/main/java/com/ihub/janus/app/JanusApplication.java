/*
 * Copyright (c) iHub 2021. All rights reserved. <br><br> 
 *
 */
package com.ihub.janus.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * The Class JanusApplication.
 */
@SpringBootApplication
@EntityScan(basePackages = { "com.ihub.janus.data.entity" })
@EnableJpaRepositories(basePackages = { "com.ihub.janus.data.repository" })
public class JanusApplication {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(JanusApplication.class, args);
		AppBanner.printBanner();
	}

}