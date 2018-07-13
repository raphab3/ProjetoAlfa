package com.projetoalfa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoalfa.domain.Document;
import com.projetoalfa.repositories.DocumentRepository;

@Service
public class DocumentService {
	
	@Autowired
	private DocumentRepository repo;
	
	public Document buscar(Integer id) {
		Document obj = repo.findOne(id);
		return obj;
	}
}
