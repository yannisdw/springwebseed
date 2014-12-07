package be.dewolf.springwebseed.controller;


import java.util.List;

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
  
    /**
    * Request mapping for user
    */
    @RequestMapping(value = "users", method = RequestMethod.GET)
    public ModelAndView getUsersView() {
        ModelAndView mv= new ModelAndView("usersView");
        mv.addObject("usersModel", userService.findAll());
        return mv;
    }
     
    /**
    * Rest web service
    */
    @RequestMapping(value = "/usersList", method = RequestMethod.GET)
    public @ResponseBody List<User> getUsersRest() {
        return userService.findAll();
    }
}