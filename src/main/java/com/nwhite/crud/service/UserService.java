package com.nwhite.crud.service;

import com.nwhite.crud.model.User;

import java.util.List;

public interface UserService {
    void save(User user);

    void update(long id, User user);
    void delete(Long id);
    User get(Long id);
    List<User> getAll();
}
