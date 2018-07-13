package com.projetoalfa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoalfa.domain.Responsible;
import com.projetoalfa.repositories.ResponsibleRepository;

@Service
public class ResponsibleService {
	
	@Autowired
	private ResponsibleRepository repo;
	
	public Responsible buscar(Integer id) {
		Responsible obj = repo.findOne(id);
		return obj;
	}
}
