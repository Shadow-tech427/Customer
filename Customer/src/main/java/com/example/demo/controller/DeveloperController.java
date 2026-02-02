package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Backend;
import com.example.demo.model.Developer;
import com.example.demo.model.FrontEnd;
import com.example.demo.service.DeveloperService;

@RestController
public class DeveloperController {

	@Autowired
	private DeveloperService ds;

	@PostMapping("add/frontend")
	public void addFrontend(@RequestBody FrontEnd f) {
		ds.add(f);
	}

	@PostMapping("add/backend")
	public void addBackend(@RequestBody Backend b) {
		ds.add(b);
	}

	@GetMapping("display")
	public void display(@RequestBody Developer d) {
		ds.add(d);
	}

	@PostMapping("search/{id}")
	public ResponseEntity<?> search(@PathVariable Integer id) {
		Developer temp = ds.search(id);
		if (temp == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not Found");
		}

		return ResponseEntity.ok(temp);
	}

	@DeleteMapping("delete/id")
	public ResponseEntity<?> delete(@PathVariable Integer id) {
		Developer temp = ds.delete(id);
		if (temp == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not Found");
		}
		return ResponseEntity.ok(temp);
	}
}


