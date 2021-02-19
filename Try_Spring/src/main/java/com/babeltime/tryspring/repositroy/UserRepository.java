package com.babeltime.tryspring.repositroy;

import com.babeltime.tryspring.model.User;

import java.util.List;

public interface UserRepository {
    int save(User user);
    int update(User user);
    int delete(long id);
    List<User> findAll();
    User findById(long id);
}