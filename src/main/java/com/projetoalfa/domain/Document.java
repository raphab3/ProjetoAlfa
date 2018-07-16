package com.projetoalfa.domain;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Document implements Serializable {  
	private static final long serialVersionUID = 1L;   
	
	
	@Id  
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Integer id;
	
	private String nome;
	private String content;
	private Date date;
	
	
//	@ManyToMany(mappedBy="documents")
	
	@ManyToMany
	@JoinTable(name= "sector_documents",
			joinColumns = @JoinColumn(name="sector_id"),
			inverseJoinColumns = @JoinColumn(name = "document_id")
			)
	private List<Sector> sectors = new ArrayList<>();
	
	
	public Document() {
	}

	public Document(Integer id, String nome, String content, Date date) {
		this.id = id;
		this.nome = nome;
		this.content = content;
		this.date = date;
		
	}

	
}
