package com.vsr.jurisdiction.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vsr.jurisdiction.entity.Jurisdiction;

@RestController
@RequestMapping("/api/v1/jurisdiction")
public interface ApiController {
	
	@PostMapping("/data")
	public ResponseEntity<Jurisdiction> create(@RequestBody Jurisdiction jurisdiction);
	
	@GetMapping("/data")
	public ResponseEntity<List<Jurisdiction>> getData();
	
	@GetMapping("/data/id/{id}")
	public ResponseEntity<Jurisdiction> getDataById(@PathVariable int id);
	
	@PutMapping("/data/id/{id}")
	public ResponseEntity<Jurisdiction> updateById(@PathVariable int id, @RequestBody Jurisdiction jurisdiction);
	
	@DeleteMapping("/data/id/{id}")
	public ResponseEntity<Jurisdiction> delete(@PathVariable int id);
}
