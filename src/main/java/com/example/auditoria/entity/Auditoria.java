package com.example.auditoria.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "auditoria")
public class Auditoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAuditoria;

    @Column(name = "tipoBaseDatos", nullable = false, length = 200)
    private String tipoBaseDatos;

    @Column(name = "nombreBaseDatos", nullable = false, length = 200)
    private String nombreBaseDatos;

    @Column(name = "nombreTabla", nullable = false, length = 200)
    private String nombreTabla;
    
    @Column(name = "nombreMetodo", nullable = false, length = 300)
    private String nombreMetodo;

    @Column(name = "fechaRegistro", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    
}
