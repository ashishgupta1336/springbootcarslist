package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.handbreak.carRepository;
import com.example.demo.Model.car;

@SpringBootApplication
public class SpringbootcarsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootcarsApplication.class, args);
	}
	@Autowired
	carRepository carRepository;
	
	@Override
	public void run(String...args) throws Exception{
		 carRepository.save(new car("AUDI","raj@gmail.com","123452324"));
		 carRepository.save(new car("BMW","sanjeev@gmail.com","9988774455"));
		 carRepository.save(new car("RANGE ROVER","bhavesh@gmail.com","9345333351"));
		 carRepository.save(new car("TESLA","ashish@gmail.com","123456789"));
		 carRepository.save(new car("MERCEDES BENZ","abhishek@gmail.com","7664573636"));
		 carRepository.save(new car("FERRARI GTC4","jayesh@gmail.com","133456789"));
	}

}



