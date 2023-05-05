package com.miproyect.portfolio.repository;

import com.miproyect.portfolio.entity.SkillSoft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoSkillSoft extends JpaRepository<SkillSoft, Integer> {

}
