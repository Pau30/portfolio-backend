package com.miproyect.portfolio.security.Service;

import com.miproyect.portfolio.security.Entity.Rol;
import com.miproyect.portfolio.security.Enums.RolNombre;
import com.miproyect.portfolio.security.Repository.RepoRol;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SerRol {

    @Autowired
    RepoRol rRol;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre) {
        return rRol.findByRolNombre(rolNombre);
    }

    public void Save(Rol rol) {
        rRol.save(rol);
    }
}
