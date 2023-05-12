
package com.porfolio.AugustoGallo.Servicio;

import com.porfolio.AugustoGallo.Entidad.Persona;
import com.porfolio.AugustoGallo.Interface.IPersonaService;
import com.porfolio.AugustoGallo.Repositorio.IPersonaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplementacionPersonaServi implements IPersonaService {
    @Autowired IPersonaRepositorio ipersonaRepositorio;
        
    
    @Override
    public List<Persona> getPersona() {
        List<Persona>persona = ipersonaRepositorio.findAll();
                return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonaRepositorio.save(persona);
    }

    @Override
    public void delatePersona(Long id) {
        ipersonaRepositorio.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
       Persona persona = ipersonaRepositorio.findById(id).orElse(null);
            return persona;
    } 
}
