package com.vsr.jurisdiction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vsr.jurisdiction.entity.Jurisdiction;

public interface JurisdictionRepository extends JpaRepository<Jurisdiction, Integer> {

}
