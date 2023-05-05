package com.miproyect.portfolio.repository;

import com.miproyect.portfolio.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoPersona extends JpaRepository<Persona, Integer> {

}
