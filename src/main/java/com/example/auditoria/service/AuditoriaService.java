package com.example.auditoria.service;

import java.util.List;

import com.example.auditoria.entity.Auditoria;

public interface AuditoriaService {

    public abstract List<Auditoria> listaTodos();
    public abstract Auditoria creaAuditoria(Auditoria auditoria);
    

}
