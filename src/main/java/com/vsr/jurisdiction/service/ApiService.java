package com.vsr.jurisdiction.service;

import java.util.List;

import com.vsr.jurisdiction.entity.Jurisdiction;

public interface ApiService {

	Jurisdiction create(Jurisdiction jurisdiction);

	List<Jurisdiction> getData();

	Jurisdiction getDataById(int id);

	Jurisdiction updateById(int id, Jurisdiction jurisdiction);

	Jurisdiction delete(int id);

}
