package com.miproyect.portfolio.repository;

import com.miproyect.portfolio.entity.Interes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoInteres extends JpaRepository<Interes, Integer> {
    
}
