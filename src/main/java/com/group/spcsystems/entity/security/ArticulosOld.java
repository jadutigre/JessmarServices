/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group.spcsystems.entity.security;

import com.group.spcsystems.entity.Almacen;
import com.group.spcsystems.entity.Catunidadmedidas;
import com.group.spcsystems.entity.Grupo;
import com.group.spcsystems.entity.Subgrupo;
import java.math.BigDecimal;


/**
 *
 * @author mrivero
 */
public class ArticulosOld {
    
    Integer id;
    Boolean activo;
    Integer grupo_id;
    Integer subgrupo_id;
    Integer unidmed_id;
    Integer almacen_id;
    String lugar;
    BigDecimal valoriva;
    BigDecimal pcio4;
    BigDecimal pcio3;
    BigDecimal pcio2;
    BigDecimal pcio1;
    String parte;
    String status;
    String codant;
    String codigo;
    BigDecimal minimo;
    BigDecimal maximo;
    BigDecimal valorutmin;
    BigDecimal valorutsug;
    String descripcion;
    
    public ArticulosOld() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Integer getGrupo_id() {
        return grupo_id;
    }

    public void setGrupo_id(Integer grupo_id) {
        this.grupo_id = grupo_id;
    }

    public Integer getSubgrupo_id() {
        return subgrupo_id;
    }

    public void setSubgrupo_id(Integer subgrupo_id) {
        this.subgrupo_id = subgrupo_id;
    }

    public Integer getUnidmed_id() {
        return unidmed_id;
    }

    public void setUnidmed_id(Integer unidmed_id) {
        this.unidmed_id = unidmed_id;
    }

    public Integer getAlmacen_id() {
        return almacen_id;
    }

    public void setAlmacen_id(Integer almacen_id) {
        this.almacen_id = almacen_id;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public BigDecimal getValoriva() {
        return valoriva;
    }

    public void setValoriva(BigDecimal valoriva) {
        this.valoriva = valoriva;
    }

    public BigDecimal getPcio4() {
        return pcio4;
    }

    public void setPcio4(BigDecimal pcio4) {
        this.pcio4 = pcio4;
    }

    public BigDecimal getPcio3() {
        return pcio3;
    }

    public void setPcio3(BigDecimal pcio3) {
        this.pcio3 = pcio3;
    }

    public BigDecimal getPcio2() {
        return pcio2;
    }

    public void setPcio2(BigDecimal pcio2) {
        this.pcio2 = pcio2;
    }

    public BigDecimal getPcio1() {
        return pcio1;
    }

    public void setPcio1(BigDecimal pcio1) {
        this.pcio1 = pcio1;
    }

    public String getParte() {
        return parte;
    }

    public void setParte(String parte) {
        this.parte = parte;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCodant() {
        return codant;
    }

    public void setCodant(String codant) {
        this.codant = codant;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public BigDecimal getMinimo() {
        return minimo;
    }

    public void setMinimo(BigDecimal minimo) {
        this.minimo = minimo;
    }

    public BigDecimal getMaximo() {
        return maximo;
    }

    public void setMaximo(BigDecimal maximo) {
        this.maximo = maximo;
    }

    public BigDecimal getValorutmin() {
        return valorutmin;
    }

    public void setValorutmin(BigDecimal valorutmin) {
        this.valorutmin = valorutmin;
    }

    public BigDecimal getValorutsug() {
        return valorutsug;
    }

    public void setValorutsug(BigDecimal valorutsug) {
        this.valorutsug = valorutsug;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

 
}
