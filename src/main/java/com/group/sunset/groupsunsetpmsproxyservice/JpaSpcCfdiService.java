/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group.sunset.groupsunsetpmsproxyservice;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 *
 * @author jaimedelgado
 */

@Path("/spccfdi")
public class JpaSpcCfdiService {
    
    
    
    
    @RolesAllowed("ADMIN")  
    @POST
    @Path("/getOneFormaPago")
    @Produces("application/json")
    public Response getOneFormaPago(@FormParam("idformapago") String idformapago) {
        
         System.out.println("getOneFormaPago");
        
         return Response.status(200).entity("test").build();
         
    }   
    
    
    @RolesAllowed("ADMIN")  
    @POST
    @Path("/getOneUsuario")
    @Produces("application/json")
    public Response getOneUsuario(@FormParam("usuario") String usuario) {
        
        System.out.println("getOneUsuario");
        
         return Response.status(200).entity("test").build();
         
    }    
    
    
    @RolesAllowed("ADMIN")
    @POST
    @Path("/getListaMetodoPago")
    @Produces("application/json")
    public Response getListaMetodoPago() {
        
        System.out.println("findCfdimetodopagoEntities");
        
         return Response.status(200).entity("test").build();
         
    } 
    
    @RolesAllowed("ADMIN")
    @POST
    @Path("/getListaMonedas")
    @Produces("application/json")
    public Response getListaMonedas() {
        
        System.out.println("findCfdimonedasEntities");
        
         return Response.status(200).entity("test").build();
         
    }     
    
    @RolesAllowed("ADMIN")
    @POST
    @Path("/getListaRegimenFiscal")
    @Produces("application/json")
    public Response getListaRegimenFiscal() {
        
        
         return Response.status(200).entity("test").build();
         
    } 

    @RolesAllowed("ADMIN")
    @POST
    @Path("/getListaUsoCfdi")
    @Produces("application/json")
    public Response getListaUsoCfdi() {
        
        System.out.println("findCfdiUsoCfdiEntities");
        
         return Response.status(200).entity("test").build();
         
    }

    @RolesAllowed("ADMIN")
    @POST
    @Path("/getListaRefaccionarias")
    @Produces("application/json")
    public Response getListaRefaccionarias() {
        
        System.out.println("findRefaccionariasEntities");
        
         return Response.status(200).entity("test").build();
         
    }
    
    @RolesAllowed("ADMIN")
    @POST
    @Path("/getListaclaveprodserv")
    @Produces("application/json")
    public Response getListaclaveprodserv() {
        
        System.out.println("getListaclaveprodserv");
        
         return Response.status(200).entity("test").build();
         
    }
    
    @RolesAllowed("ADMIN")
    @POST
    @Path("/getOneclaveprodserv")
    @Produces("application/json")
    public Response getOneclaveprodserv( @FormParam("clave") String clave) {
        
        
         return Response.status(200).entity("test").build();
         
    }
    

    @RolesAllowed("ADMIN")
    @POST
    @Path("/getListacfditipocomp")
    @Produces("application/json")
    public Response getListacfditipocomp() {
        
        System.out.println("findcfditipocompEntities");
        
         return Response.status(200).entity("test").build();
         
    }

    @RolesAllowed("ADMIN")
    @POST
    @Path("/getListacfditiporelacion")
    @Produces("application/json")
    public Response getListacfditiporelacion() {
        
        System.out.println("findcfditiporelacionEntities");
        
         return Response.status(200).entity("test").build();
         
    }    
    
}
