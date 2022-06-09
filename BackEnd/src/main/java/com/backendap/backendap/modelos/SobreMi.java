
package com.backendap.backendap.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SobreMi {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long idSobreMi;
    private String fotoPerfil;
    private String descripcion;
    
    public SobreMi(){
    
    }

    public SobreMi(Long idSobreMi, String fotoPerfil, String descripcion) {
        this.idSobreMi = idSobreMi;
        this.fotoPerfil = fotoPerfil;
        this.descripcion = descripcion;
    }

    public Long getIdSobreMi() {
        return idSobreMi;
    }

    public void setIdSobreMi(Long idSobreMi) {
        this.idSobreMi = idSobreMi;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
