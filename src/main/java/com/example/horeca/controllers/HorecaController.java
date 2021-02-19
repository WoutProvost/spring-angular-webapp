package com.example.horeca.controllers;

import com.example.horeca.domain.Horeca;
import com.example.horeca.services.HorecaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HorecaController {
	
	@Autowired
	private HorecaService service;

	// Get all establishments, with support for pagination
	// curl -s -X GET "localhost:8080/" -H "Accept: application/json"
	@GetMapping("/")
	public Page<Horeca> getAll(Pageable pageable) {
		return service.getAll(pageable);
	}

	// Add a score between 1 and 5 to an establishment identified by id
	// curl -s -X POST "localhost:8080/score" -H "Accept: application/json" -H "Content-Type: application/json" -d '{"id":1,"score":"5"}'
	@PostMapping("/score")
	public void addScore(@RequestBody Score score) {
		service.addScore(score.getId(), score.getScore());
	}
}