package com.dorotajachtoma.wiredbraincoffee;

import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Flux;
import repository.ProductRepository;

@SpringBootApplication
public class WiredBrainCoffeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(WiredBrainCoffeeApplication.class, args);
	}

	@Bean
	CommandLineRunner init(ProductRepository repository){
		return args -> {
			Flux<Product> productFlux = Flux.just(
					new Product(null,"Big Latte",2.99),
					new Product(null,"Mocha",3.49),
					new Product(null,"Hazelnut Cappucion",4.35))
					.flatMap(repository::save);

			productFlux.thenMany(repository.findAll())
			.subscribe(System.out::println);
		};
	}
}
