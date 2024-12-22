package com.valorant.Valorant.service;

import com.valorant.Valorant.model.User;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Validated
public interface UserService {

    User createUser(User user);
}
