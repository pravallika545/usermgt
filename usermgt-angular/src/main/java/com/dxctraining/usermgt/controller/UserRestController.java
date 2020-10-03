package com.dxctraining.usermgt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxctraining.usermgt.dto.CreateUserRequest;
import com.dxctraining.usermgt.dto.UserDto;
import com.dxctraining.usermgt.entities.User;
import com.dxctraining.usermgt.service.IUserService;

@RestController
@RequestMapping("/users")
public class UserRestController {
	
	@Autowired
	private IUserService service;
	@PostMapping("/add")
	public UserDto addUser(@RequestBody CreateUserRequest requestData) {
		String userType = requestData.getUserType();
		String userName = requestData.getUserName();
		String password = requestData.getPassword();
		long userPhone = requestData.getUserPhone();
		User user = new User(userType,userName,userPhone,password);
		user = service.addUser(user);
		UserDto response = toDto(user);
		return response;
	}
	
	@GetMapping("/get/{userId}")
	public UserDto findByUserId(@PathVariable("userId")Integer userId) {
		User user = service.viewUserById(userId);
		UserDto response = toDto(user);
		return response;
	}
	
	@GetMapping("/all")
	public List<UserDto> allUsers(){
		List<User> list = service.viewUsers();
		List<UserDto> response = new ArrayList<>();
		for(User user:list) {
			UserDto dto = toDto(user);
			response.add(dto);
		}
		return response;
	}
	
	@DeleteMapping("/delete/{userId}")
	public void deleteUser(@PathVariable("userId")Integer userId) {
		service.deleteUser(userId);
	}

	private UserDto toDto(User user) {
		UserDto dto = new UserDto();
		dto.setUserType(user.getUserType());
		dto.setUserName(user.getUserName());
		dto.setUserPhone(user.getUserPhone());
		dto.setPassword(user.getPassword());
		dto.setUserId(user.getUserId());
		return dto;
	}

}
