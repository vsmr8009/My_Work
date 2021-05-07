package com.cts.training.sb.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.sb.exception.SkillNotFoundException;
import com.cts.training.sb.model.Skill;
import com.cts.training.sb.repository.SkillRepository;

@RestController
@RequestMapping("/api")
public class SkillController {
	
	@Autowired
	private SkillRepository skillRepo;
	
	@GetMapping("/skills")
	public List<Skill> getAllSkills(){
		return skillRepo.findAll();
		
	}
	
	@GetMapping("/skills/{id}")
	public Optional<Skill> getSkillById(@Valid @PathVariable Long id) {
		Optional<Skill> skill = skillRepo.findById(id);
		if(!skill.isPresent())
			throw new SkillNotFoundException("The skill with id-"+id +"does not exist");
		return skill;
		
	}
	
	@PostMapping("/skill/create")
	public String createSkill(@RequestBody Skill skill) {
		skillRepo.save(skill);
		return "Skill added successfully";
	}
	
	@DeleteMapping("/skill/delete/{id}")
	public String deleteSkillById(@Valid @PathVariable Long id) {
		Optional<Skill> skill = skillRepo.findById(id);
		if(!skill.isPresent())
			throw new SkillNotFoundException("The user with id-"+id +"does not exist");
		skillRepo.deleteById(id);
		return "Skill deleted Successfully";
	}
	
	@PutMapping("/skill/update/{id}")
	public String updateSkill(@Valid @RequestBody Skill skill, @PathVariable Long id){
		Optional<Skill> updateskill = skillRepo.findById(id);
		if(!updateskill.isPresent())
			throw new SkillNotFoundException("The user with id-"+id +"does not exist");
		skillRepo.save(skill);
		return "Skill Updated successfully";
	}
}
