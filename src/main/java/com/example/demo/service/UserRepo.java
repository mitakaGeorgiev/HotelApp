package com.example.demo.service;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.User;

public interface UserRepo extends JpaRepository<User,Integer>{
User findById(int id);
Optional <User> findByUserName(String userName);
}
