package com.projetoalfa.domain.dto;

import java.io.Serializable;
import java.util.Date;

import com.projetoalfa.domain.Document;

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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
}
