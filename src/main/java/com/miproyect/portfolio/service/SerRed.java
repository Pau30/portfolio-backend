package com.miproyect.portfolio.service;

import com.miproyect.portfolio.entity.Red;
import com.miproyect.portfolio.repository.RepoRed;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SerRed {
    @Autowired
    public RepoRed RRed;
    
    public List<Red> listRed() {
        List<Red> listaRed = RRed.findAll();
        return listaRed;
    }

    public void crearRed(Red red) {
        RRed.save(red);
    }

    public void borrarRed(int id) {
        RRed.deleteById(id);
    }

    public Red buscarRed(int id) {
        Red expe = RRed.findById(id).orElse(null);
        return expe;
    }

    public void editarRed(Red red) {
        RRed.save(red);
    }
}
