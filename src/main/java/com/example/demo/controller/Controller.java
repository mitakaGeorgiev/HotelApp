package com.example.demo.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.PriceDto;
import com.example.demo.entity.Catalog;
import com.example.demo.entity.Room;
import com.example.demo.entity.User;
import com.example.demo.service.RoomService;

@RestController
public class Controller {

	
	@Autowired
	RoomService roomService;
	
	
	@PostMapping ("/addnewroom/{catalogID}/{userID}")
	public void addNewRoom(@RequestBody Room room,@PathVariable int catalogID,@PathVariable int userID) {
		roomService.addNewRoom(room,catalogID,userID);
	}
	
	@GetMapping("/getallcatalog")
	public List<Catalog>getAllRooms(){
	return roomService.getAllCatalog();
	}
	
	
	@PostMapping("addnewcatalog")
	public void AddNewCatalog(@RequestBody Catalog catalog) {
		roomService.AddNewCatalog(catalog);
		
	}
	
	
	@PutMapping("/editprice")
	public void editPrice(@RequestBody PriceDto ob) {
		
		roomService.editPrice(ob);
	}
	
	@GetMapping("/getroombyid/{id}")
	public Optional<Room> GetRoomById(@PathVariable int id)
	{
		 return roomService.getRoomById(id);
	}
	
	@PostMapping("addnewuser")
	public void AddNewUser(@RequestBody User user) {
		roomService.AddNewUser(user);
		
	}
	
	
	@DeleteMapping("/deleteroombyid/{id}")
	public void deleteRoomById(@PathVariable int id) {
	
		roomService.deleteRoomById(id);
	}
	
	@DeleteMapping("/deletecatalogbyid/{id}")
	public void deleteCatalogById(@PathVariable int id) {
	
		roomService.deleteCatalogById(id);
	}
	
	@GetMapping("/")
	public String home() {
		return ("<h1>Welcome</h1>");
	}
	
	@GetMapping("/user")
	public String user () {
		return ("<h1>Welcome User</h1>");
	}
	@GetMapping("/admin")
	public String admin () {
		return ("<h1>Welcome Admin</h1>");
	}
	
}

	
