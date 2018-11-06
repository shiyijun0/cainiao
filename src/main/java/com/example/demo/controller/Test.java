package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.EntityNotFoundException;

@Controller
@RequestMapping("/api")
public class Test {
    @Autowired
    private UserService userService;

@RequestMapping("/save")
@ResponseBody
    public Object save(User user){
    return userService.save(user);
}

    @RequestMapping("/update")
    @ResponseBody
    public Object update(User user){
        return userService.update(user);
    }

    @RequestMapping("/find")
    @ResponseBody
    public User find(User user){
        User s=null;
        try {
             s=userService.find(user.getId());
            }catch (EntityNotFoundException e){
            System.out.println(e.getMessage());
            return new User();
        }
if(s instanceof User){
    return s;
}else {
    return new User();
}

    }

    @RequestMapping("/delete")
    @ResponseBody
    public int object(User user){
        try {
            userService.delete(user);
        }catch (Exception e){
            return 0;
        }
         return  1;
    }
}
