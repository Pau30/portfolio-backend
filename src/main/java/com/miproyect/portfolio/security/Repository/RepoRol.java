
package com.miproyect.portfolio.security.Repository;

import com.miproyect.portfolio.security.Entity.Rol;
import com.miproyect.portfolio.security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoRol extends JpaRepository <Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
