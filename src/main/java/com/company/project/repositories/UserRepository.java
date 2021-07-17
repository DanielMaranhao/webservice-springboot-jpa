package com.company.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
