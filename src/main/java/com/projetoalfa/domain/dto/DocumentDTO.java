package com.projetoalfa.domain.dto;

import java.io.Serializable;
import java.util.Date;

import com.projetoalfa.domain.Document;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DocumentDTO implements Serializable {  
	private static final long serialVersionUID = 1L;  
	
	private Integer id;
	private String nome;
	private String content;
	private Date date;
	
	public DocumentDTO() {
	}

	public DocumentDTO(Document obj) {
		id = obj.getId();
		nome = obj.getNome();
		content = obj.getContent();
		date = obj.getDate();
	}

	
	
	
	
}
