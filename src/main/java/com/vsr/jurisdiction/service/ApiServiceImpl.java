package com.vsr.jurisdiction.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.vsr.jurisdiction.entity.Jurisdiction;
import com.vsr.jurisdiction.repository.JurisdictionRepository;

@Service
public class ApiServiceImpl implements ApiService {

    @Autowired
    JurisdictionRepository jurisdictionRepository;

	Logger log = LogManager.getLogger() ;
	@Override
	public Jurisdiction create(Jurisdiction jurisdiction) {
		log.info("Inside create method.(ApiServiceImpl)........!");
		return jurisdictionRepository.save(jurisdiction);
	}

	@Override
	public List<Jurisdiction> getData() {
		log.info("Inside getData method.(ApiServiceImpl)........!");
		return new ArrayList<Jurisdiction>(Arrays.asList( new Jurisdiction()));
	}

	@Override
	public Jurisdiction getDataById(int id) {
		log.info("Inside getDataById method.(ApiServiceImpl)........!");
		return new Jurisdiction();
	}

	@Override
	public Jurisdiction updateById(int id, Jurisdiction jurisdiction) {
		log.info("Inside updateById method.(ApiServiceImpl)........!");
		return new Jurisdiction();
	}

	@Override
	public Jurisdiction delete(int id) {
		log.info("Inside delete method.(ApiServiceImpl)........!");
		return new Jurisdiction();
	}

}
