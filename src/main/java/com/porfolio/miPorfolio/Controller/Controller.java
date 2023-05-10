
package com.porfolio.miPorfolio.Controller;



import com.porfolio.miPorfolio.model.Educacion;
import com.porfolio.miPorfolio.model.Experiencia;
import com.porfolio.miPorfolio.model.Persona;
import com.porfolio.miPorfolio.service.IEducacionService;
import com.porfolio.miPorfolio.service.IExperienciaService;
import com.porfolio.miPorfolio.service.IPersonaService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@RestController
@CrossOrigin(origins = "https://porfolio-frontend-pedro.web.app")
public class Controller {
    
    
    @Autowired
    private IPersonaService persoServ;
    
     @Autowired
    private IExperienciaService expeServ;
     
      @Autowired
      private  IEducacionService eduServ;
      
      //Aqui abajo esta lo de Experiencia
    
    
  @PostMapping("/agregar/experiencia")
     public void agregarExperiencia(@RequestBody Experiencia exp){
      expeServ.crearExperiencia(exp);
     };
  

       @GetMapping("/ver/experiencia")
     @ResponseBody
     public List<Experiencia> verExperiencias(){
        return expeServ.verExperiencia();
     };
     
    @DeleteMapping ("/borrar/{id}")
     public void borrarExperiencia (@PathVariable Long id){
         expeServ.borrarExperiencia(id);
     };
     
     
     @PutMapping("actualizar/experiencia")
     public void actualizarExperiencia(@RequestBody Experiencia exp){
      expeServ.actualizarExperiencia(exp) ;}
     
     
    /*// Abajo "SOBRE MI" (editar, hay metodos que no se usaran*/
    
     
     @GetMapping("/ver/personas")
     @ResponseBody
     public List<Persona> verPersonas(){
        return persoServ.verPersona();
     };
     
     
     @PutMapping("actualizar/persona")
     public void actualizarPersona(@RequestBody Persona per){
         persoServ.actualizarPersona(per);
     }
     
     
     
     // Aqui abajo esta todo lo de "Educacion 
     
     
   @GetMapping("ver/educacion")
   @ResponseBody
   public List<Educacion> verEducacion(){
       return eduServ.verEducacion();
   }
   @ResponseBody
   @PostMapping("/agregar/educacion")
   public void agregarEducacion(@RequestBody Educacion edu){
       eduServ.crearEducacion(edu);
   }
 
   @DeleteMapping("borrarEdu/{id}")
   public void borrarEducacion(@PathVariable Long id){
       eduServ.borrarEducacion(id);
   }
   @ResponseBody
   @PutMapping("actualizar/educacion")
   public void actualizarEducacion(@RequestBody Educacion edu){
       eduServ.actualizarEducacion(edu);
   }
   
  
   /* Esto de abajo es lo ultimo q implemente para ver si funciona el put, y el post*/
   public class WebConfig implements WebMvcConfigurer {
    
        @Override
        public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/**")
                    .allowedOrigins("https://porfolio-frontend-pedro.web.app")
                    .allowedMethods( "POST", "PUT");
        }
    }
}
