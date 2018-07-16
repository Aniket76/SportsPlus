package com.it.sportsplus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.it.sportsplus.models.Academy;
import com.it.sportsplus.models.Athlete;
import com.it.sportsplus.models.Coach;
import com.it.sportsplus.models.Group;
import com.it.sportsplus.repo.AcademyRepository;
import com.it.sportsplus.repo.AthleteRepository;
import com.it.sportsplus.repo.CoachRepository;
import com.it.sportsplus.repo.GroupRepository;


@RestController
@RequestMapping("/academy")

public class AcademyController {
	@Autowired
	private AcademyRepository academyRepository;
	private AthleteRepository athleteRepository;
	private GroupRepository groupRepository;
	private CoachRepository coachRepository;
	
	@PostMapping("/add")
	public Academy addAcademy(@RequestBody Academy academy) {
		Academy persistedAcademy= academyRepository.save(academy);
		return persistedAcademy;
	}
	
	@PutMapping("/update")
	public Academy updateAcademy(@RequestBody Academy academy) {
		Academy persistedAcademy=academyRepository.updateAcademy(academy);
		return persistedAcademy;
	}
	
	@GetMapping("/getAll")
	public List<Academy> getAllAcademy(){
		List<Academy> academies=academyRepository.findAll();
		return academies;
		
	}

	@DeleteMapping("/delete")
	public void deleteAcademy(@RequestBody Academy academy)
	{
		academyRepository.delete(academy);
	}
	
	@RequestMapping("/athlete")
	@PostMapping("/addAthlete")
	public Athlete addAthlete(@RequestBody Athlete athlete) {
		Athlete persistedAthlete= athleteRepository.save(athlete);
		return persistedAthlete;
	}
	
	@PutMapping("/updateAthlete")
	public Athlete updateAthlete(@RequestBody Athlete athlete) {
		Athlete persistedAthlete=athleteRepository.updateAthlete(athlete);
		return persistedAthlete;
	}
	
	@GetMapping("/getAllAthlete")
	public List<Athlete> getAllAthlete(){
		List<Athlete> athletes=athleteRepository.findAll();
		return athletes;
		
	}

	@DeleteMapping("/deleteAthlete")
	public void deleteAthlete(@RequestBody Athlete athlete)
	{
		athleteRepository.delete(athlete);
	}
	
	@RequestMapping("/group")
	@PostMapping("/addGroup")
	public Group addGroup(@RequestBody Group group) {
		Group persistedGroup= groupRepository.save(group);
		return persistedGroup;
	}
	
	@PutMapping("/updateGroup")
	public Group updateGroup(@RequestBody Group group) {
		Group persistedGroup=groupRepository.updateGroup(group);
		return persistedGroup;
	}
	
	@GetMapping("/getAll")
	public List<Group> getAllGroup(){
		List<Group> groups=groupRepository.findAll();
		return groups;
		
	}

	@DeleteMapping("/deleteGroup")
	public void deleteGroup(@RequestBody Group group)
	{
		groupRepository.delete(group);
	}
	
	@RequestMapping("/coach")
	@PostMapping("/addCoach")
	public Coach addCoach(@RequestBody Coach coach) {
		Coach persistedCoach= coachRepository.save(coach);
		return persistedCoach;
	}
	
	@PutMapping("/updateCoach")
	public Coach updateCoach(@RequestBody Coach coach) {
		Coach persistedCoach=coachRepository.updateCoach(coach);
		return persistedCoach;
	}
	
	@GetMapping("/getAll")
	public List<Coach> getAllCoach(){
		List<Coach> coaches=coachRepository.findAll();
		return coaches;
		
	}

	@DeleteMapping("/deleteCoach")
	public void deleteCoach(@RequestBody Coach coach)
	{
		coachRepository.delete(coach);
	}
}
