/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.group.sunset.groupsunsetpmsproxyservice;


import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import org.json.JSONObject;
 

import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
/**
 *
 * @author mrivero
 */
@Path("/huesped")
public class GuestService {
    
    /**
     *              Metodo PROXY que validara que el huesped este registrado en el hotel.
     *              Este metodo usara al sistema de AyB para autenticar
     * 
     * @param noHotel       Numero de club segun numeracion PMS
     * @param numReserva    Numero de reservacion
     * @param password      Password huesped. Sera igual al id del huesped en el sistema hotelero.
     * @return              Exito regreso el id del huesped. {"idhuesped": "xxxxx"}
     *                      Hotel No valido : {"error":"200"}
     *                      Hotel no contesta: {"error":"300"}
     *                      Configuracion invalida: {"error":"100"}
     */
    @POST
    @Path("/autentica")
    @Produces("application/json")
    public Response Autenticacion( @FormParam("hotel") Integer noHotel,
                                   @FormParam("reserva") String numReserva, 
                                   @FormParam("password") String password)  {
        
        String resp;
        TreeMap x = new TreeMap();
        Tool.Communicator toolcommunicator = new Tool.Communicator(); 
        
        String resultado = toolcommunicator.getLocalService(noHotel);
        if( resultado == "100" || resultado == "200"){                                       
                x.put("ERROR", "0" );
                return Response.status(200).entity(x).build();
        }
        String url = resultado +   
                "PMS_validahuesped?numreservacion=" + numReserva + 
                "&passwd=" + password +
                "&club=" + noHotel;
       
        //System.out.println("El url: " + url);
        
         JSONObject  jsonResponse = null;
        try {
            String page = toolcommunicator.executeHttpGet(url);
            
            jsonResponse = new JSONObject(page);
            resp = (jsonResponse.get("idhuesped") != null && jsonResponse.get("idhuesped") != "null")?jsonResponse.get("idhuesped").toString(): "0"; 
         
        } catch(Exception ex){
            Logger.getLogger(GuestService.class.getName()).log(Level.SEVERE, null, ex);
             x.put("ERROR","0" );
            return Response.status(200).entity(x).build();        
        }
         
          x.put("idhuesped",resp );
         
        
         return Response.status(200).entity(x).build();
    }
    
    
    
}
