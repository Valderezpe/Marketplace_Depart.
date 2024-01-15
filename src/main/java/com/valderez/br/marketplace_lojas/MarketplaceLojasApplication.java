package com.valderez.br.marketplace_lojas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class MarketplaceLojasApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarketplaceLojasApplication.class, args);
	}

}
