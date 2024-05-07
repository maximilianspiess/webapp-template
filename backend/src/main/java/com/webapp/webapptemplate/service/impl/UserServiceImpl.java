package com.webapp.webapptemplate.service.impl;

import com.webapp.webapptemplate.dto.UserDto;
import com.webapp.webapptemplate.repository.UserRepository;
import com.webapp.webapptemplate.service.spec.UserService;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
	private final UserRepository userRepository;

	@Override
	public UserDto getUser() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		return null;
	}
}
