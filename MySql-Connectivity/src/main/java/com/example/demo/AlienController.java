package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.AlienRepo;
import com.example.demo.model.Alien;

@RestController
public class AlienController {
	
	@Autowired
	AlienRepo repo;

	@RequestMapping("/getAliensInfo")
	public List<Alien> getAliens() {
		
		return repo.findAll();
	}
	
	@RequestMapping("/getAlien/{aid}")
	public Optional<Alien> getAliens(@PathVariable int aid) {
		
		return repo.findById(aid);
	}
}
