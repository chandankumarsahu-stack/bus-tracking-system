package com.example.bus_tracking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.bus_tracking.dto.LoginRequest;
import com.example.bus_tracking.dto.LoginResponse;
import com.example.bus_tracking.dto.RegisterRequest;
import com.example.bus_tracking.dto.UserProfileDTO;
import com.example.bus_tracking.entity.User;
import com.example.bus_tracking.repository.UserRepository;
import com.example.bus_tracking.security.JwtService;

@Service
public class AuthService {

	@Autowired
	private UserRepository repository;

	@Autowired
	private PasswordEncoder encoder;

	@Autowired
	private JwtService jwtService;

	public String register(RegisterRequest request) {

		if (repository.findByEmail(request.getEmail()).isPresent()) {
			return "Email already exists";
		}

		User user = new User();

		user.setFullName(request.getFullName());

		user.setEmail(request.getEmail());

		user.setPassword(encoder.encode(request.getPassword()));

		user.setRole(request.getRole());

		repository.save(user);

		return "Registration Successful";
	}

	public LoginResponse login(LoginRequest request) {

		User user = repository.findByEmail(request.getEmail())

				.orElseThrow(() -> new RuntimeException("Invalid Email"));

		if (!request.getPassword().equals(user.getPassword())) {
		    throw new RuntimeException("Wrong Password");
		}

		String token = jwtService.generateToken(user.getEmail());

		return new LoginResponse(

				token,

				user.getRole().name(),

				"Login Successful"

		);

	}

	public UserProfileDTO getProfile(String email) {

		User user = repository.findByEmail(email).orElseThrow();

		return new UserProfileDTO(

				user.getId(),

				user.getFullName(),

				user.getEmail(),

				user.getRole().name()

		);

	}

}