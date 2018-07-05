package com.xx.service;

import java.util.List;

import com.xx.pojo.User;

public interface IUserService {

	List<User> findAll();
	
    User findbyName(User user);
	
    void add(User user);
	
    void update(User user);
	
    void delete(User user);
}
