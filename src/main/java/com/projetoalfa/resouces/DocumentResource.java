package com.projetoalfa.resouces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projetoalfa.domain.Document;
import com.projetoalfa.services.DocumentService;

@RestController
@RequestMapping(value="/documents")
public class DocumentResource {
	
	@Autowired
	private DocumentService service;
	
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Document obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
}
