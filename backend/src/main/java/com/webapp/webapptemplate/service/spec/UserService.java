package com.webapp.webapptemplate.service.spec;

import com.webapp.webapptemplate.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
	UserDto getUser();
}
