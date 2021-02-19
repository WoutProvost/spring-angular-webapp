package com.example.horeca.domain;

import javax.persistence.Embeddable;

@Embeddable
public class Geometry {

	private String type;
	private double[] coordinates;

	// Default constructor required by framework
	public Geometry() {}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double[] getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(double[] coordinates) {
		this.coordinates = coordinates;
	}
}