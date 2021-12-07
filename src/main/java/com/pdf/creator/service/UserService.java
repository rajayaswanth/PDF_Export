package com.pdf.creator.service;

import java.util.List;

import com.pdf.creator.entities.User;

public interface UserService {
	
	User addUser(User user);
	
	List<User> getUsers();

	List<User> addDummyUsers();

}
