package com.miproyect.portfolio.controller;

import com.miproyect.portfolio.entity.Interes;
import com.miproyect.portfolio.service.SerInteres;
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
@RequestMapping("intereses")
@CrossOrigin(origins = "http://localhost:4200")
public class ContInteres {
      @Autowired
    public SerInteres SInteres;
              
    @GetMapping("/list")
    @ResponseBody
    public List<Interes> listInteres() {
        return SInteres.listInteres();
    }

    @GetMapping("/search/{id}")
    @ResponseBody
    public Interes verInteres(@PathVariable int id) {
        return SInteres.buscarInteres(id);
    }

    
    @PostMapping("/add")
    public void agregarInteres(@RequestBody Interes interes) {
        SInteres.crearInteres(interes);
    }

    
    @DeleteMapping("/delete/{id}")
    public void eliminarInteres(@PathVariable int id) {
        SInteres.borrarInteres(id);

    }
  
    @PutMapping("/edit")
    public void updateInteres(@RequestBody Interes interes) {
        SInteres.editarInteres(interes);

    }
}
