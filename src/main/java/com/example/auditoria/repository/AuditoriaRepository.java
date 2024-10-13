package com.example.auditoria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.auditoria.entity.Auditoria;

public interface AuditoriaRepository extends JpaRepository<Auditoria, Integer> {

    
}
