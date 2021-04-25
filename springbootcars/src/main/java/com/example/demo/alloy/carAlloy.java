package com.example.demo.alloy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.handbreak.carRepository;
import com.example.demo.Model.car;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class carAlloy {
	
	@Autowired
	carRepository carRespository;
	
	
	@GetMapping("//carslist")
	public List<car> listofcars() {
		return carRespository.findAll();
		
	}
}

