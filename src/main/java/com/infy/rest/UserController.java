package com.infy.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.dto.UserDTO;
import com.infy.service.Service;

@CrossOrigin(origins = "http://localhost:3003")
@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private Service userservice;
	
    @PostMapping("/register")
 //  public ResponseEntity<String> registerUser(@RequestBody UserDTO userdto) {
   public String registerUser(@RequestBody UserDTO userdto) {
    	String id= userservice.addUser(userdto);
 	return id;
        // Your logic to handle user registration
//    return new ResponseEntity<>("its working", HttpStatus.OK);
    }
       
//    @GetMapping("/abc")
//    public String getData()
//    {
//    	
//    	
//    	return "its working";
//    
//    }

}
