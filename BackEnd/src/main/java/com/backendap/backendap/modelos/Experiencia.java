
package com.backendap.backendap.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExp;
    private String nombreExp;
    private String descExp;
    private int fechaInicioExp;
    private int fechaFinExp;
    
    public Experiencia(){
    
    }

    public Experiencia(Long idExp, String nombreExp, String descExp, int fechaInicioExp, int fechaFinExp) {
        this.idExp = idExp;
        this.nombreExp = nombreExp;
        this.descExp = descExp;
        this.fechaInicioExp = fechaInicioExp;
        this.fechaFinExp = fechaFinExp;
    }

    public Long getIdExp() {
        return idExp;
    }

    public void setIdExp(Long idExp) {
        this.idExp = idExp;
    }

    public String getnombreExp() {
        return nombreExp;
    }

    public void setNombreExp(String nombreExp) {
        this.nombreExp = nombreExp;
    }
    
    public String getdescExp() {
        return descExp;
    }
    
    public void setDescExp (String descExp) {
        this.descExp = descExp;
    }

    public int getfechaInicioExp() {
        return fechaInicioExp;
    }

    public void setFechaInicioExp(int fechaInicioExp) {
        this.fechaInicioExp = fechaInicioExp;
        
    }
    
    public int getfechaFinExp() {
        return fechaFinExp;
    }
    
    public void setFechaFinExp(int fechaFinExp) {
        this.fechaFinExp = fechaFinExp;
    }
    
    
}
