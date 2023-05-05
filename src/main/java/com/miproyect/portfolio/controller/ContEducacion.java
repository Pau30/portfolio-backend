package com.miproyect.portfolio.controller;

import com.miproyect.portfolio.entity.Educacion;
import com.miproyect.portfolio.service.SerEducacion;
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
@RequestMapping("educacion")
@CrossOrigin(origins = "http://localhost:4200")
public class ContEducacion {

    @Autowired
    public SerEducacion SEducacion;

    @GetMapping("/list")
    @ResponseBody
    public List<Educacion> listEducacion() {
        return SEducacion.listEducacion();
    }

    @GetMapping("/search/{id}")
    @ResponseBody
    public Educacion verEducacion(@PathVariable int id) {
        return SEducacion.buscarEducacion(id);
    }

    
    @PostMapping("/add")
    public void agregarEducacion(@RequestBody Educacion educacion) {
        SEducacion.crearEducacion(educacion);
    }

   
    @DeleteMapping("/delete/{id}")
    public void eliminarEducacion(@PathVariable int id) {
        SEducacion.borrarEducacion(id);

    }

    
    @PutMapping("/edit")
    public void updateEducacion(@RequestBody Educacion educacion) {
        SEducacion.editarEducacion(educacion);

    }

}
