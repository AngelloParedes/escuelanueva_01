package pe.com.escuelanueva.restcontroller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.escuelanueva.entity.DistritoEntity;
import pe.com.escuelanueva.service.DistritoService;

//@RestController define que es un controlador Rest
//Aparece apartir de la version 4 de Spring
@RestController
//@Controller --> es un controlador de Spring 
//@ResponseBody --> se volvio un controlador Rest
//@RestController = @Controller + @ResponseBody
@RequestMapping("/distrito")
public class DistritoController {
    @Autowired
    private DistritoService distritoservice;
    
    //@GetMapping --> permite obtener valores
    @GetMapping
    public List<DistritoEntity> findAll(){
        return distritoservice.findAll();
    }
    @GetMapping("/custom")
    public List<DistritoEntity> findAllCustom(){
        return distritoservice.findAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<DistritoEntity> findById(@PathVariable Long id){
        return distritoservice.findById(id);
    }
    @PostMapping
    public DistritoEntity add(@RequestBody DistritoEntity c){
        return distritoservice.add(c);
    }
    @PutMapping("/{id}")
    public DistritoEntity update(@PathVariable long id, @RequestBody DistritoEntity c){
    c.setCodigo(id);
        return distritoservice.add(c);
    }
    
    @DeleteMapping("/{id}")
    public DistritoEntity delete(@PathVariable long id){
    DistritoEntity objdistrito = new DistritoEntity();
    objdistrito.setEstado(false);
    return distritoservice.delete(DistritoEntity.builder().codigo(id).build());
    }
}
