/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group.spcsystems.entity;

/**
 *
 * @author jadut
 */
public class Pedidos {
    
       Integer id;
       String  fechapedido;             //Formato "yyyy-MM-dd HH:mm"
       String  usuario;
       Integer clientes_id;
       Integer vendedor_id;
       Integer tipopedido_id;
       String  areaentrega;       

    public Pedidos() {
    }
       
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFechapedido() {
        return fechapedido;
    }

    public void setFechapedido(String fechapedido) {
        this.fechapedido = fechapedido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Integer getClientes_id() {
        return clientes_id;
    }

    public void setClientes_id(Integer clientes_id) {
        this.clientes_id = clientes_id;
    }

    public Integer getVendedor_id() {
        return vendedor_id;
    }

    public void setVendedor_id(Integer vendedor_id) {
        this.vendedor_id = vendedor_id;
    }

    public Integer getTipopedido_id() {
        return tipopedido_id;
    }

    public void setTipopedido_id(Integer tipopedido_id) {
        this.tipopedido_id = tipopedido_id;
    }

    public String getAreaentrega() {
        return areaentrega;
    }

    public void setAreaentrega(String areaentrega) {
        this.areaentrega = areaentrega;
    }

    
}
