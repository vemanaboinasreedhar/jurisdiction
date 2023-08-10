package com.vsr.jurisdiction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.vsr.jurisdiction.entity.Jurisdiction;
import com.vsr.jurisdiction.service.ApiService;

@RestController
public class ApiControllerImpl implements ApiController {
	
	@Autowired
	private ApiService service;

	@Override
	public ResponseEntity<Jurisdiction> create(Jurisdiction jurisdiction) {
		
		return new ResponseEntity(service.create(jurisdiction), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<Jurisdiction>> getData() {
		
		return new ResponseEntity(service.getData(), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Jurisdiction> getDataById(int id) {
		
		return new ResponseEntity(service.getDataById(id), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Jurisdiction> updateById(int id, Jurisdiction jurisdiction) {
		
		return new ResponseEntity(service.updateById(id, jurisdiction), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Jurisdiction> delete(int id) {
		
		return new ResponseEntity(service.delete(id), HttpStatus.OK);
	}

}
