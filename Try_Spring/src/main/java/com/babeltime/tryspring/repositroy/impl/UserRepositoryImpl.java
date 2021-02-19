package com.babeltime.tryspring.repositroy.impl;

import com.babeltime.tryspring.model.User;
import com.babeltime.tryspring.repositroy.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class UserRepositoryImpl  implements UserRepository{

    private Logger logger= LoggerFactory.getLogger(UserRepositoryImpl.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int save(User user){
        return jdbcTemplate.update("INSERT INTO users(name,password,age) values (?,?,?)",user.getName(),user.getPassword(),user.getAge());
    }

    @Override
    public int update(User user){
        logger.info("UPDATE users SET name=?,password=?,age= where id =?",user.getName(),user.getPassword(),user.getAge(),user.getId());
        return jdbcTemplate.update("UPDATE users SET name=?,password=?,age=? where id =?",user.getName(),user.getPassword(),user.getAge(),user.getId());

    }

    @Override
    public int delete(long id){
        return jdbcTemplate.update("DELETE FROM users where id =?",id);
    }

    @Override
    public User findById(long id){
        return jdbcTemplate.queryForObject("SELECT * FROM users WHERE id=?",new Object[]{id},new BeanPropertyRowMapper<User>(User.class));

    }

    @Override
    public List<User> findAll(){
        return jdbcTemplate.query("SELECT * FROM users",new UserMapper());
    }


}
