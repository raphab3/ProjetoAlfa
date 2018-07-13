package com.projetoalfa.resouces;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projetoalfa.domain.Responsible;

@RestController
@RequestMapping(value="/responsibles")
public class ResponsibleResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Responsible> listar() {
		
		Responsible respo1 = new Responsible(1, 1, "Rafael", "raphab33@hotmail.com", "vendas");
		Responsible respo2 = new Responsible(1, 001, "Carla", "raphab332hotmail.com", "Marketing");
		
		List<Responsible> lista = new ArrayList<>();
		
		lista.add(respo1);
		lista.add(respo2);
		
		
		return lista;
	}
}
