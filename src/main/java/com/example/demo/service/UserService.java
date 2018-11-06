package com.example.demo.service;

import com.example.demo.domain.User;

public interface UserService {

    int save(User user);

    int update(User user);

    User find(int id);

    void delete(User user);
}
