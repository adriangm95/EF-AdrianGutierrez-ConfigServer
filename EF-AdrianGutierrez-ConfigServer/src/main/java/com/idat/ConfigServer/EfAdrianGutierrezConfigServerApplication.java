package com.idat.ConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class EfAdrianGutierrezConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfAdrianGutierrezConfigServerApplication.class, args);
	}

}
