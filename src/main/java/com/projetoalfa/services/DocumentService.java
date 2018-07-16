package com.projetoalfa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projetoalfa.domain.Document;
import com.projetoalfa.domain.dto.DocumentDTO;
import com.projetoalfa.domain.dto.DocumentNewDTO;
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
	@Transactional
	public Document insert(Document obj) {
		obj.setId(null);
		return repo.save(obj);
	}
	
//	DTO
	
	public List<Document> findAll(){
		return repo.findAll();
	}
	
	public Document fromDTO(DocumentDTO objDto) {
		return new Document(null, objDto.getNome(), objDto.getContent(), objDto.getDate());
	}
	
	public Document fromDTO(DocumentNewDTO objDto) {
		Document doc = new Document(null, objDto.getName(), objDto.getContent(), objDto.getDate());
		return doc;
	}
	
}
