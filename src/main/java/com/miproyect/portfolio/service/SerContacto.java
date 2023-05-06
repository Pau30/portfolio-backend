package com.miproyect.portfolio.service;

import com.miproyect.portfolio.entity.Contacto;
import com.miproyect.portfolio.repository.RepoContacto;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SerContacto {
    @Autowired
    public RepoContacto RContacto;
    
    public List<Contacto> listContacto() {
        List<Contacto> listaContacto = RContacto.findAll();
        return listaContacto;
    }

    public Contacto buscarContacto(int id) {
        Contacto expe = RContacto.findById(id).orElse(null);
        return expe;
    }

    public void editarContacto(Contacto contacto) {
        RContacto.save(contacto);
    }
}
