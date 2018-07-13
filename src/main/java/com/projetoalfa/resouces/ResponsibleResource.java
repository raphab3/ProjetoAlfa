package com.projetoalfa.resouces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projetoalfa.domain.Responsible;
import com.projetoalfa.services.ResponsibleService;

@RestController
@RequestMapping(value="/responsibles")
public class ResponsibleResource {
	
	@Autowired
	private ResponsibleService service;
		
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Responsible obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
}
