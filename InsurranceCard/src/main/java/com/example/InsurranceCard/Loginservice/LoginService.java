package com.example.InsurranceCard.Loginservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.InsurranceCard.LoginDomain.Login;
import com.example.InsurranceCard.Loginreposotory.LoginRepository;

@Service
public class LoginService {
	@Autowired
	private LoginRepository repo;
	  
	  public Login login(String username, String password) {
	  Login user = repo.findByUsernameAndPassword(username, password);
	   return user;
	  }
}
