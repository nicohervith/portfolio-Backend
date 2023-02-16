package com.portfolio.back.Security.Service;

import com.portfolio.back.Security.Entity.Rol;
import com.portfolio.back.Security.Enums.RolNombre;
import com.portfolio.back.Security.Repository.iRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//Transactional para tener los datos igual
//Que en la db, hace un rollback que no impacta en la db
@Transactional
public class RolService {
    @Autowired
    iRolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }
    public void save(Rol rol){
        irolRepository.save(rol);
    }
}
