package com.mycompany.simpleservice.repository;


import com.mycompany.simpleservice.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by suman.das on 11/28/18.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
