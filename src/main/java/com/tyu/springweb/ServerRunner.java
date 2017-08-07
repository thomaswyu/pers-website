package com.tyu.springweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServerRunner
{
	public static void main(final String[] args)
	{
		ResourcePathfinder.loadProperties();
		SpringApplication.run(ServerRunner.class, args);
	}
}
