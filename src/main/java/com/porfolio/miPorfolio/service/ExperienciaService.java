
package com.porfolio.miPorfolio.service;


import com.porfolio.miPorfolio.model.Experiencia;
import com.porfolio.miPorfolio.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{

    @Autowired
    public ExperienciaRepository expeRepo;
    
    @Override
    public List<Experiencia> verExperiencia(){
        
        return expeRepo.findAll();
    }
    
    @Override 
    public void crearExperiencia(Experiencia exp){
        expeRepo.save(exp);
    }

    @Override
    public void borrarExperiencia(Long id) {
        expeRepo.deleteById(id);
    }
    
    /* probando lo de abajo, borrar si no funciona*/

    @Override
    public void actualizarExperiencia(Experiencia exp) {
        expeRepo.save(exp);
    }
    
    
   
    
}
