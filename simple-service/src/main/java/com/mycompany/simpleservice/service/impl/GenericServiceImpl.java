package com.mycompany.simpleservice.service.impl;


import com.mycompany.simpleservice.domain.RandomCity;
import com.mycompany.simpleservice.domain.User;
import com.mycompany.simpleservice.repository.RandomCityRepository;
import com.mycompany.simpleservice.repository.UserRepository;
import com.mycompany.simpleservice.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by suman.das on 11/28/18.
 */
@Service
public class GenericServiceImpl implements GenericService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RandomCityRepository randomCityRepository;

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public List<RandomCity> findAllRandomCities() {
        return randomCityRepository.findAll();
    }
}
