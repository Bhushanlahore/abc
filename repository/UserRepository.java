package com.yash.pms.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.pms.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

	public User findByUsername(String username);
	
	
	
	

}
