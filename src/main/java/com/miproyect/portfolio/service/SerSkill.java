package com.miproyect.portfolio.service;

import com.miproyect.portfolio.entity.Skill;
import com.miproyect.portfolio.repository.RepoSkill;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SerSkill {

    @Autowired
    public RepoSkill RSkill;

    public List<Skill> listSkills() {
        List<Skill> listaSkills = RSkill.findAll();
        return listaSkills;
    }

    public void crearSkill(Skill ski) {
        RSkill.save(ski);
    }

    public void borrarSkill(int id) {
        RSkill.deleteById(id);
    }

    public Skill buscarSkill(int id) {
        Skill ski = RSkill.findById(id).orElse(null);
        return ski;
    }

    public void editarSkill(Skill ski) {
        RSkill.save(ski);
    }
}
