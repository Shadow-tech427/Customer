package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.DeveloperRepository;
import com.example.demo.model.Developer;

@Service
public class DeveloperServiceImpl implements DeveloperService {

	@Autowired
	private DeveloperRepository dr;
//	List<Developer> lsit = dr.findAll();

	@Override
	public void add(Developer developer) {
		// TODO Auto-generated method stub
		dr.save(developer);
	}

	@Override
	public List<Developer> display() {
		// TODO Auto-generated method stub
		return dr.findAll();
	}

	@Override
	public Developer search(Integer id) {
		// TODO Auto-generated method stub
		if (dr.findById(id).isPresent()) {
			Developer temp = dr.findById(id).get();
			return temp;
		}
		return null;
	}
	

	@Override
	public Developer delete(Integer id) {
		// TODO Auto-generated method stub
		if (dr.findById(id).isPresent()) {
			Developer temp = dr.findById(id).get();
			dr.deleteById(id);
			return temp;
		}
		return null;

	}

}