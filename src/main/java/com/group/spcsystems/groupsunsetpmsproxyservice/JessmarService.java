/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group.spcsystems.groupsunsetpmsproxyservice;

import com.group.spcsystems.entity.Pedidos;
import com.group.spcsystems.controllers.JessmarController;
import com.group.spcsystems.entity.Articulos;
import com.group.spcsystems.entity.Cattipopedido;
import com.group.spcsystems.entity.Clientes;
import com.group.spcsystems.entity.Usuarios;
import com.group.spcsystems.entity.Vendedores;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.security.PermitAll;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

/**
 *
 * @author jadut
 */

@Path("/jessmar")
public class JessmarService {
    
    
    @PermitAll 
    @POST
    @Path("/getListaPedidos")
    @Produces("application/json")
    public Response getListaPedidos() {  
        
          List<Pedidos> pedidos = new ArrayList<Pedidos>();
          
          try{
              JessmarController controller = new JessmarController();
            pedidos = controller.getListaPedidos();
          }catch(Exception ex){
                 ex.printStackTrace();
          }
        
          return Response.status(200).entity(pedidos).build(); 
          
    }  
    
    @PermitAll 
    @POST
    @Path("/getListaUsuarios")
    @Produces("application/json")
    public Response getListaUsuarios() {  
        
          List<Usuarios> usuarios = new ArrayList<Usuarios>();
          
          try{
              JessmarController controller = new JessmarController();
            usuarios = controller.getListaUsuarios();
          }catch(Exception ex){
                 ex.printStackTrace();
          }
        
          return Response.status(200).entity(usuarios).build(); 
          
    }  
    
    @PermitAll 
    @POST
    @Path("/getOneUsuario")
    @Produces("application/json")
    public Response getOneUsuario( 
            @FormParam("idusuario") String idusuario
    ) {  
        
          Usuarios usuario = new Usuarios();
          
          try{
              JessmarController controller = new JessmarController();
            usuario = controller.getOneUsuario(idusuario);
          }catch(Exception ex){
                 ex.printStackTrace();
          }
        
          return Response.status(200).entity(usuario).build(); 
          
    }  
    
    
    @PermitAll 
    @POST
    @Path("/getCatalogoTipoPedido")
    @Produces("application/json")
    public Response getCatalogoTipoPedido() {  
        
          List<Cattipopedido> cattipopedido = new ArrayList<Cattipopedido>();
          
          try{
              JessmarController controller = new JessmarController();
            cattipopedido = controller.getCatalogoTipoPedido();
          }catch(Exception ex){
                 ex.printStackTrace();
          }
        
          return Response.status(200).entity(cattipopedido).build(); 
          
    }  
    
    
    @PermitAll 
    @POST
    @Path("/getCatalogoVendedores")
    @Produces("application/json")
    public Response getCatalogoVendedores() {  
        
          List<Vendedores> vendedores = new ArrayList<Vendedores>();
          
          try{
              JessmarController controller = new JessmarController();
            vendedores = controller.getCatalogoVendedores();
          }catch(Exception ex){
                 ex.printStackTrace();
          }
        
          return Response.status(200).entity(vendedores).build(); 
          
    }  
    
    
    
    
    
    @PermitAll 
    @POST
    @Path("/getCatalogoClientes")
    @Produces("application/json")
    public Response getCatalogoClientes() {  
        
          List<Clientes> clientes = new ArrayList<Clientes>();
          
          try{
              JessmarController controller = new JessmarController();
            clientes = controller.getCatalogoClientes();
          }catch(Exception ex){
                 ex.printStackTrace();
          }
        
          return Response.status(200).entity(clientes).build(); 
          
    } 
    
    
    @PermitAll 
    @POST
    @Path("/getCatalogoArticulos")
    @Produces("application/json")
    public Response getCatalogoArticulos() {  
        
          List<Articulos> articulos = new ArrayList<Articulos>();
          
          try{
              JessmarController controller = new JessmarController();
            articulos = controller.getCatalogoArticulos();
          }catch(Exception ex){
                 ex.printStackTrace();
          }
        
          return Response.status(200).entity(articulos).build(); 
          
    } 
    
    /**
     * Metodo similar a getCatyalogoArticulos pero usando el ListMapHandler de deUtils
     * @return 
     */
    @PermitAll 
    @POST
    @Path("/getListaArticulos")
    @Produces("application/json")
    public Response getListaArticulos() {  
        
          Map<String, Object> articulos = new HashMap<String, Object>();
          
          try{
            JessmarController controller = new JessmarController();
            articulos = controller.getListaArticulos();
          }catch(Exception ex){
                 ex.printStackTrace();
          }
        
          return Response.status(200).entity(articulos).build(); 
          
    } 
    
    
    @PermitAll 
    @POST
    @Path("/getPedidoById")
    @Produces("application/json")
    @Consumes("application/x-www-form-urlencoded")
    public Response getPedidoById( @FormParam("id") String id ) {  
        System.out.println("servicio getPedidoById con id " + id );
          Map<String, Object> pedido = new HashMap<String, Object>();
          
          try{
              JessmarController controller = new JessmarController();
            pedido = controller.getPedidoById(id);
          }catch(Exception ex){
                 ex.printStackTrace();
          }
        
          return Response.status(200).entity(pedido).build(); 
          
    }
    
}
