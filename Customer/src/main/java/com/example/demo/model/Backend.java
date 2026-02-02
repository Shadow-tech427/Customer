package com.example.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.annotation.Nonnull;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("backend")
public class Backend extends Developer {

	@JsonFormat
	private List<String> frameworks;

	@Nonnull
	private float bonus;

	public Backend() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Backend(List<String> frameworks, float bonus) {
		super();
		this.frameworks = frameworks;
		this.bonus = bonus;
	}

	public List<String> getFrameworks() {
		return frameworks;
	}

	public void setFrameworks(List<String> frameworks) {
		this.frameworks = frameworks;
	}

	public float getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Backend [frameworks=" + frameworks + ", bonus=" + bonus + "]";
	}

}
