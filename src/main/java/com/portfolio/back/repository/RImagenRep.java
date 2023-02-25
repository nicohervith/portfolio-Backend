
package com.portfolio.back.repository;

import com.portfolio.back.entity.Imagen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RImagenRep extends JpaRepository <Imagen,Long>{
    
}
