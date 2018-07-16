package com.projetoalfa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoalfa.domain.Sector;
import com.projetoalfa.repositories.SectorRepository;
import com.projetoalfa.services.exceptions.ObjectNotFoundException;

@Service
public class SectorService {
	
	@Autowired
	private SectorRepository repo;
	
	public Sector buscar(Integer id) {
		Sector obj = repo.findOne(id);
		if(obj == null) {
			throw new ObjectNotFoundException("Object NotFound! id: " + id
					+ ", Tipo: " + Sector.class.getName());
		}
		return obj;
	}
	
	public Sector insert(Sector obj) {
		obj.setId(null);
		return repo.save(obj);
	}
	
//	DTO
	
	public List<Sector> findAll(){
		return repo.findAll();
	}
}
