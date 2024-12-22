package com.valorant.Valorant.repository;

import com.valorant.Valorant.model.User;
import org.springframework.data.repository.Repository;

@org.springframework.stereotype.Repository
public interface UserRepository extends Repository<User, String> {

    User save(User entity);
}
