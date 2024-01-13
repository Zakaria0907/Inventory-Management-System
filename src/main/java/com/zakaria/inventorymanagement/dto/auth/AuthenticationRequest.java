package com.zakaria.inventorymanagement.dto.auth;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthenticationRequest {
	
	private String login;
	
	private String password;
	
}