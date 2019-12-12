package com.mycompany.simpleservice.service;



import com.mycompany.simpleservice.domain.RandomCity;
import com.mycompany.simpleservice.domain.User;

import java.util.List;

/**
 * Created by suman.das on 11/28/18.
 */
public interface GenericService {
    User findByUsername(String username);

    List<User> findAllUsers();

    List<RandomCity> findAllRandomCities();
}
