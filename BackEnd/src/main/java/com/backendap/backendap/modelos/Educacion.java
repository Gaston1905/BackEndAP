
package com.backendap.backendap.modelos;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long idEdu;
    private String nombreEdu;
    private String tituloEdu;
    private int fechaEdu;
    
    public Educacion(){
    
    }

    public Educacion(Long idEdu, String nombreEdu, String tituloEdu, int fechaEdu) {
        this.idEdu = idEdu;
        this.nombreEdu = nombreEdu;
        this.tituloEdu = tituloEdu;
        this.fechaEdu = fechaEdu;
    }

    public Long getIdEdu() {
        return idEdu;
    }

    public void setIdEdu(Long idEdu) {
        this.idEdu = idEdu;
    }
    
    public String getNombreEdu(){
        return nombreEdu;
    }
    
    public void setNombreEdu(String nombreEdu){
        this.nombreEdu = nombreEdu;
    }

    public String getTituloEdu() {
        return tituloEdu;
    }

    public void setTituloEdu(String tituloEdu) {
        this.tituloEdu = tituloEdu;
    }

    public int getFechaEdu() {
        return fechaEdu;
    }

    public void setFechaEdu(int fechaEdu) {
        this.fechaEdu = fechaEdu;
    }
    
    
     
    
}
