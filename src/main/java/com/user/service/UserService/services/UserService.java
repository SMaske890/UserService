package com.user.service.UserService.services;

import com.user.service.UserService.entities.User;

import java.util.List;

public interface UserService {

    //create
    User saveUser(User user);

    //get all users
    List<User> getAllUser();

    //get user by userId
    User getUser(String userId);

    //delete user
//    User deleteUser (String userId);

}
