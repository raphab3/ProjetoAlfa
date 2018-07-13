package com.projetoalfa;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.projetoalfa.domain.Responsible;
import com.projetoalfa.repositories.ResponsibleRepository;

@SpringBootApplication
public class ProjetoAlfaApplication implements CommandLineRunner{
	
	@Autowired
	private ResponsibleRepository responsibleRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetoAlfaApplication.class, args);	
	}

	@Override
	public void run(String... args) throws Exception {
		
		Responsible respon1 = new Responsible(null, 001, "Rafael", "raphab33@alfaconsultoria", "Desenvolvimento");
		Responsible respon2 = new Responsible(null, 002, "Carla", "carla@alfaconsultoria", "Marketing");
		
		responsibleRepository.save(Arrays.asList(respon1, respon2));
	}
}
