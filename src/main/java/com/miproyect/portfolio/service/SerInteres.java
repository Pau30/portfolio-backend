package com.miproyect.portfolio.service;

import com.miproyect.portfolio.entity.Interes;
import com.miproyect.portfolio.repository.RepoInteres;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SerInteres {
     @Autowired
     public RepoInteres RInteres;
     
         public List<Interes> listInteres() {
        List<Interes> listaInteres = RInteres.findAll();
        return listaInteres;
    }

    public void crearInteres(Interes interes) {
        RInteres.save(interes);
    }

    public void borrarInteres(int id) {
        RInteres.deleteById(id);
    }

    public Interes buscarInteres(int id) {
        Interes interes = RInteres.findById(id).orElse(null);
        return interes;
    }

    public void editarInteres(Interes interes) {
        RInteres.save(interes);
    }
}
