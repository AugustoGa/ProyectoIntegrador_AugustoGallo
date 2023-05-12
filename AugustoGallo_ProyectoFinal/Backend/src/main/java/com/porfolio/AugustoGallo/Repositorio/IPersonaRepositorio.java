
package com.porfolio.AugustoGallo.Repositorio;

import com.porfolio.AugustoGallo.Entidad.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepositorio extends JpaRepository<Persona,Long> {
    
}
