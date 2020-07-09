/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group.spcsystems.entity;

/**
 *
 * @author mrivero
 */
public class PedidosDetalle {
    
    Integer id;
    Articulos articulo_id;
    Pedido pedido_id;
    Double cantidad;
    Double precio;
    Double total;
    
    public PedidosDetalle() {   
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Articulos getArticulo_id() {
        return articulo_id;
    }

    public void setArticulo_id(Articulos articulo_id) {
        this.articulo_id = articulo_id;
    }

    public Pedido getPedido_id() {
        return pedido_id;
    }

    public void setPedido_id(Pedido pedido_id) {
        this.pedido_id = pedido_id;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

  
    
}
