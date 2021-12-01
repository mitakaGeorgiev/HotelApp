package com.example.demo.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Catalog;

public interface CatalogRepo extends JpaRepository<Catalog,Integer >{
	Catalog findById(int id);
}
