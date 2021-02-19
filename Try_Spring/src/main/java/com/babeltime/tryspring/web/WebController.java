package com.babeltime.tryspring.web;

import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.babeltime.tryspring.model.User;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class WebController {

    @RequestMapping("/getUser")
    public User getUser(){
        User user=new User();
        user.setName("test");
        user.setAge(12);
        user.setPassword("123456");

        return user;
    }

    @RequestMapping("/getUsers")
    public List<User> getUsers(){
        List<User> users=new ArrayList<User>();

        User user1=new User();
        user1.setName("neo");
        user1.setAge(30);
        user1.setPassword("neo123");
        users.add(user1);

        User user2=new User();
        user2.setName("neddo");
        user2.setAge(3);
        user2.setPassword("neo23");

        users.add(user2);
        return users;


    }
    @RequestMapping(value="get/{name}",method=RequestMethod.GET)
    public String get(@PathVariable String name){
        return name;

    }

    @RequestMapping("/saveUser")
    public void saveUser(@Valid User user , BindingResult result){
        System.out.println("user:"+user);
        if(result.hasErrors()){
            List<ObjectError> list = result.getAllErrors();
            for(ObjectError error:list){
                System.out.println(error.getCode()+"-"+error.getDefaultMessage());
            }

        }

    }
}
