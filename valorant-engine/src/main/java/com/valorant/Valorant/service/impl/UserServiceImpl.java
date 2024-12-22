package com.valorant.Valorant.service.impl;

import com.valorant.Valorant.model.User;
import com.valorant.Valorant.repository.UserRepository;
import com.valorant.Valorant.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository_;

    @Override
    public User createUser(User user) {
       return repository_.save(user);
    }
}
