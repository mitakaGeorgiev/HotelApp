package com.example.demo.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Room;

public interface RoomRepo extends JpaRepository<Room,Integer>{
	
	
	
}
