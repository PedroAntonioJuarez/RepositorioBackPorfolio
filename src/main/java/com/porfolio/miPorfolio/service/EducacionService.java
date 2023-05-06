
package com.porfolio.miPorfolio.service;

import com.porfolio.miPorfolio.model.Educacion;
import com.porfolio.miPorfolio.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EducacionService implements IEducacionService{
    
    @Autowired 
    public EducacionRepository eduRepo;

    @Override
    public List<Educacion> verEducacion() {
        return eduRepo.findAll();
    }

    @Override
    public void crearEducacion(Educacion edu) {
        eduRepo.save(edu);
    }

    @Override
    public void borrarEducacion(Long id) {
       eduRepo.deleteById(id);
    }

    @Override
    public void actualizarEducacion(Educacion edu) {
        eduRepo.save(edu);
    }

  
    
}
