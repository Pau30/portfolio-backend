package com.miproyect.portfolio.repository;

import com.miproyect.portfolio.entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoEducacion extends JpaRepository<Educacion, Integer> {

}
