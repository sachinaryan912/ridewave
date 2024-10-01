package com.sachin.project.ridewave.entities;

import java.util.Set;

import com.sachin.project.ridewave.entities.enums.UserRole;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="app_user")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	@Column(unique=true)
	private String email;
	private String password;
	@ElementCollection(fetch = FetchType.LAZY)
    @Enumerated(EnumType.STRING)
	private Set<UserRole> roles;

}
