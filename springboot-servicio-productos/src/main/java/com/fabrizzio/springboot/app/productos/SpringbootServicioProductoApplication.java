package com.fabrizzio.springboot.app.productos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EntityScan({"springbootserviciocommons.models.entiy"})
public class SpringbootServicioProductoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioProductoApplication.class, args);
	}

}
