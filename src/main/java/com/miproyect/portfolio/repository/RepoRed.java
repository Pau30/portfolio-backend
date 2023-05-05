
package com.miproyect.portfolio.repository;

import com.miproyect.portfolio.entity.Red;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoRed extends JpaRepository<Red, Integer>  {
    
}
