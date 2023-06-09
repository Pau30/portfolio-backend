package com.miproyect.portfolio.repository;

import com.miproyect.portfolio.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoSkill extends JpaRepository<Skill, Integer> {

}
