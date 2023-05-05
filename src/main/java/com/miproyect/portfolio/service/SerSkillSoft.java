package com.miproyect.portfolio.service;

import com.miproyect.portfolio.entity.SkillSoft;
import com.miproyect.portfolio.repository.RepoSkillSoft;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SerSkillSoft {

    @Autowired
    public RepoSkillSoft RSkillSoft;

    public List<SkillSoft> listSkills() {
        List<SkillSoft> listaSkills = RSkillSoft.findAll();
        return listaSkills;
    }

    public void crearSkill(SkillSoft skiSoft) {
        RSkillSoft.save(skiSoft);
    }

    public void borrarSkill(int id) {
        RSkillSoft.deleteById(id);
    }

    public SkillSoft buscarSkill(int id) {
        SkillSoft skiSoft = RSkillSoft.findById(id).orElse(null);
        return skiSoft;
    }

    public void editarSkill(SkillSoft skiSoft) {
        RSkillSoft.save(skiSoft);
    }

}
