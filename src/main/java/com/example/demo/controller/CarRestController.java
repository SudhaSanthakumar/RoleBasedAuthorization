package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Car;
import com.example.demo.service.CarService;

@RestController
@RequestMapping("/v1")
public class CarRestController {
	
	@Autowired
	CarService carservice;
	
	@GetMapping("/cars")
	public ResponseEntity<List<Car>> getAllCars() {
		return ResponseEntity.ok().body(carservice.findAllCars());
		
	}
	
	@GetMapping("/cars/owned")
	@PostFilter("filterObject.owner==authentication.name")
	public List<Car> getCarsOwnedBy() {
		return carservice.findAllCars();
		
	}
	
	@PostMapping("/cars")
	public ResponseEntity<Car> saveCars(@RequestBody Car newCar,Authentication auth) {
		System.out.println(newCar.getCarName()+"  "+auth.getName());
		return ResponseEntity.status(HttpStatus.CREATED).body((carservice.saveCar(newCar)));
		
	}
	
	@GetMapping("/cars/{id}")
	public ResponseEntity<Car> getCarById(@PathVariable("id") int carId) {
		return ResponseEntity.ok().body(carservice.findCarById(carId).get());
		
	}
	
	@PutMapping("/cars/{id}")
	public ResponseEntity<Car> updateCar(@PathVariable("id") int carId,@RequestBody Car newCar) {
		return ResponseEntity.ok().body(carservice.updateCar(carId,newCar));
		
	}
	
	@DeleteMapping("/cars/{id}")
	public ResponseEntity<Object> deleteCar(@PathVariable("id") int carId) {
		 carservice.deleteCar(carId);
		 return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		
	}
	
	@GetMapping("/cars/search")
	public ResponseEntity<?> userDetails(Authentication auth, @RequestParam("cname") String cName) {
		System.out.println(auth.getName().toString());
		Car car=carservice.findByCarName(cName);
		if(car==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("car not found");
		}
		return ResponseEntity.ok().body(car);
		
	}
	

}
