/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group.spcsystems.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.group.spcsystems.entity.Pedidos;
import com.group.spcsystems.controllers.JessmarController;
import com.group.spcsystems.entity.Articulos;
import com.group.spcsystems.entity.Cattipopedido;
import com.group.spcsystems.entity.Cfdiuso;
import com.group.spcsystems.entity.Clientes;
import com.group.spcsystems.entity.Estados;
import com.group.spcsystems.entity.Usuarios;
import com.group.spcsystems.entity.Vendedores;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.IOException;
import javax.annotation.security.PermitAll;
import javax.ws.rs.Consumes;
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
    public Response getListaPedidos(
     @FormParam("status") String estatus
    ) {  
        
          List<Pedidos> pedidos = new ArrayList<Pedidos>();
          Map<String, Object> resp = new HashMap<String, Object> ();
          
          try{
              JessmarController controller = new JessmarController();
              pedidos = controller.getListaPedidos(estatus);
          }catch(Exception ex){
                resp.put("success", Boolean.FALSE);
                resp.put("erromsg", ex.getMessage());
                resp.put("payload", null);
                return Response.status(200).entity(resp).build();
          }
        
          return Response.status(200).entity(pedidos).build(); 
          
    }  
    
    @PermitAll 
    @POST
    @Path("/getListaPedidosFull")
    @Produces("application/json")
    public Response getListaPedidosFull(
     @FormParam("status") String estatus
    ) {  
        
          Map<String, Object> pedidos = new HashMap<String, Object> ();
          Map<String, Object> resp = new HashMap<String, Object> ();
          
          try{
              JessmarController controller = new JessmarController();
            pedidos = controller.getListaPedidoFull(estatus);
          }catch(Exception ex){
                resp.put("success", Boolean.FALSE);
                resp.put("erromsg", ex.getMessage());
                resp.put("payload", null);
                return Response.status(200).entity(resp).build();
          }
        
          return Response.status(200).entity(pedidos).build(); 
          
    }  
    
    @PermitAll 
    @POST
    @Path("/getListaUsuarios")
    @Produces("application/json")
    public Response getListaUsuarios() {  
        
          List<Usuarios> usuarios = new ArrayList<Usuarios>();
          Map<String, Object> resp = new HashMap<String, Object> ();
          
          try{
              JessmarController controller = new JessmarController();
            usuarios = controller.getListaUsuarios();
          }catch(Exception ex){
                resp.put("success", Boolean.FALSE);
                resp.put("erromsg", ex.getMessage());
                resp.put("payload", null);
                return Response.status(200).entity(resp).build();
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
          Map<String, Object> resp = new HashMap<String, Object> ();
          
          try{
              JessmarController controller = new JessmarController();
            usuario = controller.getOneUsuario(idusuario);
          }catch(Exception ex){
                resp.put("success", Boolean.FALSE);
                resp.put("erromsg", ex.getMessage());
                resp.put("payload", null);
                return Response.status(200).entity(resp).build();
          }
        
          return Response.status(200).entity(usuario).build(); 
          
    }  
    
    
    @PermitAll 
    @POST
    @Path("/getCatalogoTipoPedido")
    @Produces("application/json")
    public Response getCatalogoTipoPedido() {  
        
          List<Cattipopedido> cattipopedido = new ArrayList<Cattipopedido>();
          Map<String, Object> resp = new HashMap<String, Object> ();
          
          try{
              JessmarController controller = new JessmarController();
            cattipopedido = controller.getCatalogoTipoPedido();
          }catch(Exception ex){
                resp.put("success", Boolean.FALSE);
                resp.put("erromsg", ex.getMessage());
                resp.put("payload", null);
                return Response.status(200).entity(resp).build();
          }
        
          return Response.status(200).entity(cattipopedido).build(); 
          
    }  
    
    
    @PermitAll 
    @POST
    @Path("/getCatalogoVendedores")
    @Produces("application/json")
    public Response getCatalogoVendedores() {  
        
          List<Vendedores> vendedores = new ArrayList<Vendedores>();
          Map<String, Object> resp = new HashMap<String, Object> ();
          
          try{
              JessmarController controller = new JessmarController();
            vendedores = controller.getCatalogoVendedores();
          }catch(Exception ex){
                resp.put("success", Boolean.FALSE);
                resp.put("erromsg", ex.getMessage());
                resp.put("payload", null);
                return Response.status(200).entity(resp).build();
          }
        
          return Response.status(200).entity(vendedores).build(); 
          
    }  
    
    
    
    
    
    @PermitAll 
    @POST
    @Path("/getCatalogoClientes")
    @Produces("application/json")
    public Response getCatalogoClientes() {  
        
          List<Clientes> clientes = new ArrayList<Clientes>();
          Map<String, Object> resp = new HashMap<String, Object> ();
           
          try{
              JessmarController controller = new JessmarController();
            clientes = controller.getCatalogoClientes();
          }catch(Exception ex){
                resp.put("success", Boolean.FALSE);
                resp.put("erromsg", ex.getMessage());
                resp.put("payload", null);
                return Response.status(200).entity(resp).build();
          }
        
          return Response.status(200).entity(clientes).build(); 
          
    } 
    
    
    @PermitAll 
    @POST
    @Path("/getCatalogoArticulos")
    @Produces("application/json")
    public Response getCatalogoArticulos() {  
        
          List<Articulos> articulos = new ArrayList<Articulos>();
          Map<String, Object> resp = new HashMap<String, Object> ();
           
          try{
              JessmarController controller = new JessmarController();
            articulos = controller.getCatalogoArticulos();
          }catch(Exception ex){
                resp.put("success", Boolean.FALSE);
                resp.put("erromsg", ex.getMessage());
                resp.put("payload", null);
                return Response.status(200).entity(resp).build();
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
          Map<String, Object> resp = new HashMap<String, Object> ();
          
          try{
            JessmarController controller = new JessmarController();
            articulos = controller.getListaArticulos();
          }catch(Exception ex){
                resp.put("success", Boolean.FALSE);
                resp.put("erromsg", ex.getMessage());
                resp.put("payload", null);
                return Response.status(200).entity(resp).build(); 
          }
        
          return Response.status(200).entity(articulos).build(); 
          
    } 
    
    
    @PermitAll 
    @POST
    @Path("/getListaArticulosFull")
    @Produces("application/json")
    public Response getListaArticulosFull() {  
        
          Map<String, Object> articulos = new HashMap<String, Object>();
          Map<String, Object> resp = new HashMap<String, Object> ();
          
          try{
            JessmarController controller = new JessmarController();
            articulos = controller.getListaArticulosFull();
          }catch(Exception ex){
                resp.put("success", Boolean.FALSE);
                resp.put("erromsg", ex.getMessage());
                resp.put("payload", null);
                return Response.status(200).entity(resp).build(); 
          }
        
          return Response.status(200).entity(articulos).build(); 
          
    } 
    
    
    @PermitAll 
    @POST
    @Path("/getPedidoById")
    @Produces("application/json")
    @Consumes("application/x-www-form-urlencoded")
    public Response getPedidoById( 
            @FormParam("id") String id
    ) {  
      
        
          Map<String, Object> pedido = new HashMap<String, Object>();
          Map<String, Object> resp = new HashMap<String, Object> ();
          
          try{
             JessmarController controller = new JessmarController();
            pedido = controller.getPedidoById(id);
          }catch(Exception ex){
                resp.put("success", Boolean.FALSE);
                resp.put("erromsg", ex.getMessage());
                resp.put("payload", null);
                return Response.status(200).entity(resp).build(); 
          }
        
          return Response.status(200).entity(pedido).build(); 
          
    }
    
    
    @PermitAll
    @POST
    @Path("/insertaPedido")
    @Produces("application/json")
    @Consumes("application/x-www-form-urlencoded")
    public Response insertaPedido(
            @FormParam("json") String json
    ){
        
            System.out.println(json);
            //json = json.replace("json=", "");
        
            Map<String, Object> resp = new HashMap<String, Object> ();
            ObjectMapper mapper = new ObjectMapper();
            
            
            try{
                JessmarController controller = new JessmarController();
                Map<String, Object> mapa = mapper.readValue(json, Map.class);
                resp = controller.insertaPedido(mapa);
            }catch(IOException e){
                e.printStackTrace();
                resp.put("success", Boolean.FALSE);
                resp.put("erromsg", e.getMessage());
                resp.put("payload", null);
                return Response.status(200).entity(resp).build(); 
            }
        
             
        
          return Response.status(200).entity(resp).build();
    }
    
    @PermitAll
    @POST
    @Path("/getOneClienteById")
    @Produces("application/json")
    @Consumes("application/x-www-form-urlencoded")
    public Response getOneClienteById( @FormParam("id") String id ){
        
           Clientes cliente = new Clientes();
           Map<String, Object> resp = new HashMap<String, Object> ();
          
          try{
              JessmarController controller = new JessmarController();
              cliente = controller.getOneClienteById(id);
          }catch(Exception ex){
                resp.put("success", Boolean.FALSE);
                resp.put("erromsg", ex.getMessage());
                resp.put("payload", null);
                return Response.status(200).entity(resp).build();
          }
        
          return Response.status(200).entity(cliente).build(); 
    }
    
    @PermitAll
    @POST
    @Path("/getOneVendedorById")
    @Produces("application/json")
    @Consumes("application/x-www-form-urlencoded")
    public Response getOneVendedorById( @FormParam("id") String id ){
        
           Vendedores vendedor = new Vendedores();
           Map<String, Object> resp = new HashMap<String, Object> ();
          
          try{
              JessmarController controller = new JessmarController();
              vendedor = controller.getOneVendedorById(id);
          }catch(Exception ex){
                resp.put("success", Boolean.FALSE);
                resp.put("erromsg", ex.getMessage());
                resp.put("payload", null);
                return Response.status(200).entity(resp).build();
          }
        
          return Response.status(200).entity(vendedor).build(); 
    }
    
    
    @PermitAll
    @POST
    @Path("/getOneArticuloById")
    @Produces("application/json")
    @Consumes("application/x-www-form-urlencoded")
    public Response getOneArticuloById( @FormParam("id") String id ){
        
           Articulos articulo = new Articulos();
           Map<String, Object> resp = new HashMap<String, Object> ();
          
          try{
              JessmarController controller = new JessmarController();
              articulo = controller.getOneArticuloById(id);
          }catch(Exception ex){
                resp.put("success", Boolean.FALSE);
                resp.put("erromsg", ex.getMessage());
                resp.put("payload", null);
                return Response.status(200).entity(resp).build();
          }
        
          return Response.status(200).entity(articulo).build(); 
    }
    
    
    @PermitAll
    @POST
    @Path("/getOneArticuloByIdFull")
    @Produces("application/json")
    @Consumes("application/x-www-form-urlencoded")
    public Response getOneArticuloByIdFull( @FormParam("id") String id ){
        
          
           Map<String, Object> resp = new HashMap<String, Object> ();
          
          try{
              JessmarController controller = new JessmarController();
              resp = controller.getOneArticuloByIdFull(id);
          }catch(Exception ex){
                resp.put("success", Boolean.FALSE);
                resp.put("erromsg", ex.getMessage());
                resp.put("payload", null);
                return Response.status(200).entity(resp).build();
          }
        
          return Response.status(200).entity(resp).build(); 
    }
    
    @PermitAll
    @POST
    @Path("/getListaPedidoDetalleByIdPedido")
    @Produces("application/json")
    @Consumes("application/x-www-form-urlencoded")
    public Response getListaPedidoDetallelByIdPedido( @FormParam("id") String id ){
        
          
           Map<String, Object> resp = new HashMap<String, Object> ();
          
          try{
              JessmarController controller = new JessmarController();
              resp = controller.getListaPedidoDetalleByIdPedido(id);
          }catch(Exception ex){
                resp.put("success", Boolean.FALSE);
                resp.put("erromsg", ex.getMessage());
                resp.put("payload", null);
                return Response.status(200).entity(resp).build();
          }
        
          return Response.status(200).entity(resp).build(); 
    }
    
    
    @PermitAll
    @POST
    @Path("/deletePedidoDetalleById")
    @Produces("application/json")
    @Consumes("application/x-www-form-urlencoded")
    public Response deletePedidoDetalleById( @FormParam("id") String id ){
        
          
           Map<String, Object> resp = new HashMap<String, Object> ();
          
          try{
              JessmarController controller = new JessmarController();
              resp = controller.deletePedidoDetalleById(id);
          }catch(Exception ex){
                resp.put("success", Boolean.FALSE);
                resp.put("erromsg", ex.getMessage());
                resp.put("payload", null);
                return Response.status(200).entity(resp).build();
          }
        
          return Response.status(200).entity(resp).build(); 
    }
    
    
    @PermitAll
    @POST
    @Path("/insertaCliente")
    @Produces("application/json")
    @Consumes("application/x-www-form-urlencoded")
    public Response insertaCliente(
            @FormParam("json") String json
    ){
        
            System.out.println(json);
            //json = json.replace("json=", "");
        
            Map<String, Object> resp = new HashMap<String, Object> ();
            ObjectMapper mapper = new ObjectMapper();
            
            
            try{
                JessmarController controller = new JessmarController();
                Map<String, Object> mapa = mapper.readValue(json, Map.class);
                resp = controller.insertaCliente(mapa);
            }catch(IOException e){
                e.printStackTrace();
                resp.put("success", Boolean.FALSE);
                resp.put("erromsg", e.getMessage());
                resp.put("payload", null);
                return Response.status(200).entity(resp).build(); 
            }
        
             
        
          return Response.status(200).entity(resp).build();
    }
    
    
    
    @PermitAll
    @POST
    @Path("/insertaArticulo")
    @Produces("application/json")
    @Consumes("application/x-www-form-urlencoded")
    public Response insertaArticulo(
            @FormParam("json") String json
    ){
        
            System.out.println(json);
            //json = json.replace("json=", "");
        
            Map<String, Object> resp = new HashMap<String, Object> ();
            ObjectMapper mapper = new ObjectMapper();
            
            
            try{
                JessmarController controller = new JessmarController();
                Map<String, Object> mapa = mapper.readValue(json, Map.class);
                resp = controller.insertaArticulo(mapa);
            }catch(IOException e){
                e.printStackTrace();
                resp.put("success", Boolean.FALSE);
                resp.put("erromsg", e.getMessage());
                resp.put("payload", null);
                return Response.status(200).entity(resp).build(); 
            }
        
             
        
          return Response.status(200).entity(resp).build();
    }
    
    
    @PermitAll
    @POST
    @Path("/insertaVendedor")
    @Produces("application/json")
    @Consumes("application/x-www-form-urlencoded")
    public Response insertaVendedor(
            @FormParam("json") String json
    ){
        
            System.out.println(json);
           
        
            Map<String, Object> resp = new HashMap<String, Object> ();
            ObjectMapper mapper = new ObjectMapper();
            
            
            try{
                JessmarController controller = new JessmarController();
                Map<String, Object> mapa = mapper.readValue(json, Map.class);
                resp = controller.insertaVendedor(mapa);
            }catch(IOException e){
                e.printStackTrace();
                resp.put("success", Boolean.FALSE);
                resp.put("erromsg", e.getMessage());
                resp.put("payload", null);
                return Response.status(200).entity(resp).build(); 
            }
        
             
        
          return Response.status(200).entity(resp).build();
    }
    
    
    @PermitAll 
    @POST
    @Path("/getCatalogoUnidadesMedida")
    @Produces("application/json")
    public Response getCatalogoUnidadesMedida() {  
        
          Map<String, Object> pedidos = new HashMap<String, Object> ();
          Map<String, Object> resp = new HashMap<String, Object> ();
          
          try{
              JessmarController controller = new JessmarController();
            pedidos = controller.getCatalogoUnidadesMedida();
          }catch(Exception ex){
                resp.put("success", Boolean.FALSE);
                resp.put("erromsg", ex.getMessage());
                resp.put("payload", null);
                return Response.status(200).entity(resp).build();
          }
        
          return Response.status(200).entity(pedidos).build(); 
          
    }
    
    
    @PermitAll 
    @POST
    @Path("/getUnidadMedidaById")
    @Produces("application/json")
    @Consumes("application/x-www-form-urlencoded")
    public Response getUnidadMedidaById(  @FormParam("id") String id) {  
        
          Map<String, Object> unidadMedia = new HashMap<String, Object> ();
          Map<String, Object> resp = new HashMap<String, Object> ();
          
          try{
              JessmarController controller = new JessmarController();
                unidadMedia = controller.getUnidadMedidaById(id);
          }catch(Exception ex){
                resp.put("success", Boolean.FALSE);
                resp.put("erromsg", ex.getMessage());
                resp.put("payload", null);
                return Response.status(200).entity(resp).build();
          }
        
          return Response.status(200).entity(unidadMedia).build(); 
          
    }
    
    
    @PermitAll 
    @POST
    @Path("/getListaPaises")
    @Produces("application/json")
    public Response getListaPaises() {  
        
          Map<String, Object> paises = new HashMap<String, Object> ();
          Map<String, Object> resp = new HashMap<String, Object> ();
          
          try{
              JessmarController controller = new JessmarController();
              paises = controller.getListaPaises();
          }catch(Exception ex){
                resp.put("success", Boolean.FALSE);
                resp.put("erromsg", ex.getMessage());
                resp.put("payload", null);
                return Response.status(200).entity(resp).build();
          }
        
          return Response.status(200).entity(paises).build(); 
          
    }
    
    @PermitAll 
    @POST
    @Path("/getPaisById")
    @Produces("application/json")
    @Consumes("application/x-www-form-urlencoded")
    public Response getPaisById(  @FormParam("id") String id) {  
        
          Map<String, Object> pais = new HashMap<String, Object> ();
          Map<String, Object> resp = new HashMap<String, Object> ();
          
          try{
              JessmarController controller = new JessmarController();
                pais = controller.getPaisById(id);
          }catch(Exception ex){
                resp.put("success", Boolean.FALSE);
                resp.put("erromsg", ex.getMessage());
                resp.put("payload", null);
                return Response.status(200).entity(resp).build();
          }
        
          return Response.status(200).entity(pais).build(); 
          
    }
    
    @PermitAll 
    @POST
    @Path("/getListaEstadosFull")
    @Produces("application/json")
    public Response getListaEstadosFull() {  
        
          Map<String, Object> estados = new HashMap<String, Object> ();
          Map<String, Object> resp = new HashMap<String, Object> ();
          
          try{
              JessmarController controller = new JessmarController();
              estados = controller.getListaEstadosFull();
          }catch(Exception ex){
                resp.put("success", Boolean.FALSE);
                resp.put("erromsg", ex.getMessage());
                resp.put("payload", null);
                return Response.status(200).entity(resp).build();
          }
        
          return Response.status(200).entity(estados).build(); 
          
    }
    
    @POST
    @Path("/getListaEstados")
    @Produces("application/json")
    public Response getListaEstados() {  
        
          List<Estados> estados = new ArrayList<Estados>();
          Map<String, Object> resp = new HashMap<String, Object> ();
          
          try{
              JessmarController controller = new JessmarController();
              estados = controller.getListaEstados();
          }catch(Exception ex){
                resp.put("success", Boolean.FALSE);
                resp.put("erromsg", ex.getMessage());
                resp.put("payload", null);
                return Response.status(200).entity(resp).build();
          }
        
          return Response.status(200).entity(estados).build(); 
          
    } 
    
    
    @PermitAll 
    @POST
    @Path("/getEstadoById")
    @Produces("application/json")
    @Consumes("application/x-www-form-urlencoded")
    public Response getEstadoById(  @FormParam("id") String id) {  
        
          Map<String, Object> estado = new HashMap<String, Object> ();
          Map<String, Object> resp = new HashMap<String, Object> ();
          
          try{
              JessmarController controller = new JessmarController();
                estado = controller.getEstadoById(id);
          }catch(Exception ex){
                resp.put("success", Boolean.FALSE);
                resp.put("erromsg", ex.getMessage());
                resp.put("payload", null);
                return Response.status(200).entity(resp).build();
          }
        
          return Response.status(200).entity(estado).build(); 
          
    }
    
    
    @PermitAll 
    @POST
    @Path("/getListaUsoCFDI_Full")
    @Produces("application/json")
    public Response getListaUsoCFDI_Full() {  
        
          Map<String, Object> listausoscfdi = new HashMap<String, Object> ();
          Map<String, Object> resp = new HashMap<String, Object> ();
          
          try{
              JessmarController controller = new JessmarController();
              listausoscfdi = controller.getListaUsoCFDI_Full();
          }catch(Exception ex){
                resp.put("success", Boolean.FALSE);
                resp.put("erromsg", ex.getMessage());
                resp.put("payload", null);
                return Response.status(200).entity(resp).build();
          }
        
          return Response.status(200).entity(listausoscfdi).build(); 
          
    }
    
    @PermitAll
    @POST
    @Path("/getListaUsoCFDI")
    @Produces("application/json")
    public Response getListaUsoCFDI() {  
        
          List<Cfdiuso> listaUsocfdi = new ArrayList<Cfdiuso>();
          Map<String, Object> resp = new HashMap<String, Object> ();
          
          try{
              JessmarController controller = new JessmarController();
              listaUsocfdi = controller.getListaUsoCFDI();
          }catch(Exception ex){
                resp.put("success", Boolean.FALSE);
                resp.put("erromsg", ex.getMessage());
                resp.put("payload", null);
                return Response.status(200).entity(resp).build();
          }
        
          return Response.status(200).entity(listaUsocfdi).build(); 
          
    } 
    
    @PermitAll 
    @POST
    @Path("/getUsoCfdiById")
    @Produces("application/json")
    @Consumes("application/x-www-form-urlencoded")
    public Response getUsoCfdiById(  @FormParam("id") String id) {  
        
          Map<String, Object> usocfdi = new HashMap<String, Object> ();
          Map<String, Object> resp = new HashMap<String, Object> ();
          
          try{
              JessmarController controller = new JessmarController();
                usocfdi = controller.getUsoCfdiById(id);
          }catch(Exception ex){
                resp.put("success", Boolean.FALSE);
                resp.put("erromsg", ex.getMessage());
                resp.put("payload", null);
                return Response.status(200).entity(resp).build();
          }
        
          return Response.status(200).entity(usocfdi).build(); 
          
    }
    
    @PermitAll 
    @POST
    @Path("/getListaHieleras")
    @Produces("application/json")
    public Response getListaHieleras() {  
        
          Map<String, Object> listaHieleras = new HashMap<String, Object> ();
          Map<String, Object> resp = new HashMap<String, Object> ();
          
          try{
              JessmarController controller = new JessmarController();
              listaHieleras = controller.getListaHieleras();
          }catch(Exception ex){
                resp.put("success", Boolean.FALSE);
                resp.put("erromsg", ex.getMessage());
                resp.put("payload", null);
                return Response.status(200).entity(resp).build();
          }
        
          return Response.status(200).entity(listaHieleras).build(); 
          
    }
    
    
    @PermitAll 
    @POST
    @Path("/getHieleraById")
    @Produces("application/json")
    @Consumes("application/x-www-form-urlencoded")
    public Response getHieleraById(  @FormParam("id") String id) {  
        
          Map<String, Object> hielera = new HashMap<String, Object> ();
          Map<String, Object> resp = new HashMap<String, Object> ();
          
          try{
              JessmarController controller = new JessmarController();
                hielera = controller.getHieleraById(id);
          }catch(Exception ex){
                resp.put("success", Boolean.FALSE);
                resp.put("erromsg", ex.getMessage());
                resp.put("payload", null);
                return Response.status(200).entity(resp).build();
          }
        
          return Response.status(200).entity(hielera).build(); 
          
    }
    
    @PermitAll
    @POST
    @Path("/insertaHielera")
    @Produces("application/json")
    @Consumes("application/x-www-form-urlencoded")
    public Response insertaHielera(
            @FormParam("json") String json
    ){
        
            System.out.println(json);
            //json = json.replace("json=", "");
        
            Map<String, Object> resp = new HashMap<String, Object> ();
            ObjectMapper mapper = new ObjectMapper();
            
            
            try{
                JessmarController controller = new JessmarController();
                Map<String, Object> mapa = mapper.readValue(json, Map.class);
                resp = controller.insertaHielera(mapa);
            }catch(IOException e){
                e.printStackTrace();
                resp.put("success", Boolean.FALSE);
                resp.put("erromsg", e.getMessage());
                resp.put("payload", null);
                return Response.status(200).entity(resp).build(); 
            }
        
             
        
          return Response.status(200).entity(resp).build();
    }
    
    
    
    @PermitAll 
    @POST
    @Path("/getListaGrupo")
    @Produces("application/json")
    public Response getListaGrupo() {  
        
          Map<String, Object> listagrupo = new HashMap<String, Object> ();
          Map<String, Object> resp = new HashMap<String, Object> ();
          
          try{
              JessmarController controller = new JessmarController();
              listagrupo = controller.getListaGrupo();
          }catch(Exception ex){
                resp.put("success", Boolean.FALSE);
                resp.put("erromsg", ex.getMessage());
                resp.put("payload", null);
                return Response.status(200).entity(resp).build();
          }
        
          return Response.status(200).entity(listagrupo).build(); 
          
    }
    
    @PermitAll 
    @POST
    @Path("/getGrupoById")
    @Produces("application/json")
    @Consumes("application/x-www-form-urlencoded")
    public Response getGrupoById(  @FormParam("id") String id) {  
        
          Map<String, Object> grupo = new HashMap<String, Object> ();
          Map<String, Object> resp = new HashMap<String, Object> ();
          
          try{
              JessmarController controller = new JessmarController();
                grupo = controller.getGrupoById(id);
          }catch(Exception ex){
                resp.put("success", Boolean.FALSE);
                resp.put("erromsg", ex.getMessage());
                resp.put("payload", null);
                return Response.status(200).entity(resp).build();
          }
        
          return Response.status(200).entity(grupo).build(); 
          
    }
    
    
    @PermitAll 
    @POST
    @Path("/getListaPrecios")
    @Produces("application/json")
    public Response getListaPrecios( ) {  
        
          Map<String, Object> listaprecios = new HashMap<String, Object> ();
          Map<String, Object> resp = new HashMap<String, Object> ();
          
          try{
              JessmarController controller = new JessmarController();
              listaprecios = controller.getListaPrecios();
          }catch(Exception ex){
                resp.put("success", Boolean.FALSE);
                resp.put("erromsg", ex.getMessage());
                resp.put("payload", null);
                return Response.status(200).entity(resp).build();
          }
        
          return Response.status(200).entity(listaprecios).build(); 
          
    }
    
    @PermitAll 
    @POST
    @Path("/getListaPreciosByIdCliente")
    @Produces("application/json")
    @Consumes("application/x-www-form-urlencoded")
    public Response getListaPreciosByIdCliente(@FormParam("id") String id) {  
        
          Map<String, Object> listaprecios = new HashMap<String, Object> ();
          Map<String, Object> resp = new HashMap<String, Object> ();
          
          try{
              JessmarController controller = new JessmarController();
              listaprecios = controller.getListaPreciosByIdCliente(id);
          }catch(Exception ex){
                resp.put("success", Boolean.FALSE);
                resp.put("erromsg", ex.getMessage());
                resp.put("payload", null);
                return Response.status(200).entity(resp).build();
          }
        
          return Response.status(200).entity(listaprecios).build(); 
          
    }
    
    @PermitAll
    @POST
    @Path("/insertaPrecioArticuloCliente")
    @Produces("application/json")
    @Consumes("application/x-www-form-urlencoded")
    public Response insertaPrecioArticuloCliente(
            @FormParam("json") String json
    ){
        
            System.out.println(json);
            //json = json.replace("json=", "");
        
            Map<String, Object> resp = new HashMap<String, Object> ();
            ObjectMapper mapper = new ObjectMapper();
            
            
            try{
                JessmarController controller = new JessmarController();
                Map<String, Object> mapa = mapper.readValue(json, Map.class);
                resp = controller.insertaPrecioArticuloCliente(mapa);
            }catch(IOException e){
                e.printStackTrace();
                resp.put("success", Boolean.FALSE);
                resp.put("erromsg", e.getMessage());
                resp.put("payload", null);
                return Response.status(200).entity(resp).build(); 
            }
        
             
        
          return Response.status(200).entity(resp).build();
    }
    
}
