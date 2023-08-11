package com.vsr.jurisdiction.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vsr.jurisdiction.entity.Jurisdiction;
import com.vsr.jurisdiction.repository.JurisdictionRepository;

@Service
public class ApiServiceImpl implements ApiService {
    @Autowired
    JurisdictionRepository jurisdictionRepository;
	@Override
	public Jurisdiction create(Jurisdiction jurisdiction) {
		
		return  jurisdictionRepository.save(jurisdiction);
	}

	@Override
	public List<Jurisdiction> getData() {
		
		return new ArrayList<Jurisdiction>(Arrays.asList( new Jurisdiction()));
	}

	@Override
	public Jurisdiction getDataById(int id) {
		
		return new Jurisdiction();
	}

	@Override
	public Jurisdiction updateById(int id, Jurisdiction jurisdiction) {
		
		return new Jurisdiction();
	}

	@Override
	public Jurisdiction delete(int id) {
		
		return new Jurisdiction();
	}

}
