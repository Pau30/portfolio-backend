
package com.miproyect.portfolio.security.Repository;

import com.miproyect.portfolio.security.Entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoUsuario extends JpaRepository <Usuario, Integer> {
    Optional<Usuario>findByNombreUsuario(String nombreUsuario);

boolean existsByNombreUsuario(String nombreUsuario);
boolean existsByEmail (String email);
}

