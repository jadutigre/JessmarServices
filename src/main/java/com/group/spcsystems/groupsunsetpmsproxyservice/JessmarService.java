/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group.spcsystems.groupsunsetpmsproxyservice;

import com.group.spcsystems.entity.Pedidos;
import com.group.spcsystems.controllers.JessmarController;
import com.group.spcsystems.entity.Usuarios;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.security.PermitAll;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
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
    
    
}
