package com.projetoalfa.resouces;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projetoalfa.domain.Sector;
import com.projetoalfa.domain.dto.SectorDTO;
import com.projetoalfa.services.SectorService;

@RestController
@RequestMapping(value="/sectors")
public class SectorResource {
	
	@Autowired
	private SectorService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Sector obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
	
	//DTO
	
		@RequestMapping(method=RequestMethod.GET)
		public ResponseEntity<List<SectorDTO>> findAll() {
			List<Sector> list = service.findAll();
			List<SectorDTO> listDto = list.stream().map(obj -> new SectorDTO(obj)).collect(Collectors.toList());
			return ResponseEntity.ok().body(listDto);
		}
}
