package com.company.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.project.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
