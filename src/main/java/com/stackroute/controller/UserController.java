package com.stackroute.controller;


import com.stackroute.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Indicates this is a controller class
 */
/*
Controll the flow of the process
 */
@Controller
public class UserController {

    /**
     * RequestMapping annotation maps HTTP requests to handler methods
     */
    @RequestMapping("/")
    public String details() {
        /**Create the initial blank form*/
        return "details";
    }


    @RequestMapping(value = "/message")

    /**@RequestParam used to bind a web request parameter to the parameter of the handler method.*/
    public ModelAndView populateUser(@RequestParam("userName") String userName) {
        User user = new User();
        /**populate the data inside the User class using @RequestParam*/
        user.setName(userName);

        /**UserController will pass user object to view*/
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("user", user.getName());
        return modelAndView;
    }


}
