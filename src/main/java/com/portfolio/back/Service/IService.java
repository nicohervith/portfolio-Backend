package com.portfolio.back.Service;

import java.util.List;

public interface IService<T> {
    
    public List<T> buscarObjetos();
    
    public T buscarObjetoById(Long id);
    
    public T crearObjeto(T obj);
    
    public T editarObjeto(T obj);
    
    public void borrarObjetoById(Long id);
}
