package br.com.helber.testeserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TesteserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteserverApplication.class, args);
	}

}
