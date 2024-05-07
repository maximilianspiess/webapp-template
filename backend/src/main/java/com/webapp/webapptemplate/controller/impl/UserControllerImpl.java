package com.webapp.webapptemplate.controller.impl;

import com.webapp.webapptemplate.controller.spec.UserController;
import com.webapp.webapptemplate.dto.UserDto;
import com.webapp.webapptemplate.service.impl.UserServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@AllArgsConstructor
public class UserControllerImpl implements UserController {
	private final UserServiceImpl service;

	@Override
	public ResponseEntity<UserDto> getUser() {
		return ok(service.getUser());
	}
}
