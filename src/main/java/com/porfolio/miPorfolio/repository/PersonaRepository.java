
package com.porfolio.miPorfolio.repository;


import com.porfolio.miPorfolio.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long>{
    
}