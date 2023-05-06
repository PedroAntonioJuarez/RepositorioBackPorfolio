
package com.porfolio.miPorfolio.service;

import com.porfolio.miPorfolio.model.Educacion;
import java.util.List;

public interface IEducacionService {
    
    
    public List<Educacion> verEducacion();
    public void crearEducacion(Educacion edu);
    public void borrarEducacion(Long id);
    public void actualizarEducacion(Educacion edu);
    
}
