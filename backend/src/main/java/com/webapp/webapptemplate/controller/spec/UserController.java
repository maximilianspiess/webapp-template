package com.webapp.webapptemplate.controller.spec;

import com.webapp.webapptemplate.dto.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public interface UserController {
	@GetMapping("")
	ResponseEntity<UserDto> getUser();
}
