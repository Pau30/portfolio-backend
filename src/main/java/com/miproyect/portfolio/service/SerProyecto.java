package com.miproyect.portfolio.service;

import com.miproyect.portfolio.entity.Proyecto;
import com.miproyect.portfolio.repository.RepoProyecto;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SerProyecto {

    @Autowired
    RepoProyecto RProyecto;

    public List<Proyecto> listProyectos() {
        List<Proyecto> listaProyectos = RProyecto.findAll();
        return listaProyectos;
    }

    public void crearProyecto(Proyecto proyect) {
        RProyecto.save(proyect);
    }

    public void borrarProyecto(int id) {
        RProyecto.deleteById(id);
    }

    public Proyecto buscarProyecto(int id) {
        Proyecto proyect = RProyecto.findById(id).orElse(null);
        return proyect;
    }

    public void editarProyecto(Proyecto proyect) {
        RProyecto.save(proyect);
    }
}
