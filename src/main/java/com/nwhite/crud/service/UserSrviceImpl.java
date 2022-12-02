package com.nwhite.crud.service;

import com.nwhite.crud.model.User;
import com.nwhite.crud.repository.UserRepositary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSrviceImpl implements UserService {
    private UserRepositary userRepositary;

    public UserSrviceImpl(UserRepositary repositary) {
        userRepositary = repositary;
    }

    @Override
    public void save(User user) {
        userRepositary.save(user);
    }

    @Override
    public void delete(Long id) {
        userRepositary.deleteById(id);
    }

    @Override
    public User get(Long id) {
        return userRepositary.findById(id).get();
    }

    @Override
    public List<User> getAll() {
        return userRepositary.findAll();
    }
}
