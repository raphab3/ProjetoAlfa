package com.projetoalfa.domain.dto;

import java.io.Serializable;

import com.projetoalfa.domain.Sector;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class SectorDTO implements Serializable {  
	private static final long serialVersionUID = 1L;  
	
	private Integer id;
	private String nome;
	private String email;
	
	public SectorDTO() {
	}

	public SectorDTO(Sector obj) {
		id = obj.getId();
		nome = obj.getName();
		email = obj.getEmail();
	}

	
	
	
	
}
