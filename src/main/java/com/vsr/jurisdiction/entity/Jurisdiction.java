package com.vsr.jurisdiction.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Jurisdiction")
public class Jurisdiction {
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="jurisdiction_id")
	private String jurisdictionId;
	
	@Column(name="description")
	private String description;
	
	@Column(name="country")
	private String country;
	
	@Column(name="state")
	private String state;
	
	@Column(name="city")
	private String city;
	
	@Column(name="is_active")
	private boolean isActive;
	
	@Column(name="is_default")
	private boolean isDefault;

}
