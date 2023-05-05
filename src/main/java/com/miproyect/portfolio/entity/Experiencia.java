package com.miproyect.portfolio.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;


@Entity
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String puesto;
    private String logo;
    private String inicio;
    private String fin;
    @Lob
    private String descripcion;
    

    public Experiencia() {
    }

    public Experiencia(String nombre, String puesto, String logo, String inicio, String fin, String descripcion) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.logo = logo;
        this.inicio = inicio;
        this.fin = fin;
        this.descripcion = descripcion;
        
    }

    public int getId() {
        return id;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLogo() {
        return logo;
    }

     public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
