
package com.porfolio.miPorfolio.repository;

import com.porfolio.miPorfolio.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia, Long>{
    
}
