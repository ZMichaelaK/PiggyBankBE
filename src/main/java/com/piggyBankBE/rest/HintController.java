package com.piggyBankBE.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.piggyBankBE.domain.Hint;
import com.piggyBankBE.service.HintService;

@RequestMapping("/hint")
@CrossOrigin
//Marks this class as a REST controller
@RestController
public class HintController {
	
	private HintService service;

	
	
	public HintController(HintService service) {
		super();
		this.service = service;
	}



	@PostMapping("/create")
	public ResponseEntity<Hint> createHint(@RequestBody Hint newHint) {
		return this.service.createHint(newHint);
	}

	@GetMapping("/get")
	public List<Hint> getHint() {
		return this.service.getHint();
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Hint> getHint(@PathVariable int id) {
		return this.service.getHint(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public boolean deleteHint(@PathVariable int id) {
		return this.service.deleteHint(id);
		
	}
	
	@PatchMapping("/update/{id}")
	public ResponseEntity<Hint> updateHint(@PathVariable int id, @RequestBody Hint updateHint) {
		return this.service.updateHint(id, updateHint);

	}

}
