package com.farmers.peter.entities;

import lombok.Data;

@Data
public class User {
	
	private String id;
	private String username;
	private String password;
	private String userType;
	private boolean isActive;

}
