package com.example.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("frontend")
public class FrontEnd extends Developer{

	@JsonFormat
	private List<String> frameworks;
	
	public FrontEnd() {
		super();
	}

	public FrontEnd(List<String> frameworks) {
		super();
		this.frameworks = frameworks;
	}

	public List<String> getFrameworks() {
		return frameworks;
	}

	public void setFrameworks(List<String> frameworks) {
		this.frameworks = frameworks;
	}

	@Override
	public String toString() {
		return "FrontEnd [frameworks=" + frameworks + "]";
	}
	
}
