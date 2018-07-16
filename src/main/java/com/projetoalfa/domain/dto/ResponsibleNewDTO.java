package com.projetoalfa.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ResponsibleNewDTO {
	
	private Integer cod;
	private String name;
	private String email;
	
	private Integer idSector;
	private Integer codSector;
	private String emailSector;
	
	public ResponsibleNewDTO() {
	}

	
	
	
}
