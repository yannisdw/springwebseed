package be.dewolf.springwebseed.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import be.dewolf.springwebseed.model.User;

@Component
public class UserService {

    public List<User> findAll() {
	return new ArrayList<User>();
    }

}
