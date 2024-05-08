package com.piggyBankBE.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.piggyBankBE.domain.Hint;
import com.piggyBankBE.repo.HintRepo;

@Service
public class HintService {
	
	private HintRepo repo;
	
	
	public HintService(HintRepo repo) {
		super();
		this.repo = repo;
	}




	public ResponseEntity<Hint> createHint(Hint newHint) {
		Hint created = this.repo.save(newHint);
		return new  ResponseEntity<Hint>(created, HttpStatus.CREATED);
	}




	public List<Hint> getHint() {
		return this.repo.findAll();
	}


	public ResponseEntity<Hint> getHint(int id) {
		Optional<Hint> found = this.repo.findById(id);

		if (found.isEmpty()) {
			return new ResponseEntity<Hint>(HttpStatus.NOT_FOUND);
		}

		Hint body = found.get();

		return ResponseEntity.ok(body);
	}
	
	

	public boolean deleteHint(int id) {
		this.repo.deleteById(id);
		return !this.repo.existsById(id);
	}




	public ResponseEntity<Hint> updateHint(int id, Hint newHint) {
		Optional<Hint> found = this.repo.findById(id);

		if (found.isEmpty()) {

			return new ResponseEntity<Hint>(HttpStatus.NOT_FOUND);
		}
		
		Hint body = found.get();
		
		if (newHint.getHintList() != null)
			body.setHintList(newHint.getHintList());
		
		
		Hint updated = this.repo.save(body);

		return ResponseEntity.ok(updated);
	}




	

}
