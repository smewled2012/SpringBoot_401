package com.example.demo.model;

import com.example.demo.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
    User findByUsername(String username);
    Long countByEmail(String email);
    Long countByUsername(String username);
    User findByEmail(String email);

    //Query by any variable
}
