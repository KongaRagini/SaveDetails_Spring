package com.infy.service;

//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.infy.dto.UserDTO;
import com.infy.entiy.UserEntity;
import com.infy.repo.UserRepo;

@org.springframework.stereotype.Service
public class UserServiceImpl implements Service {


	@Autowired
	private UserRepo userRepo;
//	
//	@Autowired
//	private PasswordEncoder passwordEncoder;

	@Override
	public String addUser(UserDTO userdto) {
		// TODO Auto-generated method stub
		
		try
		{
		UserEntity user=new UserEntity(
				
				userdto.getId(),
				userdto.getEmail(),
				userdto.getUsername(),
				//this.passwordEncoder.encode(userdto.getPassword())
				userdto.getPassword()
				);
		userRepo.save(user);
		
		return "user created successfully";
	
		
	}
		catch(Exception e) {
			e.printStackTrace();
			return "error";
		}}
//	 UserDTO userDTO;
//	 @Override
//	    public LoginResponse loginUser(LoginDTO loginDTO) {
//	        String msg = "";
//	        UserEntity employee1 = userRepo.findByEmail(loginDTO.getEmail());
//	        if (employee1 != null) {
//	            String password = loginDTO.getPassword();
//	            String encodedPassword = employee1.getPassword();
//	            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
//	            if (isPwdRight) {
//	                Optional<UserEntity> user = userRepo.findOneByEmailAndPassword(loginDTO.getEmail(), encodedPassword);
//	                if (user.isPresent()) {
//	                    return new LoginResponse("Login Success", true);
//	                } else {
//	                    return new LoginResponse("Login Failed", false);
//	                }
//	            } else {
//	                return new LoginResponse("password Not Match", false);
//	            }
//	        }else {
//	            return new LoginResponse("Email not exits", false);
//	        }
//	    }
}
