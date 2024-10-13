package com.example.auditoria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.auditoria.entity.Auditoria;
import com.example.auditoria.repository.AuditoriaRepository;

@Service
public class AuditoriaServiceImpl implements AuditoriaService{

    @Autowired
    private AuditoriaRepository auditoriaRepository;
    
    @Override
    public List<Auditoria> listaTodos() {
        return auditoriaRepository.findAll();
    }

    @Override
    public Auditoria creaAuditoria(Auditoria auditoria) {
        return auditoriaRepository.save(auditoria);
    }
}
