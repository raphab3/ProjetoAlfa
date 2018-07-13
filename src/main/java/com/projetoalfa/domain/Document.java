package com.projetoalfa.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Document implements Serializable {  
	private static final long serialVersionUID = 1L;   
	
	@Id  
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private long id;
	
	private String nome;
	private String content;
	private Date date;
	
	@JsonIgnoreProperties("responsible")
	@OneToOne
	@JoinColumn(name="sector_id")
	private Sector sector;
	
	
	public Document() {
	}

	public Document(long id, String nome, String content, Date date, Sector sector, User user) {
		this.id = id;
		this.nome = nome;
		this.content = content;
		this.date = date;
		this.sector = sector;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public Sector getSector() {
		return sector;
	}

	public void setSector(Sector sector) {
		this.sector = sector;
	}

	
}
