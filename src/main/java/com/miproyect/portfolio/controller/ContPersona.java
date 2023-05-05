package com.miproyect.portfolio.controller;

import com.miproyect.portfolio.entity.Persona;
import com.miproyect.portfolio.service.SerPersona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("aboutme")
@CrossOrigin(origins = "http://localhost:4200/")
public class ContPersona {

    @Autowired
    SerPersona SPersona;
            
    
     @GetMapping("/list")
    @ResponseBody
    public List<Persona> listPersona() {
        return SPersona.listPersona();               
    }

    @GetMapping("/search/{id}")
    @ResponseBody
    public Persona verPersona(@PathVariable int id) {
        return SPersona.buscarPersona(id);
    }
          
        
    @PutMapping("/edit")
    public void updatePersona(@RequestBody Persona personita) {
        SPersona.editarPersona(personita);
    }
}
