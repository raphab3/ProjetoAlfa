package com.projetoalfa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetoalfa.domain.Responsible;

@Repository
public interface ResponsibleRepository extends JpaRepository<Responsible, Integer>{


}
