
package com.porfolio.miPorfolio.service;

import com.porfolio.miPorfolio.model.Experiencia;
import java.util.List;


public interface IExperienciaService {
    
    public List<Experiencia> verExperiencia();
    public void crearExperiencia(Experiencia exp);
    public void borrarExperiencia(Long id);
    public void actualizarExperiencia(Experiencia exp);

    
}
