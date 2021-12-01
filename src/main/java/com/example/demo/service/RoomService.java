package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.PriceDto;
import com.example.demo.entity.Catalog;
import com.example.demo.entity.Room;
import com.example.demo.entity.User;

@Service
public class RoomService { 
	@Autowired
	RoomRepo RoomRepo;
	@Autowired
	UserRepo userRepo;
	@Autowired
	CatalogRepo catalogRepo;
	
	public void addNewRoom (Room room,int catalogID,int userID) {
		Room newRoom=room;
		newRoom.setUser(userRepo.findById(userID));
		 newRoom.setCatalog(catalogRepo.findById(catalogID));
		RoomRepo.save(newRoom);
		
	}

	public List<Catalog>getAllCatalog(){
		
		return catalogRepo.findAll();
	}
	
	public Optional <Room> getRoomById(int id){
	
	return RoomRepo.findById(id);
	}

	public void AddNewUser(User user) {
	userRepo.save(user); 
	}
	
	public void AddNewCatalog(Catalog catalog) {
	catalogRepo.save(catalog); 
	}
	
	public void editPrice(PriceDto ob) {
	Catalog newCatalog=	catalogRepo.findById(ob.getId());
				newCatalog.setPricePerNight(ob.getNewPrice());
				catalogRepo.save(newCatalog);
				}

  public void deleteRoomById(int id) {
	RoomRepo.deleteById(id);
	}
	

  public void deleteCatalogById(int id) {
	catalogRepo.deleteById(id);
	
  }

}

