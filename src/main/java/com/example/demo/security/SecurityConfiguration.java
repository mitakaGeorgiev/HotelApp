package com.example.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
@Autowired
UserDetailsService userDetailsService;
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth.userDetailsService(userDetailsService);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		// TODO Auto-generated method stub
		http.authorizeRequests()
		.antMatchers("/admin").hasRole("ADMIN")
		.antMatchers("/user").hasRole("USER")
		.antMatchers("/").permitAll()
		.antMatchers("/addnewroom/{catalogID}/{userID}").hasRole("USER")
		.antMatchers("/getallcatalog").hasRole("USER")
		.antMatchers("/addnewcatalog").hasRole("ADMIN")
		.antMatchers("/editprice").hasRole("ADMIN")
		.antMatchers("/getroombyid/{id}").hasRole("ADMIN")
		.antMatchers("/addnewuser").hasRole("ADMIN")
		.antMatchers("/deleteroombyid/{id}").hasRole("ADMIN")
		.antMatchers("/deletecatalogbyid/{id}").hasRole("ADMIN")
		.and().formLogin();
	
		http.csrf().disable();
	}
@Bean
	public PasswordEncoder getPasswordEncoder() {return NoOpPasswordEncoder.getInstance();}
	
}
