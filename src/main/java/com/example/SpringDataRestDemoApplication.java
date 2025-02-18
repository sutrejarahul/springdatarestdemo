package com.example;

import com.example.model.Product;
import com.example.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataRestDemoApplication implements CommandLineRunner {

	private final ProductRepository productRepository;

	public SpringDataRestDemoApplication(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestDemoApplication.class, args);
	}


	@Override
	public void run(String... args) {
		productRepository.save(new Product(1L, "Laptop", "Electronics", 800.00));
		productRepository.save(new Product(2L, "Smartphone", "Electronics", 600.00));
		productRepository.save(new Product(3L, "Coffee Mug", "Home", 15.00));
	}
}
