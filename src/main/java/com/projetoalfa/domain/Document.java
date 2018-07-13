package com.projetoalfa.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Document implements Serializable {  
	private static final long serialVersionUID = 1L;   
	
	@Id  
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Integer id;
	
	private String nome;
	private String content;
	private Date date;
	
	
	@ManyToMany(mappedBy="documents")
	private List<Sector> sectors = new ArrayList<>();
	
	
	public Document() {
	}

	public Document(Integer id, String nome, String content, Date date) {
		this.id = id;
		this.nome = nome;
		this.content = content;
		this.date = date;
		
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

	public List<Sector> getSector() {
		return sectors;
	}

	public void setSector(List<Sector> sector) {
		this.sectors = sector;
	}
	
}
