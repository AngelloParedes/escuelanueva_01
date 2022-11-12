package pe.com.escuelanueva.service;

import java.util.List;
import java.util.Optional;
import pe.com.escuelanueva.entity.ParentescoEntity;

public interface ParentescoService {
    //funcion para mostrar todos los datos
    List<ParentescoEntity> findAll();
    //funcion para mostrar los distrito habilitados
    List<ParentescoEntity> findAllCustom();
    //funcion para buscar un distrito por codigo
    Optional<ParentescoEntity> findById(Long id);
    //funcion para registrar
    ParentescoEntity add(ParentescoEntity d);
    //funcion para actualizar
    ParentescoEntity update(ParentescoEntity d);
    //funcion para eliminar
    ParentescoEntity delete(ParentescoEntity d);
}
