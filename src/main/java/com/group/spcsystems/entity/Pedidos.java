/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group.spcsystems.entity;

import java.util.List;

/**
 *
 * @author jadut
 */
public class Pedidos {
    
       Integer id;
       String  fechapedido;             //Formato "yyyy-MM-dd HH:mm"
       Integer clientes_id;
       Integer vendedor_id;
       Integer tipopedido_id;
       String  areaentrega;
       String  status;             // puede ser :'abierto', 'cerrado' y 'cancelado'
       Usuarios usrabrio;       // Usuario que creo este pedido
       Usuarios usrcancelo;      // usuario que cancelo este pedido
       Usuarios usrcerro;       // Usuario que cerro el pedido
       String fechacierre;      //Formato "yyyy-MM-dd HH:mm" 
       String fechacancelado;   //Formato "yyyy-MM-dd HH:mm"
       
       List<PedidosDetalle> pedido_detalle;
       
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Usuarios getUsrabrio() {
        return usrabrio;
    }

    public void setUsrabrio(Usuarios usrabrio) {
        this.usrabrio = usrabrio;
    }

    public Usuarios getUsrcancelo() {
        return usrcancelo;
    }

    public void setUsrcancelo(Usuarios usrcancelo) {
        this.usrcancelo = usrcancelo;
    }

    public Usuarios getUsrcerro() {
        return usrcerro;
    }

    public void setUsrcerro(Usuarios usrcerro) {
        this.usrcerro = usrcerro;
    }

    public String getFechacierre() {
        return fechacierre;
    }

    public void setFechacierre(String fechacierre) {
        this.fechacierre = fechacierre;
    }

    public String getFechacancelado() {
        return fechacancelado;
    }

    public void setFechacancelado(String fechacancelado) {
        this.fechacancelado = fechacancelado;
    }

    public List<PedidosDetalle> getPedido_detalle() {
        return pedido_detalle;
    }

    public void setPedido_detalle(List<PedidosDetalle> pedido_detalle) {
        this.pedido_detalle = pedido_detalle;
    }
       
    
    
}
