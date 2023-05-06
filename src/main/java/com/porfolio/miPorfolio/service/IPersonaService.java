
package com.porfolio.miPorfolio.service;

import com.porfolio.miPorfolio.model.Persona;
import java.util.List;


public interface IPersonaService {
    
    public List<Persona> verPersona ();
    public void crearPersona(Persona per);
    public void borrarPersona(Long id);
    public void actualizarPersona(Persona per);
    
  
}
