package com.projetoalfa.domain.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class SectorNewDTO implements Serializable {  
	private static final long serialVersionUID = 1L; 
	
	private String name;
	private String cod;
	private Date email;
	
//	private Integer codRespon;
//	private String nameRespon;
//	private String emailRespon;
//	
//	private String nome;
//	private String content;
//	private Date date;
	
	public SectorNewDTO() {
	}

	
	
	
}
