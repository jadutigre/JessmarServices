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
       String  fechapedido;
       String  usuario;
       Integer clientes_id;

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

    
}
