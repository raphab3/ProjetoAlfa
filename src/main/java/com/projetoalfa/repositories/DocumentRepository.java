package com.projetoalfa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetoalfa.domain.Document;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Integer>{


}
