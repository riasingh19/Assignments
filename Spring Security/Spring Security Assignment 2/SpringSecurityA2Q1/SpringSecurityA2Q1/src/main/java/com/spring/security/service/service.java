package com.spring.security.service;


import java.util.List;

import com.spring.security.models.User;

public interface service {

    public List<User> getAllUsers();

    public User getUser(String username);

    public User addUser(User user);
}