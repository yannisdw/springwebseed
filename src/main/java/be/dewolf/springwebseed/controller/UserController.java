package be.dewolf.springwebseed.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import be.dewolf.springwebseed.model.User;
import be.dewolf.springwebseed.service.UserService;
 
@Controller
public class UserController {
 
    @Autowired
    private UserService userService;

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    /**
    * Request mapping for user
    */
    @RequestMapping(value = "users", method = RequestMethod.GET)
    public ModelAndView getUsersView() {
        LOGGER.debug("getUsersView");

        ModelAndView mv= new ModelAndView("usersView");
        mv.addObject("usersModel", userService.findAll());
        return mv;
    }
     
    /**
    * Rest web service
    */
    @RequestMapping(value = "/usersList", method = RequestMethod.GET)
    public @ResponseBody List<User> getUsersRest() {
        LOGGER.debug("/usersList");
        return userService.findAll();
    }
}