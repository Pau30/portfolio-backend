package com.miproyect.portfolio.controller;

import com.miproyect.portfolio.entity.SkillSoft;
import com.miproyect.portfolio.service.SerSkillSoft;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("softSkills")
@CrossOrigin(origins = "http://localhost:4200")
public class ContSkillSoft {

    @Autowired
    public SerSkillSoft SSkillSoft;

    @GetMapping("/list")
    @ResponseBody
    public List<SkillSoft> listSkills() {
        return SSkillSoft.listSkills();
    }

    @GetMapping("/search/{id}")
    @ResponseBody
    public SkillSoft verSkills(@PathVariable int id) {
        return SSkillSoft.buscarSkill(id);
    }

   
    @PostMapping("/add")
    public void agregarSkills(@RequestBody SkillSoft skiSoft) {
        SSkillSoft.crearSkill(skiSoft);
    }

    
    @DeleteMapping("/delete/{id}")
    public void eliminarSkills(@PathVariable int id) {
        SSkillSoft.borrarSkill(id);

    }

    
    @PutMapping("/edit")
    public void updateSkills(@RequestBody SkillSoft skiBack) {
        SSkillSoft.editarSkill(skiBack);

    }
}
