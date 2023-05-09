package com.miproyect.portfolio.controller;

import com.miproyect.portfolio.entity.Red;
import com.miproyect.portfolio.service.SerRed;
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
@RequestMapping("redes")
@CrossOrigin(origins = "https://portfolio-pacavi.web.app/")
public class ContRed {
      @Autowired
    public SerRed SRed;
              
    @GetMapping("/list")
    @ResponseBody
    public List<Red> listRed() {
        return SRed.listRed();
    }

    @GetMapping("/search/{id}")
    @ResponseBody
    public Red verRed(@PathVariable int id) {
        return SRed.buscarRed(id);
    }

    
    @PostMapping("/add")
    public void agregarRed(@RequestBody Red red) {
        SRed.crearRed(red);
    }

    
    @DeleteMapping("/delete/{id}")
    public void eliminarRed(@PathVariable int id) {
        SRed.borrarRed(id);

    }
  
    @PutMapping("/edit")
    public void updateRed(@RequestBody Red red) {
        SRed.editarRed(red);

    }
}
