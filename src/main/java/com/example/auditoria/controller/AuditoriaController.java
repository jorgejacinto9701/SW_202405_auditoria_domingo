package com.example.auditoria.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.auditoria.entity.Auditoria;
import com.example.auditoria.service.AuditoriaService;

@RestController
@RequestMapping("/url/auditoria")
public class AuditoriaController {

    @Autowired
    private AuditoriaService auditoriaService;

    @GetMapping("/lista")
    public List<Auditoria> listaAuditorias() {
        return auditoriaService.listaTodos();
    }

    @PostMapping("/registra/{tipo}-{bd}-{tabla}-{metodo}")
    public String creaAuditoria(@PathVariable String tipo, 
                                   @PathVariable String bd, 
                                   @PathVariable String tabla, 
                                   @PathVariable String metodo){

        Auditoria objAuditoria = new Auditoria();
        objAuditoria.setTipoBaseDatos(tipo);
        objAuditoria.setNombreBaseDatos(bd);
        objAuditoria.setNombreTabla(tabla);
        objAuditoria.setNombreMetodo(metodo);
        objAuditoria.setFechaRegistro(new Date());
        Auditoria objSalida = auditoriaService.creaAuditoria(objAuditoria);

        if (objSalida.getIdAuditoria() >0){
            return "Auditoria registrada con éxito";    
        }else{
            return "Error al registrar auditoria";
        }    
    }

}
