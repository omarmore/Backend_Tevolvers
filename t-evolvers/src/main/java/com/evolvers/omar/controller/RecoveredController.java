package com.evolvers.omar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evolvers.omar.models.Recovered;
import com.evolvers.omar.services.RecoveredService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")

public class RecoveredController {
	@Autowired
	private RecoveredService service ;
	
	@GetMapping("/recovery")
	public List<Recovered> listado(){
		return service.findAll();
	}
	
	@GetMapping("/recovery/{id}")
	public Recovered dato(@PathVariable Long id ) {
		return service.findById(id) ;
	}  
	
	@PostMapping("/recovery")
	public Recovered guardar(@RequestBody Recovered recoreved) {
		return service.save(recoreved);
	}
	 
	@DeleteMapping("/recovery/{id}")
	public void delete(@PathVariable Long id ) {
		service.delete(id);
	} 
}
