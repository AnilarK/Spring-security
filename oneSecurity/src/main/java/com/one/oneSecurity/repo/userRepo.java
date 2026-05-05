package com.one.oneSecurity.repo;

import com.one.oneSecurity.model.user;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface userRepo extends MongoRepository<user,String> {

    Optional<user> findByUsername(String username);
}
