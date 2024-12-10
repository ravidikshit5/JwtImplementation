package com.ravi.spring_security.service;

import com.ravi.spring_security.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> store = new ArrayList<>();

    public UserService(){
        store.add(new User(UUID.randomUUID().toString(),"Ravi Dikshit","sendto@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Yash Kumar","yash@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Vishal Kumar","vishal@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Dhoni Dikshit","dhoni@gmail.com"));
    }
    public List<User> getUser(){
        return store;
    }
}
