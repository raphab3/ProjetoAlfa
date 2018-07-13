package com.projetoalfa.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Sector implements Serializable {  
	private static final long serialVersionUID = 1L;
	
	@Id  
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer cod;
	private String email;
	
	
	@OneToOne(cascade=CascadeType.ALL, mappedBy="sector")
	private Responsible responsible;
	
	@JsonIgnore
	@ManyToMany
	@JoinTable(name= "sector_documents",
			joinColumns = @JoinColumn(name="sector_id"),
			inverseJoinColumns = @JoinColumn(name = "document_id")
			)
	private List<Document> documents = new ArrayList<>();
	
	public Sector() {
	}

	public Sector(Integer id, Integer cod, String email, Responsible responsible) {
		this.id = id;
		this.cod = cod;
		this.email = email;
		this.responsible = responsible;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}

	public Responsible getResponsible() {
		return responsible;
	}

	public void setResponsible(Responsible responsible) {
		this.responsible = responsible;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sector other = (Sector) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
