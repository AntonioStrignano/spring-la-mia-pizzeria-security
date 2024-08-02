package it.astrignano.pizzeria.model;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

public class Role {
	
	@Id
	private Integer id;
	
	@NotNull
	private String name;

	
	//getter e setter
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
