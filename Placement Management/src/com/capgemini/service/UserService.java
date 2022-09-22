package com.capgemini.service;


import com.capgemini.entities.User;

public interface UserService {
	
	public abstract User addNewUser(User user);
	public abstract User updateUser(User user);
}