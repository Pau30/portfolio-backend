package com.miproyect.portfolio.service;

import com.miproyect.portfolio.entity.Educacion;
import com.miproyect.portfolio.repository.RepoEducacion;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SerEducacion {

    @Autowired
    public RepoEducacion REducacion;

    public List<Educacion> listEducacion() {
        List<Educacion> listaEducacion = REducacion.findAll();
        return listaEducacion;
    }

    public void crearEducacion(Educacion edu) {
        REducacion.save(edu);
    }

    public void borrarEducacion(int id) {
        REducacion.deleteById(id);
    }

    public Educacion buscarEducacion(int id) {
        Educacion edu = REducacion.findById(id).orElse(null);
        return edu;
    }

    public void editarEducacion(Educacion edu) {
        REducacion.save(edu);
    }
}
