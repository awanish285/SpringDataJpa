package com.awanish.springdatajpa.entites;

import javax.persistence.Entity;
import javax.persistence.Id;
//Entity Class

@Entity
public class Student {
	@Id
	private int id;
	private String name;
	private int testScore;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTestScore() {
		return testScore;
	}

	public void setTestScore(int testScore) {
		this.testScore = testScore;
	}

}
