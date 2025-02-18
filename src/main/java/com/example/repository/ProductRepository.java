package com.example.repository;

import com.example.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "items")
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByCategory(String category);

}
