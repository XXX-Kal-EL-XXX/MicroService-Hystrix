package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	List<User> list = List.of(
			new User(1001L, "Kal-EL", "688688812"),
			new User(1002L, "Dayana", "688688813"),
			new User(1003L, "Bruce-Wayn", "688688814")
			
			);

	@Override
	public User getDetails(Long userId) {
		
		return list.stream().filter(user -> user.getUserId().equals(userId)).findAny().orElse(null);
	}

	
}
