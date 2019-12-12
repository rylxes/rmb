package sherriff.api.rmb.controller;

import sherriff.api.rmb.domain.City;
import sherriff.api.rmb.domain.User;
import sherriff.api.rmb.service.GenericService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Sherriff.Agboola on 12/12/19.
 */
@RestController
@RequestMapping("/api")
public class ResourceController {
    @Autowired
    private GenericService userService;


    @ApiOperation(value = "Get string from public endpoint")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK")
    })
    @RequestMapping(value = "/public/cities")
    public List<City> getAllCities() { return userService.findAllRandomCities();
    }


    @ApiOperation(value = "Get string from public endpoint")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK")
    })
    @RequestMapping(value = "/public/city")
    public City getCity() {
        return userService.findOneCity();
    }


    @ApiOperation(value = "Get string from private/secured endpoint")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden")
    })
    //@GetMapping("/private/users")
    @RequestMapping(value = "/private/users", method = RequestMethod.GET)
    public List<User> getUsers() {
        return userService.findAllUsers();
    }


}
