package com.webapp.webapptemplate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class User {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String surname;
	private String nickname;
	private String password;
	private LocalDate birthday;
}
