package com.projetoalfa.domain.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DocumentNewDTO {
	
	private String nome;
	private String content;
	private Date date;
	
	private String nameSector;
	private Integer cod;
	private String email;
	
	private Integer codRespo;
	private String name;
	private String emailRespo;
	
	public DocumentNewDTO() {
	}

	
	
	
}
