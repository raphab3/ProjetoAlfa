package com.projetoalfa.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Entity 
@Getter @Setter
public class Responsible implements Serializable {  
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer id;
	private Integer cod;
	private String name;
	private String email;
	
	@JsonIgnore
	@OneToOne
	@JoinColumn(name="sector_id")
	@MapsId
	private Sector sector;
	
	public Responsible() {
	}

	public Responsible(Integer id, Integer cod, String name, String email, Sector sector) {
		this.id = id;
		this.cod = cod;
		this.name = name;
		this.email = email;
		this.sector = sector;
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
		Responsible other = (Responsible) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	

	
	
}
