package com.springbootsecurity.springsecurity.services;


import com.springbootsecurity.springsecurity.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServices {
    List<User> list = new ArrayList<>();

    public UserServices() {
        list.add(new User("abhishek", "admin", "abhi@gmail.com"));
        list.add(new User("saurabh", "user", "saurab@gail.com"));
        list.add(new User("amit", "admin", "amit@gmail.com"));
    }

    //get all users
    public List<User> getAllUsers() {
        return this.list;
    }

    //get single user
    public User getUser(String username) {
        return list.stream().filter(t -> t.getUsername().equals(username)).findAny().orElse(null);
    }


    //add user
    public String addUser(User user) {
        this.list.add(user);
        return "User Added Successfully";
    }



}
