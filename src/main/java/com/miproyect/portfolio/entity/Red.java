package com.miproyect.portfolio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Red {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
    private String nombre;
    private String icon;
    private String link;

    public Red() {
    }

    public Red(int id, String nombre, String icon, String link) {
        this.id = id;
        this.nombre = nombre;
        this.icon = icon;
        this.link = link;
    }

    public int getId() {
        return id;
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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    
    
    
}
