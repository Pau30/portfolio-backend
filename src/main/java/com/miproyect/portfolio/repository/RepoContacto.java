
package com.miproyect.portfolio.repository;

import com.miproyect.portfolio.entity.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoContacto extends JpaRepository<Contacto, Integer> {
    
}
