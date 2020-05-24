/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group.sunset.entity;

import java.math.BigDecimal;

/**
 *
 * @author jdelgado
 */
public class HtlPais {
    
    String clavepais;
    String nombrepais;
    String nacionalidad;
    String claveidioma;
    String clavegrupo;
    BigDecimal importerci;
    String ladainternacional;

    public HtlPais() {
    }
    
    
    
    

    public HtlPais(String clavepais, String nombrepais, String nacionalidad, String claveidioma, 
            String clavegrupo, BigDecimal importerci, String ladainternacional) {
        
        this.clavepais = clavepais;
        this.nombrepais = nombrepais;
        this.nacionalidad = nacionalidad;
        this.claveidioma = claveidioma;
        this.clavegrupo = clavegrupo;
        this.importerci = importerci;
        this.ladainternacional= ladainternacional;
        
    }
    
    
    
    

    public String getClavepais() {
        return clavepais;
    }

    public void setClavepais(String clavepais) {
        this.clavepais = clavepais;
    }

    public String getNombrepais() {
        return nombrepais;
    }

    public void setNombrepais(String nombrepais) {
        this.nombrepais = nombrepais;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getClaveidioma() {
        return claveidioma;
    }

    public void setClaveidioma(String claveidioma) {
        this.claveidioma = claveidioma;
    }

    public String getClavegrupo() {
        return clavegrupo;
    }

    public void setClavegrupo(String clavegrupo) {
        this.clavegrupo = clavegrupo;
    }

    public BigDecimal getImporterci() {
        return importerci;
    }

    public void setImporterci(BigDecimal importerci) {
        this.importerci = importerci;
    }

    public String getLadainternacional() {
        return ladainternacional;
    }

    public void setLadainternacional(String ladainternacional) {
        this.ladainternacional = ladainternacional;
    }
    
    
    
    
    
    
    
}
