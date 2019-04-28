package com.giga.inventory.controller;


import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.giga.inventory.model.Person;
import com.giga.inventory.repository.PersonRepository;

@RestController
public class InventoryController {
	
	private static final Logger LOG = LoggerFactory.getLogger(InventoryController.class);
	
//	@Autowired
//	InventoryService inventoryService;
//	
//	@GetMapping(value = "/get-user-details/{userId}")
//	public ResponseEntity<Person> getUserDetail(@PathVariable("userId") String userId) {
//		try {
//			return new ResponseEntity<>(inventoryService.getUserDetail(userId), HttpStatus.OK);
//		} catch (Exception e) {
//			LOG.error("InventoryController :: generateUserDetails() exception {}", e);
//		}
//		return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//	}
//	
//	@PostMapping(value = "/add-user-details")
//	public ResponseEntity<Person> addUserDetail(HashMap<String,String> userDetail) {
//		try {
//			return new ResponseEntity<>(inventoryService.addUserDetail(userDetail), HttpStatus.CREATED);
//		} catch (Exception e) {
//			LOG.error("InventoryController :: generateUserDetails() exception {}", e);
//		}
//		return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//	}
	
	private PersonRepository personRepository;

    public InventoryController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/all")
    public List<Person> getAll() {
        return personRepository.findAll();
    }

}
