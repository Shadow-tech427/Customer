package com.example.demo.model;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "dtype", discriminatorType = DiscriminatorType.STRING)

public class Developer {

	@Id
	private Integer id;
	private String name;
	private Float exp;
	private String techStack;
	private String projectName;

	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Developer(Integer id, String name, Float exp, String techStack, String projectName) {
		super();
		this.id = id;
		this.name = name;
		this.exp = exp;
		this.techStack = techStack;
		this.projectName = projectName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getExp() {
		return exp;
	}

	public void setExp(Float exp) {
		this.exp = exp;
	}

	public String getTechStack() {
		return techStack;
	}

	public void setTechStack(String techStack) {
		this.techStack = techStack;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@Override
	public String toString() {
		return "Developer [id=" + id + ", name=" + name + ", exp=" + exp + ", techStack=" + techStack + ", projectName="
				+ projectName + "]";
	}

}
