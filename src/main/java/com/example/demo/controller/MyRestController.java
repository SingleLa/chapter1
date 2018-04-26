package com.example.demo.controller;

import com.example.demo.domain.Customer;
import com.example.demo.domain.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2018/4/26.
 */
@RestController
@RequestMapping(value="/users")
public class MyRestController {
    @RequestMapping(value="/{user}", method= RequestMethod.GET)
    public User getUser(@PathVariable Long user) {
        return  null;
    }
    @RequestMapping(value="/{user}/customers", method=RequestMethod.GET)
    List<Customer> getUserCustomers(@PathVariable Long user) {
        return  null;
    }
    @RequestMapping(value="/{user}", method=RequestMethod.DELETE)
    public User deleteUser(@PathVariable Long user) {
        return  null;
    }
}