package com.moviebooking.auth.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moviebooking.auth.model.Role;


public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(String name);
}