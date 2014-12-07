package be.dewolf.springwebseed.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;

import be.dewolf.springwebseed.model.User;

@Component
public class UserService {

    public List<User> findAll() {
	
	String familienamen [] = {"de wolf", "huygh", "melsens", "tirry", "van dooren", "wauters"};
	
	Stream<User> map = Arrays.asList(familienamen).stream().map(t -> { 
		User u = new User();
		u.setFamilyName(t);
		return u;
	});
	return map.collect(Collectors.toList());
    }

}
