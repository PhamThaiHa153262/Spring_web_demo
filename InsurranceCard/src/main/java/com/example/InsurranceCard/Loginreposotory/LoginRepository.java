package com.example.InsurranceCard.Loginreposotory;

import org.springframework.stereotype.Repository;

import com.example.InsurranceCard.LoginDomain.Login;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface LoginRepository extends JpaRepository<Login, Long>{
	Login findByUsernameAndPassword(String username, String password);

}
