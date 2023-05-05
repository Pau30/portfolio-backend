package com.miproyect.portfolio.service;


import com.miproyect.portfolio.entity.Persona;
import com.miproyect.portfolio.repository.RepoPersona;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SerPersona {

    @Autowired
    public RepoPersona RPersona;


    public List<Persona> listPersona() {
        List<Persona> listaPersona = RPersona.findAll();
        return listaPersona;
    }

    public void crearPersona(Persona personita) {
        RPersona.save(personita);
    }

    public void borrarPersona(int id) {
        RPersona.deleteById(id);
    }

    public Persona buscarPersona(int id) {
        Persona personita = RPersona.findById(id).orElse(null);
        return personita;
    }

    public void editarPersona(Persona personita) {
        RPersona.save(personita);
    }
    
   
}
