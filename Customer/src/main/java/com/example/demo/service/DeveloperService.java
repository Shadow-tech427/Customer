package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Developer;
import com.example.demo.model.FrontEnd;

public interface DeveloperService {

	void add(Developer developer);

	List<Developer> display();
	
	Developer search(Integer id);

	Developer delete(Integer id);
}