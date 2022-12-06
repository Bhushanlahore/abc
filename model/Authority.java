package com.yash.pms.model;

import org.springframework.security.core.GrantedAuthority;

//class for user authorization
public class Authority implements GrantedAuthority{

	
	private String authority;
	
	public Authority(String authority) {
		this.authority = authority;
	}
	
	//return user authority whether its is admin or normal user
	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return this.authority;
	}
			
	
}
