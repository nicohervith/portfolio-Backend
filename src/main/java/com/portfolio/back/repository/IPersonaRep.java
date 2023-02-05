package com.portfolio.back.repository;

import com.portfolio.back.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRep extends JpaRepository<Persona, Long>{
    
}
