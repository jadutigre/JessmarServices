/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group.sunset.groupsunsetpmsproxyservice;

import com.group.sunset.entity.Pedidos;
import com.group.sunset.services.JessmarController;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.security.PermitAll;
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
    
    
    
    
}
