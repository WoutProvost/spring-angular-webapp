package com.example.horeca.controllers;

public class Score {

	private long id;
	private byte score;

	// Default constructor required by framework
	public Score() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public byte getScore() {
		return score;
	}

	public void setScore(byte score) {
		this.score = score;
	}	
}