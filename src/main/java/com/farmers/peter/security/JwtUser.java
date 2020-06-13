package com.farmers.peter.security;

import java.util.List;
import org.springframework.security.core.GrantedAuthority;
import lombok.Data;

@Data
public class JwtUser {
	
	private String id;
    private  String username;
    private String password;
    private List<GrantedAuthority> authorities;
    private boolean isAccountActive;

}
