package com.dxctraining.usermgt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxctraining.usermgt.dao.*;
import com.dxctraining.usermgt.entities.*;
import com.dxctraining.usermgt.exceptions.*;

import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao;

	@Override
	public User addUser(User user) {
		validate(user);
		user = userDao.save(user);
		return user;

	}

	public void validate(User user) {
		if (user == null) {
			throw new InvalidArgumentException("user can not be null");
		}
	}

	@Override
	public User viewUserById(Integer userId) {
		Optional<User> optional = userDao.findById(userId);
		if (!optional.isPresent()) {
			throw new UserNotFoundException("user not found for id=" + userId);
		}
		User user = optional.get();
		return user;
	}

	@Override
	public List<User> viewUsers() {
		List<User> users = userDao.findAll();
		return users;
	}

	@Override
	public void deleteUser(Integer userId) {
		userDao.deleteById(userId);

	}

}