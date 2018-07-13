package com.projetoalfa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoalfa.domain.Responsible;
import com.projetoalfa.repositories.ResponsibleRepository;
import com.projetoalfa.services.exceptions.ObjectNotFoundException;

@Service
public class ResponsibleService {
	
	@Autowired
	private ResponsibleRepository repo;
	
	public Responsible buscar(Integer id) {
		
		Responsible obj = repo.findOne(id);
		if(id == null) {
			throw new ObjectNotFoundException("Object NotFound! id: " + id
					+ ", Tipo: " + Responsible.class.getName());
		}
		return obj;
	}
}
