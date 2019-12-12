package sherriff.api.rmb.service.impl;

import sherriff.api.rmb.domain.City;
import sherriff.api.rmb.domain.User;
import sherriff.api.rmb.repository.CityRepository;
import sherriff.api.rmb.repository.UserRepository;
import sherriff.api.rmb.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Sherriff.Agboola on 12/12/19.
 */
@Service
public class GenericServiceImpl implements GenericService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CityRepository randomCityRepository;

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public List<City> findAllRandomCities() {
        return randomCityRepository.findAll();
    }

    @Override
    public City findOneCity() {
        return randomCityRepository.findAll().get(0);
    }
}
