package com.projetoalfa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoalfa.domain.Document;
import com.projetoalfa.repositories.DocumentRepository;
import com.projetoalfa.services.exceptions.ObjectNotFoundException;

@Service
public class DocumentService {
	
	@Autowired
	private DocumentRepository repo;
	
	public Document buscar(Integer id) {
		Document obj = repo.findOne(id);
		if(obj == null) {
			throw new ObjectNotFoundException("Object NotFound! id: " + id
					+ ", Tipo: " + Document.class.getName());
		}
		return obj;
	}
	
	public Document insert(Document obj) {
		obj.setId(null);
		return repo.save(obj);
	}
	
//	DTO
	
	
	public List<Document> findAll(){
		return repo.findAll();
	}
}
