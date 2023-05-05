package com.miproyect.portfolio.controller;

import com.miproyect.portfolio.entity.Skill;
import com.miproyect.portfolio.service.SerSkill;
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
@RequestMapping("hardSkills")
@CrossOrigin(origins = "http://localhost:4200")
public class ContSkill {

    @Autowired
    SerSkill SSkill;

    @GetMapping("/list")
    @ResponseBody
    public List<Skill> listSkills() {
        return SSkill.listSkills();
    }

    @GetMapping("/search/{id}")
    @ResponseBody
    public Skill verSkills(@PathVariable int id) {
        return SSkill.buscarSkill(id);
    }

    
    @PostMapping("/add")
      public void agregarSkills(@RequestBody Skill ski) {
        SSkill.crearSkill(ski);
    }

   
    @DeleteMapping("/delete/{id}")
    public void eliminarSkills(@PathVariable("id") int id) {
        SSkill.borrarSkill(id);

    }

   
    @PutMapping("/edit")
    public void updateSkills(@RequestBody Skill ski) {
        SSkill.editarSkill(ski);
    }
}
