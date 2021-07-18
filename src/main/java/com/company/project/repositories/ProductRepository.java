package com.company.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.project.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
