package com.vsr.jurisdiction.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;

import com.vsr.jurisdiction.entity.Jurisdiction;

@Service
public class ApiServiceImpl implements ApiService {

	@Override
	public Jurisdiction create(Jurisdiction jurisdiction) {
		
		return new Jurisdiction() ;
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
