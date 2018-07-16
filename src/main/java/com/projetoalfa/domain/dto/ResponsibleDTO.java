package com.projetoalfa.domain.dto;

import java.io.Serializable;
import java.util.List;

import com.projetoalfa.domain.Sector;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ResponsibleDTO implements Serializable {  
	private static final long serialVersionUID = 1L;  
	
	private Integer id;
	private Integer cod;
	private String name;
	private String email;
	
	private List<Sector> sectors;
	
	public ResponsibleDTO() {
	}

	public ResponsibleDTO(Integer id, Integer cod, String name, String email) {
		super();
		this.id = id;
		this.cod = cod;
		this.name = name;
		this.email = email;
	}	
	
}
