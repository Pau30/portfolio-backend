package com.miproyect.portfolio.security.Service;

import com.miproyect.portfolio.security.Entity.Usuario;
import com.miproyect.portfolio.security.Repository.RepoUsuario;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SerUsuario {
    @Autowired
    RepoUsuario rUsuario;
    
     public Optional<Usuario> getByNombreUsuario(String nombreUsuario) {
        return rUsuario.findByNombreUsuario(nombreUsuario);
    }

    public boolean existsByNombreUsuario(String nombreUsuario){
        return rUsuario.existsByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByEmail(String email){
        return rUsuario.existsByEmail(email);
    }
    
    public void save(Usuario usuario){
        rUsuario.save(usuario);
    }
    }
    

