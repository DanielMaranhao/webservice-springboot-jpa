package com.company.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.project.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
}
