package com.piggyBankBE.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Hint {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String hintList;
	
	private String comment;

	public Hint() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hint(Integer id, String hintList) {
		super();
		this.id = id;
		this.hintList = hintList;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getHintList() {
		return hintList;
	}

	public void setHintList(String hintList) {
		this.hintList = hintList;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	
	
	
}
