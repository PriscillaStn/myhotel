package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/countriesbd")
public class UserResource {

    @Autowired
    private UserService userService;
	
    @RequestMapping(value = "/query2", method = RequestMethod.GET)
    public List<Countries> getLegacyUsers() {
        return userService.getLegacyUsers();
    }
    @RequestMapping(value = "/query1", method = RequestMethod.GET)
    public List<Query1> query1() {
        return userService.query1();
    }
    @RequestMapping(value = "/query3", method = RequestMethod.GET)
    public List<Employee> query3() {
        return userService.query3();
    }
    @RequestMapping(value = "/query4", method = RequestMethod.GET)
    public List<Employee> query4() {
        return userService.query4();
    }
    @RequestMapping(value = "/query5", method = RequestMethod.GET)
    public List<Query5> query5() {
        return userService.query5();
    }
    @RequestMapping(value = "/query6", method = RequestMethod.GET)
    public List<Query6> query6() {
        return userService.query6();
    }
	 
	 
}