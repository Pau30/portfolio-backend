package com.miproyect.portfolio.controller;

import com.miproyect.portfolio.entity.Experiencia;
import com.miproyect.portfolio.service.SerExperiencia;
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
@RequestMapping("experiencias")
@CrossOrigin(origins = "https://portfolio-pacavi.web.app/")
public class ContExperiencia {

    @Autowired
    public SerExperiencia SExperiencia;

    @GetMapping("/list")
    @ResponseBody
    public List<Experiencia> listExperiencia() {
        return SExperiencia.listExperiencia();
    }

    @GetMapping("/search/{id}")
    @ResponseBody
    public Experiencia verExperiencia(@PathVariable int id) {
        return SExperiencia.buscarExperiencia(id);
    }

    
    @PostMapping("/add")
    public void agregarExperiencia(@RequestBody Experiencia experiencia) {
        SExperiencia.crearExperiencia(experiencia);
    }

    
    @DeleteMapping("/delete/{id}")
    public void eliminarExperiencia(@PathVariable int id) {
        SExperiencia.borrarExperiencia(id);

    }

  
    @PutMapping("/edit")
    public void updateExperiencia(@RequestBody Experiencia experiencia) {
        SExperiencia.editarExperiencia(experiencia);

    }

}
