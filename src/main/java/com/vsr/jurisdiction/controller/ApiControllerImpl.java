package com.vsr.jurisdiction.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
	
	Logger log = LogManager.getLogger() ;

	@Override
	public ResponseEntity<Jurisdiction> create(Jurisdiction jurisdiction) {
		log.info("Inside create method.(ApiControllerImpl)........!");
		return new ResponseEntity(service.create(jurisdiction), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<Jurisdiction>> getData() {
		log.info("Inside getData method.(ApiControllerImpl)........!");
		return new ResponseEntity(service.getData(), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Jurisdiction> getDataById(int id) {
		log.info("Inside getDataById method.(ApiControllerImpl)........!");
		return new ResponseEntity(service.getDataById(id), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Jurisdiction> updateById(int id, Jurisdiction jurisdiction) {
		log.info("Inside updateById method.(ApiControllerImpl)........!");
		return new ResponseEntity(service.updateById(id, jurisdiction), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Jurisdiction> delete(int id) {
		log.info("Inside delete method.(ApiControllerImpl)........!");
		return new ResponseEntity(service.delete(id), HttpStatus.OK);
	}

}
