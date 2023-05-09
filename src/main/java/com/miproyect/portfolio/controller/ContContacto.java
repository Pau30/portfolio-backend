package com.miproyect.portfolio.controller;

import com.miproyect.portfolio.entity.Contacto;
import com.miproyect.portfolio.service.SerContacto;
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
@RequestMapping("contacto")
@CrossOrigin(origins = "https://portfolio-pacavi.web.app/")
public class ContContacto {
      @Autowired
    public SerContacto SContacto;
              
    @GetMapping("/list")
    @ResponseBody
    public List<Contacto> listContacto() {
        return SContacto.listContacto();
    }

    @GetMapping("/search/{id}")
    @ResponseBody
    public Contacto verContacto(@PathVariable int id) {
        return SContacto.buscarContacto(id);
    }

 
    @PutMapping("/edit")
    public void updateContacto(@RequestBody Contacto contacto) {
        SContacto.editarContacto(contacto);

    }
}
