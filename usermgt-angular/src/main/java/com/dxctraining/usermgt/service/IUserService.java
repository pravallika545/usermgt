package com.dxctraining.usermgt.service;

import java.util.List;

import com.dxctraining.usermgt.entities.User;

public interface IUserService {
	public User addUser(User user);

	public User viewUserById(Integer userId);

	public List<User> viewUsers();

	public void deleteUser(Integer userId);
	

}