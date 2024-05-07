package com.webapp.webapptemplate.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {
	private Integer id;
	private String name;
	private String surname;
	private String nickname;
	private LocalDate birthday;
}
