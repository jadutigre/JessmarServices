/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.group.sunset.groupsunsetpmsproxyservice;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
 

import java.util.TreeMap;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
 
@Path("/hoteles")
public class CambioHabitacion
{
    
    @GET
    @Path("/region/{id}")
    @Produces("application/json")
    public Response getUserById(@PathParam("id") Integer id)
    {
        TreeMap x = new TreeMap();
        
        User user = new User();
        user.setId(id);
        user.setFirstName("Lokesh");
        user.setLastName("Gupta");
        
        x.put("User", user);
        
        
        return Response.status(200).entity(x).build();
    }
    
    
    
        @POST
	@Path("/hello/{param}")
        @Produces("application/json")
	public Response printMessage(@PathParam("param") Integer msg) {
            
 
        TreeMap x = new TreeMap();
        
        User user = new User();
        user.setId(msg);
        user.setFirstName("Lokesh");
        user.setLastName("Gupta");
        
        String cadena = "Test";
        
        
        x.put("User", user);
        x.put("Msg",cadena);
 
		return Response.status(200).entity(x).build();
 
	}   
        
    
       
         
    
    
}

