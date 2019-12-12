package sherriff.api.rmb.service;

import sherriff.api.rmb.domain.City;
import sherriff.api.rmb.domain.User;

import java.util.List;

/**
 * Created by Sherriff.Agboola on 12/12/19.
 */
public interface GenericService {
    User findByUsername(String username);

    List<User> findAllUsers();

    List<City> findAllRandomCities();

    City findOneCity();
}
