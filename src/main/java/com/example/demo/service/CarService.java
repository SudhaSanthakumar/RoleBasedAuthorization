package com.example.demo.service;


import org.springframework.stereotype.Service;

import com.example.demo.model.Car;
import com.example.demo.repo.CarRepository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CarService implements ICarService{

	@Autowired
	private CarRepository carRepo;
	
	
	public List<Car> findAllCars() {
		return carRepo.findAll();
	}


	public Optional<Car> findCarById(int id) {
		return carRepo.findById(id);
	}
	
	public Car findByCarName(String CarName) {
		
		Car Car=carRepo.findByCarName(CarName);
		
		return Car;
		
	}
	
	public Car saveCar(Car newCar) {
		
		Car Car=carRepo.save(newCar);
		return Car;
		
	}

	public Car updateCar(int id,Car car) {
		
		Optional<Car> retrievedCar=carRepo.findById(id);
		
		if(retrievedCar==null)
			try {
				throw new Exception("Car not found");
			} catch (Exception e) {
				e.printStackTrace();
			}
		carRepo.save(car);
		return carRepo.findById(id).get();
		
	}
	
	public Car deleteCar(int CarId) {
		
		Optional<Car> retrievedCar=carRepo.findById(CarId);
		if(retrievedCar==null)
			try {
				throw new Exception("Car not found");
			} catch (Exception e) {
				e.printStackTrace();
			}
		carRepo.deleteById(CarId);
		return retrievedCar.get();
		
		
		
	}

	

	







//	public void autoLogin(String CarName, String password) {
//		
//		CarDetails CarDetails=CarDetailsService.loadCarByCarname(CarName);
//		CarnamePasswordAuthenticationToken token= new CarnamePasswordAuthenticationToken(CarDetails,password,CarDetails.getAuthorities());
//		
//		authenticationManager.authenticate(token);
//		
//		if(token.isAuthenticated()) {
//			SecurityContextHolder.getContext().setAuthentication(token);
//		}
//				
//	}


//	@Autowired
//	private AuthenticationManager authenticationManager;
	
//	@Autowired
//	private CarDetailsService CarDetailsService;

	
	
	
}
