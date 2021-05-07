package com.cts.training.UserDemo.resource;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.UserDemo.exception.UserNotFoundException;
import com.cts.training.UserDemo.model.User;
import com.cts.training.UserDemo.repository.UserRepository;

@RestController
@RequestMapping("/api")
public class UserResource {
	
	@Autowired
	private UserRepository repo;
	
	@GetMapping("/users")
	public List<User> getAllUser(){
		return repo.findAll();
		
	}
	
	@GetMapping("/users/{id}")
	public Optional<User> userById(@PathVariable Long id) {
		Optional<User> user = repo.findById(id);
		if(!user.isPresent())
			throw new UserNotFoundException("The user with id-"+id +"does not exist");
		return user;
	}
	
	@DeleteMapping("/users/delete/{id}")
	public String deleteUserById(@PathVariable Long id) {
		Optional<User> user = repo.findById(id);
		if(!user.isPresent()) {
			throw new UserNotFoundException("The user with id-"+id +"does not exist");
		}
		repo.deleteById(id);
		return "User Deleted Successfully" ;
		
	}
	
	@PostMapping("/user")
	public String createUser(@Valid @RequestBody User user) {
		repo.save(user);
		return "User Saved Successfully";
	}

	@PutMapping("/user/update")
	public String updateUser(@Valid @RequestBody User user) {
		repo.save(user);
		return "User Updated Successfully";
		
		
	}

	@PutMapping("/user/update/{id}")
	public ResponseEntity<?> updateUser(@RequestBody User user, @PathVariable Long id){
		Optional<User> updateUser = repo.findById(id);
		if(!updateUser.isPresent())
			throw new UserNotFoundException("The user with id-"+id+" does not exist");
		repo.save(user);
		return ResponseEntity.noContent().build();
		
	}
}
