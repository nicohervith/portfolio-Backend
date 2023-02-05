package com.portfolio.back.Interface;

import com.portfolio.back.entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer lista de persona
    public List<Persona> getPersona();
    
    //Guardar objeto de tipo persona
    //Objeto de tipo persona de persona
    public void savePersona(Persona persona);
    
    //Eliminar persona por id
    public void deletePersona(Long id);
    
    //Buscar persona
    public Persona findPersona(Long id);
}
