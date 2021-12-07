package com.pdf.creator.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pdf.creator.entities.User;
import com.pdf.creator.repositories.UserRepository;
import com.pdf.creator.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepo;

	@Override
	public User addUser(User user) {
		return userRepo.save(user);
	}

	@Override
	public List<User> addDummyUsers() {
		List<User> users = new ArrayList<>();
		users.add(new User("User1","user1@test.com"));
		users.add(new User("User2","user2@test.com"));
		users.add(new User("User3","user3@test.com"));
		users.add(new User("User4","user4@test.com"));
		users.add(new User("User5","user5@test.com"));
		users.add(new User("User6","user6@test.com"));
		users.add(new User("User7","user7@test.com"));
		users.add(new User("User8","user8@test.com"));
		users.add(new User("User9","user9@test.com"));
		users.add(new User("User10","user10@test.com"));
		return userRepo.saveAll(users);
	}

	@Override
	public List<User> getUsers() {
		return userRepo.findAll();
	}

}
