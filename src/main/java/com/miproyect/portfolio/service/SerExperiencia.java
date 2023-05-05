package com.miproyect.portfolio.service;

import com.miproyect.portfolio.entity.Experiencia;
import com.miproyect.portfolio.repository.RepoExperiencia;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SerExperiencia {

    @Autowired
    public RepoExperiencia RExperiencia;

    public List<Experiencia> listExperiencia() {
        List<Experiencia> listaExperiencia = RExperiencia.findAll();
        return listaExperiencia;
    }

    public void crearExperiencia(Experiencia expe) {
        RExperiencia.save(expe);
    }

    public void borrarExperiencia(int id) {
        RExperiencia.deleteById(id);
    }

    public Experiencia buscarExperiencia(int id) {
        Experiencia expe = RExperiencia.findById(id).orElse(null);
        return expe;
    }

    public void editarExperiencia(Experiencia expe) {
        RExperiencia.save(expe);
    }
}
