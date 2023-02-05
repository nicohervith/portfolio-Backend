package com.portfolio.back.Service;

import com.portfolio.back.Interface.IPersonaService;
import com.portfolio.back.entity.Persona;
import com.portfolio.back.repository.IPersonaRep;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{
    
    //Traigo el repositorio para que lea los campos
    //Autowired permite inyectar dependencias dentro de otras
    @Autowired IPersonaRep ipersonaRepository;
    
    @Override
    public List<Persona> getPersona() {
           List<Persona> persona = ipersonaRepository.findAll();
           
           //Devuelvo la variablde donde se guarda todo
           return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonaRepository.save(persona);
        
    }

    @Override
    public void deletePersona(Long id) {
        ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona=ipersonaRepository.findById(id).orElse(null);
        return persona;
        
    }
    
}
