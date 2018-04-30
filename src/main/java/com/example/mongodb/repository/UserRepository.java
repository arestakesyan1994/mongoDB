package com.example.mongodb.repository;

import com.example.mongodb.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,Integer> {
    User findOneByEmail(String s);

    User findUserByEmail(String s);
}
