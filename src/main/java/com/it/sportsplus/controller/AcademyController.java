package com.it.sportsplus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.it.sportsplus.models.Academy;
import com.it.sportsplus.repo.AcademyRepository;


@RestController
@RequestMapping("/academy")

public class AcademyController {
	@Autowired
	private AcademyRepository academyRepository;
	
	@PostMapping("/add")
	public Academy addAcademy(@RequestBody Academy academy) {
		Academy persistedAcademy= academyRepository.save(academy);
		return persistedAcademy;
	}
	
	@GetMapping("/getAll")
	public List<Academy> getAll(){
		List<Academy> academies=academyRepository.findAll();
		return academies;
		
	}

}
