package com.example.demo.service.impl;

import com.example.demo.dao.UserDaoRepository;
import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDaoRepository userDaoRepository;

    @Override
    @Transactional
    public int save(User user) {
        try {
            userDaoRepository.save1(user.getName(),user.getPassword());
        }catch (Exception e){
            return 0;
        }
         return 1;
    }

    @Override
    @Transactional
    public int update(User user) {
        try {
            userDaoRepository.update1(user.getName(),user.getId());
        }catch (Exception e){
            return 0;
        }
        return 1;
    }

    @Override
    public User find(int id) {
        return userDaoRepository.getOne(id);
    }

    @Override
    @Transactional
    public void delete(User user) {
        userDaoRepository.delete(user);
    }
}
