package com.jplunge.springrestoauth2;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jplunge.springrestoauth2.config.WebConfig;


@CrossOrigin(origins = { "*" })
@RestController
@EnableResourceServer
@SpringBootApplication
public class SpringRestOauth2Application {

	@Autowired //to load CORS (CrossOrigin in a global manner) ... NOT WORKING
	private WebConfig webConfig;
	
	
	@RequestMapping("/validateUser")
	public Principal user(Principal user) {
		return user;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringRestOauth2Application.class, args);
	}

}
