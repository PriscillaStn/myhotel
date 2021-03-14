package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserLegacyDao userLegacyDao;
 
    public List<Countries> getLegacyUsers() {
        return userLegacyDao.findAll();
    } 
    public List<Query1> query1() {
        return userLegacyDao.query1();
    }
    public List<Employee> query3() {
        return userLegacyDao.query3();
    }
    public List<Employee> query4() {
        return userLegacyDao.query4();
    }
    public List<Query5> query5() {
        return userLegacyDao.query5();
    }
    public List<Query6> query6() {
        return userLegacyDao.query6();
    }
 
}