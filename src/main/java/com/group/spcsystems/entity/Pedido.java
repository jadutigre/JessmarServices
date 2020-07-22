/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group.spcsystems.entity;

import com.group.spcsystems.entity.Pedidos;
import java.util.List;
/**
 *
 * @author mrivero
 */
public class Pedido {
    Pedidos pedido;
    List<PedidosDetalle> detalles;
    
    public Pedido () {}

    public Pedidos getPedido() {
        return pedido;
    }

    public void setPedido(Pedidos pedido) {
        this.pedido = pedido;
    }

    public List<PedidosDetalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<PedidosDetalle> detalles) {
        this.detalles = detalles;
    }
       
       
}
