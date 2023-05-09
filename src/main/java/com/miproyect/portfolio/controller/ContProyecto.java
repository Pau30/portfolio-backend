package com.miproyect.portfolio.controller;

import com.miproyect.portfolio.entity.Proyecto;
import com.miproyect.portfolio.service.SerProyecto;
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
@RequestMapping("proyectos")
@CrossOrigin(origins = "https://portfolio-pacavi.web.app/")
public class ContProyecto {
      @Autowired
    SerProyecto SProyecto;

    @GetMapping("/list")
    @ResponseBody
    public List<Proyecto> listProyectos() {
        return SProyecto.listProyectos();
    }

    @GetMapping("/search/{id}")
    @ResponseBody
    public Proyecto verProyecto(@PathVariable int id) {
        return SProyecto.buscarProyecto(id);
    }

    
    @PostMapping("/add")
    public void agregarProyecto(@RequestBody Proyecto proyect) {
        SProyecto.crearProyecto(proyect);

    }

   
    @DeleteMapping("/delete/{id}")
    public void eliminarProyecto(@PathVariable int id) {
        SProyecto.borrarProyecto(id);

    }

    
    @PutMapping("/edit")
    public void updateProyecto(@RequestBody Proyecto proyect) {
        SProyecto.editarProyecto(proyect);
    }
}
