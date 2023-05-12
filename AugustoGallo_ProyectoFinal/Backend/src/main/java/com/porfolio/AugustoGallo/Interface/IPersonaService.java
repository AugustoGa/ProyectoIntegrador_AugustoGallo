
package com.porfolio.AugustoGallo.Interface;

import com.porfolio.AugustoGallo.Entidad.Persona;
import java.util.List;


public interface IPersonaService {
   //traer lista de persona
    public List<Persona>getPersona();
    
    public void savePersona(Persona persona);
    
    public void delatePersona(Long id);
    
    public Persona findPersona(Long id);
}
