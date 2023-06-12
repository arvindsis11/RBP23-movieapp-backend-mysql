package com.moviebooking.auth.service;

import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.moviebooking.auth.dto.LoginDto;
import com.moviebooking.auth.dto.ResetDto;
import com.moviebooking.auth.dto.SignupDto;
import com.moviebooking.auth.model.User;

public interface UserService {

	public ResponseEntity<?> addUser(SignupDto signupDto);

	// this will work like a authentication manager for validating user
	public boolean loginUser(LoginDto loginDto);

	public ResponseEntity<?> getAllUsers();

	public Optional<User> getUserByUsername(String username);

	public ResponseEntity<?> updatePassword(ResetDto resetDto);

	public ResponseEntity<?> deleteUser(Long userId);

}
