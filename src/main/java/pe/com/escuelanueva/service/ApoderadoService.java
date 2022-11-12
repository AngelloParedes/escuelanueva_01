package pe.com.escuelanueva.service;

import java.util.List;
import java.util.Optional;
import pe.com.escuelanueva.entity.ApoderadoEntity;

public interface ApoderadoService {
    //funcion para mostrar todos los datos
    List<ApoderadoEntity> findAll();
    //funcion para mostrar los distrito habilitados
    List<ApoderadoEntity> findAllCustom();
    //funcion para buscar un distrito por codigo
    Optional<ApoderadoEntity> findById(Long id);
    //funcion para registrar
    ApoderadoEntity add(ApoderadoEntity d);
    //funcion para actualizar
    ApoderadoEntity update(ApoderadoEntity d);
    //funcion para eliminar
    ApoderadoEntity delete(ApoderadoEntity d);
}
