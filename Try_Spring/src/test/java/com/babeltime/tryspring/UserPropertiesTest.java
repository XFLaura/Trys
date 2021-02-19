package com.babeltime.tryspring;


import com.babeltime.tryspring.model.User;
import com.babeltime.tryspring.repositroy.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@SpringBootTest(classes=TryspringApplication.class)
@RunWith(SpringRunner.class)

public class UserPropertiesTest {


    @Autowired
    private UserRepository userRepository;

    @Test
    public void testSave() throws Exception {
        User user=new User("neo","123456",30);
        userRepository.save(user);
    }

    @Test
    public void testUpdate(){
        User user = new User("neo","123456",18);
        user.setId(1L);
        userRepository.update(user);
    }
    @Test
    public void testDelete(){
        userRepository.delete(1L);
    }

    @Test
    public void testQueryAll(){
        List<User> users=userRepository.findAll();
        for(User user:users){
            System.out.println("user =="+user.toString());
        }
    }


}
