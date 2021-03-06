/**
 * Copyright (2019, ) Institute of Software, Chinese Academy of Sciences
 */
package io.github.webfrk.nat;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import io.github.kubesys.specs.httpfrk.HttpServer;

/**
 * @author wuheng@iscas.ac.cn
 * @since  
 * 
 * <p>
 *        The {@code ApplicationServer} class is used for starting web
 *        applications. Please configure
 * 
 *        src/main/resources/application.yml src/main/resources/log4j.properties
 * 
 */

@ComponentScan(basePackages = { "io.github.webfrk.nat.exampls" })
public class SpringNativeBootServer extends HttpServer  {

	public static void main(String[] args) {
		SpringApplication.run(SpringNativeBootServer.class, args);
	}

}
