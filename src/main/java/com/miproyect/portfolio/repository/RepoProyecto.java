package com.miproyect.portfolio.repository;

import com.miproyect.portfolio.entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoProyecto extends JpaRepository<Proyecto, Integer> {

}
