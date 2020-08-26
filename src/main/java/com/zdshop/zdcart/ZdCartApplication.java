package com.zdshop.zdcart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ZdCartApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZdCartApplication.class, args);
	}

}
