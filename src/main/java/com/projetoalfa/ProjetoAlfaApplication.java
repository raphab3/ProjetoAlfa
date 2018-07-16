package com.projetoalfa;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.projetoalfa.domain.Document;
import com.projetoalfa.domain.Responsible;
import com.projetoalfa.domain.Sector;
import com.projetoalfa.repositories.DocumentRepository;
import com.projetoalfa.repositories.ResponsibleRepository;
import com.projetoalfa.repositories.SectorRepository;

@SpringBootApplication
public class ProjetoAlfaApplication implements CommandLineRunner{
	
	@Autowired
	private ResponsibleRepository responsibleRepository;
	
	@Autowired
	private SectorRepository sectorRepository;
	
	@Autowired
	private DocumentRepository documentRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetoAlfaApplication.class, args);	
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		Sector sect1 = new Sector(null,"Vendas", 101, "marketing@alfaconsultoria");
		Sector sect2 = new Sector(null, "Desenvolvimento", 103, "Devesenvolvimento@alfaconsultoria");
		
		Responsible respon1 = new Responsible(null, 001, "Rafael", "raphab33@alfaconsultoria", sect1 );
		Responsible respon2 = new Responsible(null, 002, "Carla", "carla@alfaconsultoria", sect2);
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Document doc1 = new Document(null, "document01.pdf", "Assunto Vendas", sdf.parse("13/07/2018"));
		Document doc2 = new Document(null, "document02.pdf", "Assunto Marketing", sdf.parse("13/06/2018"));
		Document doc3 = new Document(null, "document03.pdf", "Assunto Desenvolvimento", sdf.parse("03/05/2018"));
		

		sect1.getDocuments().addAll(Arrays.asList(doc1, doc2, doc3));
		sect2.getDocuments().addAll(Arrays.asList(doc1, doc3));
		
		doc1.getSectors().addAll(Arrays.asList(sect1, sect2));
		doc2.getSectors().addAll(Arrays.asList(sect1));
		doc3.getSectors().addAll(Arrays.asList(sect1, sect2));
		
		sect1.setResponsible(respon1);
		sect2.setResponsible(respon2);
		
//		respon1.setSector(sect1);
//		respon2.setSector(sect2);
		
		
		sectorRepository.save(Arrays.asList(sect1, sect2));
		documentRepository.save(Arrays.asList(doc1, doc2, doc3));
		responsibleRepository.save(Arrays.asList(respon1, respon2));
		
		
		
		
		
		
	}
}
