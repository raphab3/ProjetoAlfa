package com.projetoalfa.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Sector implements Serializable {  
	private static final long serialVersionUID = 1L;
	
	@Id  
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private Integer cod;
	private String email;
	
	
	@OneToOne(cascade=CascadeType.ALL, mappedBy="sector")
	private Responsible responsible;
	
//	@JsonIgnore
//	@ManyToMany
//	@JoinTable(name= "sector_documents",
//			joinColumns = @JoinColumn(name="sector_id"),
//			inverseJoinColumns = @JoinColumn(name = "document_id")
//			)
	@JsonIgnore
	@ManyToMany(mappedBy="sectors")
	private List<Document> documents = new ArrayList<>();
	
	public Sector() {
	}

	public Sector(Integer id, String name, Integer cod, String email){
		this.id = id;
		this.name = name;
		this.cod = cod;
		this.email = email;
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
