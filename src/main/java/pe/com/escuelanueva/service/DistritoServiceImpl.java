package pe.com.escuelanueva.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.escuelanueva.entity.DistritoEntity;
import pe.com.escuelanueva.repository.DistritoRepository;

@Service
public class DistritoServiceImpl implements DistritoService{
    @Autowired
    private DistritoRepository respositoriodistrito;
    @Override
    public List<DistritoEntity> findAll() {
        return respositoriodistrito.findAll();
    }

    @Override
    public List<DistritoEntity> findAllCustom() {
        return respositoriodistrito.findAllCustom();
    }

    @Override
    public Optional<DistritoEntity> findById(Long id) {
        return respositoriodistrito.findById(id);
    }

    @Override
    public DistritoEntity add(DistritoEntity d) {
        return respositoriodistrito.save(d);    }
    
    @Override
    public DistritoEntity update(DistritoEntity d) {
        DistritoEntity objdistrito=respositoriodistrito.getById(d.getCodigo());
        BeanUtils.copyProperties(d, objdistrito);
        return respositoriodistrito.save(objdistrito);
    }

    @Override
    public DistritoEntity delete(DistritoEntity d) {
        DistritoEntity objdistrito=respositoriodistrito.getById(d.getCodigo());
        objdistrito.setEstado(false);
        return respositoriodistrito.save(objdistrito);
    }
    
}
