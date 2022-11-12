package pe.com.escuelanueva.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.escuelanueva.entity.ParentescoEntity;
import pe.com.escuelanueva.repository.ParentescoRepository;

@Service
public class ParentescoServiceImpl implements ParentescoService{
    @Autowired
    private ParentescoRepository respositorioparentesco;
    @Override
    public List<ParentescoEntity> findAll() {
        return respositorioparentesco.findAll();
    }

    @Override
    public List<ParentescoEntity> findAllCustom() {
        return respositorioparentesco.findAllCustom();
    }

    @Override
    public Optional<ParentescoEntity> findById(Long id) {
        return respositorioparentesco.findById(id);
    }

    @Override
    public ParentescoEntity add(ParentescoEntity p) {
        return respositorioparentesco.save(p);    }
    
    @Override
    public ParentescoEntity update(ParentescoEntity p) {
        ParentescoEntity objparentesco=respositorioparentesco.getById(p.getCodigo());
        BeanUtils.copyProperties(p, objparentesco);
        return respositorioparentesco.save(objparentesco);
    }

    @Override
    public ParentescoEntity delete(ParentescoEntity p) {
        ParentescoEntity objparentesco=respositorioparentesco.getById(p.getCodigo());
        objparentesco.setEstado(false);
        return respositorioparentesco.save(objparentesco);
    }
}
