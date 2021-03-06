/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.group.spcsystems.controllers;

import Tool.JDBCUtils;
import com.group.spcsystems.entity.Articulos;
import com.group.spcsystems.entity.Cattipopedido;
import com.group.spcsystems.entity.Clientes;
import com.group.spcsystems.entity.Estados;
import com.group.spcsystems.entity.Pedidos;
import com.group.spcsystems.entity.PedidosDetalle;
import com.group.spcsystems.entity.Usuarios;
import com.group.spcsystems.entity.Vendedores;
import com.group.spcsystems.entity.Cfdiuso;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLRecoverableException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.apache.commons.validator.GenericValidator;

/**
 *
 * @author jadut
 */
public class JessmarController {
    
String  GET_LISTA_DE_PEDIDOS =               "select * from pedidos order by id  desc";
String  GET_LISTA_DE_PEDIDOS_WITH_STATUS =   "select * from pedidos where status = ? order by id  desc";
    
public List<Pedidos> getListaPedidos(String estatus){
 System.out.println("getListaPedidos");
 // el status puede ser: abierto, cerrado o cancelado o si es null, regreso todos
 Connection dbCon = null;
 List<Pedidos> listapedidos = new ArrayList<Pedidos>();
 
 try{
     
		dbCon = new JDBCUtils().connectDatabase();
                QueryRunner run = new QueryRunner();

                // Use the BeanListHandler implementation to convert all
                // ResultSet rows into a List of Person JavaBeans.
                ResultSetHandler<List<Pedidos>> h = new BeanListHandler<Pedidos>(Pedidos.class);

                if(estatus == null){
                     listapedidos = run.query(dbCon, GET_LISTA_DE_PEDIDOS, h );
                }else{
                    listapedidos = run.query(dbCon, GET_LISTA_DE_PEDIDOS_WITH_STATUS, h, estatus );
                }
               

 }catch(Exception e){
                e.printStackTrace();
 }finally{

            if(dbCon!=null){
                 try{
                     dbCon.close();
                 }catch(SQLException sqle){
                 }
             }
            
 }
return listapedidos;
}


String  GET_LISTA_DE_PEDIDOS_FULL ="select p.id as id" +
                                    ",IFNULL((select sum(pd.total) from pedidos_detalle as pd where pd.pedido_id = p.id),0) as totalpedido " +
                                    ",p.status as status " +
                                    ",p.fechapedido as fechapedido " +
                                    ",p.fechacancelado as fechacancelado " +
                                    ",p.fechacierre as fechacierre " +
                                    ",ua.id as usrabrio_id "  +
                                    ",ua.usuario as usuarioabre " +
                                    ",ua.nombre as usuarioabrenombre " +
                                    ",uc.id as usrcerro_id " +
                                    ",uc.usuario as usuariocierra " +
                                    ",uc.nombre as usuariocierranombre " +
                                    ",ux.id as usuariocancela_id " +
                                    ",ux.usuario as usuariocancela " +
                                    ",ux.nombre as usuariocancelanombre " +                                
                                    ",p.areaentrega as areaentrega " +
                                    ",tp.id as tipopedido_id " +
                                    ",tp.clave as tipoPedidoClave " +
                                    ",tp.descripcion as tipopedidodescripcion " +
                                    ",c.id as clientes_id " +
                                    ",c.nombre as clientenombre " +
                                    ",c.telefono as clienteTelefono  " +
                                    ",v.id as vendedor_id " +
                                    ",v.clave as vendedorClave " +
                                    ",v.nombre as vendedornombre " +
                                    ",hi.id as hielera_id " +
                                    ",hi.clave as hileraclave " +
                                    ",hi.descripcion as hieleradescripcion " +
                                    "from pedidos p " +
                                    "left join cattipopedido tp on  p.tipopedido_id = tp.id " +
                                    "left join clientes      c  on p.clientes_id = c.id  " +
                                    "left join vendedores    v  on p.vendedor_id = v.id " +
                                    "left join usuarios      ua on  p.usrabrio_id = ua.id " +
                                    "left join usuarios      uc on  p.usrcerro_id = uc.id " +
                                    "left join usuarios     ux  on  p.usrcancelo_id = ux.id " +
                                    "left join hieleras      hi on  p.hielera_id = hi.id  " ;

String WHERE    = " where p.status = 'abierto' ";
String ORDER_BY =  " order by p.id  desc ";




        
public Map<String, Object> getListaPedidoFull( String estatus, String finicial, String ffinal){
    
   if(estatus.isEmpty())
         estatus=null;
   
   if(finicial.isEmpty())
         finicial=null;
   
      if(ffinal.isEmpty())
         ffinal=null;
    
   Connection dbCon = null;
   Map<String, Object> resp = new HashMap<String, Object> ();
   List<Map<String, Object>> listapedidos = new ArrayList<Map<String, Object>>();
    
   String WHERE_FECHAS = " where status = ? and fechapedido between ? and ? ";
   String ORDER_BY_FECHAS = " order by fechapedido  desc, id desc";
   
   // SI una de las fecha no se da, solo rregresarw un dia.
   if( ffinal == null)
       ffinal = finicial;
     
    if( finicial == null)    
        finicial = ffinal;
    
    if(finicial != null && finicial.equals(ffinal) ){
        finicial = finicial + " 00:00:00";
        ffinal = ffinal + " 23:59:59";
    }
    
    
    
    if( estatus != null || finicial != null){
        if(estatus == null && finicial != null){  // fechas no nulas
            
            estatus = "abierto";
            WHERE_FECHAS =  " where status = ? and fechapedido between ? and ? " ;
            ORDER_BY_FECHAS = " order by fechapedido  asc, id asc";
            
        }
        else if(estatus != null && finicial != null){      // fechas nulas y estatus no nulo
            
            if(estatus.equals("abierto")){
                WHERE_FECHAS =  " where status = ? and fechapedido between ? and ? ";
                ORDER_BY_FECHAS = " order by fechapedido  asc, id asc";
            }else if(estatus.equals("cerrado")){
                WHERE_FECHAS =  " where status = ? and fechacierre between ? and ? ";
                ORDER_BY_FECHAS = " order by fechacierre  asc, id asc";
            }if(estatus.equals("cancelado")){
                WHERE_FECHAS =  " where status = ? and fechacancelado between ? and ? ";
                ORDER_BY_FECHAS = " order by fechacancelado  asc, id asc";
            }
            
        }else if(estatus != null && finicial == null){
            
            WHERE_FECHAS =  " where status = ?  ";
            ORDER_BY_FECHAS = " order by fechapedido  asc, id asc";
            
            
        }
    }
    
       
       //Procedo a grbar el encabezado
       try{
     
		dbCon = new JDBCUtils().connectDatabase();
                QueryRunner queryRunner = new QueryRunner();
                
                if(estatus == null && finicial == null  ){
                    listapedidos = queryRunner.query(dbCon, GET_LISTA_DE_PEDIDOS_FULL + WHERE + ORDER_BY, new MapListHandler() );
                }else if(finicial == null){
                    
                    listapedidos = queryRunner.query(dbCon, GET_LISTA_DE_PEDIDOS_FULL + WHERE_FECHAS +  ORDER_BY_FECHAS, new MapListHandler(), estatus );
                }else{
                    
                    listapedidos = queryRunner.query(dbCon, GET_LISTA_DE_PEDIDOS_FULL + WHERE_FECHAS +  ORDER_BY_FECHAS, new MapListHandler(), estatus, finicial, ffinal );
                } 
                
                
                //procesdo  la fecha
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
                for (Map<String, Object> pedido : listapedidos) {
                    String sfechapedido = sdf.format(pedido.get("fechapedido"));
                    pedido.remove("fechapedido");
                    pedido.put("fechapedido", sfechapedido);
                    
                    Object fechaobj = pedido.get("fechacierre");
                    pedido.remove("fechacierre");
                    if(fechaobj == null){
                        pedido.put("fechacierre", null);
                    }else{
                        String sfechacierre = sdf.format(fechaobj);                   
                        pedido.put("fechacierre", sfechacierre);
                    }
                    
                    fechaobj = pedido.get("fechacancelado");
                      pedido.remove("fechacancelado");
                    if(fechaobj == null){
                        pedido.put("fechacancelado", null);
                    }else{
                        String sfechacancelado = sdf.format(fechaobj);           
                        pedido.put("fechacancelado", sfechacancelado);
                    }
                    
                    
                }
                 
                   
                    
                
                if(listapedidos == null || listapedidos.isEmpty()){
                        resp.put("success", Boolean.FALSE);
                        resp.put("erromsg", "The Table is empty");
                        resp.put("payload", null);                    
                }else{
                        resp.put("success", Boolean.TRUE);
                        resp.put("erromsg", null);
                        resp.put("payload", listapedidos);
                }
                
                       
               
        }catch(Exception e){
            //procedo roolback
            DbUtils.rollbackAndCloseQuietly(dbCon);
            resp.put("success", Boolean.FALSE);
            resp.put("erromsg", e.getMessage());
            resp.put("payload", null);        
        }finally{

            if(dbCon!=null) {
                 try{
                     dbCon.close();
                 }catch(SQLException sqle){
                     resp.put("success", Boolean.FALSE);
                     resp.put("erromsg", sqle.getMessage());
                     resp.put("payload", null);      
                 }
             }
            
        }
       
       
    return resp;
}
    
String  GET_LISTA_DE_USUARIOS = "select * from usuarios order by id desc";
    
public List<Usuarios> getListaUsuarios(){
 System.out.println("getListaUsuarios");
 Connection dbCon = null;
 List<Usuarios> listausuarios = new ArrayList<Usuarios>();
 
 try{
     
		dbCon = new JDBCUtils().connectDatabase();
                QueryRunner run = new QueryRunner();

                // Use the BeanListHandler implementation to convert all
                // ResultSet rows into a List of Person JavaBeans.
                ResultSetHandler<List<Usuarios>> h = new BeanListHandler<Usuarios>(Usuarios.class);

                // Execute the SQL statement and return the results in a List of
                // Person objects generated by the BeanListHandler.
                listausuarios = run.query(dbCon, GET_LISTA_DE_USUARIOS, h );

 }catch(Exception e){
                e.printStackTrace();
 }finally{

            if(dbCon!=null){
                 try{
                     dbCon.close();
                 }catch(SQLException sqle){
                 }
             }
            
 }
return listausuarios;
}
    

public Usuarios getOneUsuario(String idusuario) {

     //TODO write your implementation code here:
     Usuarios   reng = null;
     Connection dbCon = null;
     try{

            dbCon =   new JDBCUtils().connectDatabase();

            QueryRunner run = new QueryRunner();

            // Use the BeanListHandler implementation to convert all
            // ResultSet rows into a List of Person JavaBeans.
            ResultSetHandler<Usuarios> h =
                    new BeanHandler<Usuarios>(Usuarios.class);

            // Execute the SQL statement and return the results in a List of
            // Person objects generated by the BeanListHandler.
            String query = "select * from usuarios where usuario=? ";

            reng = run.query(dbCon, query , h , idusuario);

     }catch ( SQLRecoverableException rec){

                rec.printStackTrace();

        }catch(Exception ex){
            
                ex.printStackTrace();
                
        }finally{
         
                if(dbCon!=null){
                     try{
                         dbCon.close();
                     }catch(SQLException sqle){
                             sqle.printStackTrace();
                     }
                 }

        }

    return reng;

}

String  GET_CATALOGO_TIPO_PEDIDO = "select * from cattipopedido order by id desc";

public List<Cattipopedido> getCatalogoTipoPedido(){
     //TODO write your implementation code here:
     List<Cattipopedido> cattipospedido = new ArrayList<Cattipopedido>();
     Connection dbCon = null;
     try{

            dbCon =   new JDBCUtils().connectDatabase();

            QueryRunner run = new QueryRunner();

            // Use the BeanListHandler implementation to convert all
            // ResultSet rows into a List of Person JavaBeans.
            ResultSetHandler<List<Cattipopedido>> h = new BeanListHandler<Cattipopedido>(Cattipopedido.class);
            

            // Execute the SQL statement and return the results in a List of
            // Person objects generated by the BeanListHandler.
         

            cattipospedido = run.query(dbCon, GET_CATALOGO_TIPO_PEDIDO , h );

     }catch ( SQLRecoverableException rec){

                rec.printStackTrace();

        }catch(Exception ex){
            
                ex.printStackTrace();
                
        }finally{
         
                if(dbCon!=null){
                     try{
                         dbCon.close();
                     }catch(SQLException sqle){
                             sqle.printStackTrace();
                     }
                 }

        }

    return cattipospedido;
}
    

String  GET_CATALOGO_VENDEDORES = "select * from vendedores where activo = true order by id asc";

public List<Vendedores> getCatalogoVendedores(){
     
     List<Vendedores> vendedores = new ArrayList<Vendedores>();
     Connection dbCon = null;
     try{

            dbCon =   new JDBCUtils().connectDatabase();

            QueryRunner run = new QueryRunner();

            // Use the BeanListHandler implementation to convert all
            // ResultSet rows into a List of Person JavaBeans.
            ResultSetHandler<List<Vendedores>> h = new BeanListHandler<Vendedores>(Vendedores.class);
            

            // Execute the SQL statement and return the results in a List of
            // Person objects generated by the BeanListHandler.
         

            vendedores = run.query(dbCon, GET_CATALOGO_VENDEDORES , h );

     }catch ( SQLRecoverableException rec){

                rec.printStackTrace();

        }catch(Exception ex){
            
                ex.printStackTrace();
                
        }finally{
         
                if(dbCon!=null){
                     try{
                         dbCon.close();
                     }catch(SQLException sqle){
                             sqle.printStackTrace();
                     }
                 }

        }

    return vendedores;
}


String  GET_CATALOGO_ARTICULOS = "select * from articulos where activo = true order by id asc";

public List<Articulos> getCatalogoArticulos(){
     
     List<Articulos> articulos = new ArrayList<Articulos>();
     Connection dbCon = null;
     try{

            dbCon =   new JDBCUtils().connectDatabase();

            QueryRunner run = new QueryRunner();

            // Use the BeanListHandler implementation to convert all
            // ResultSet rows into a List of Person JavaBeans.
            ResultSetHandler<List<Articulos>> h = new BeanListHandler<Articulos>(Articulos.class);
            

            // Execute the SQL statement and return the results in a List of
            // Person objects generated by the BeanListHandler.
         

            articulos = run.query(dbCon, GET_CATALOGO_ARTICULOS , h );

     }catch ( SQLRecoverableException rec){

                rec.printStackTrace();

        }catch(Exception ex){
            
                ex.printStackTrace();
                
        }finally{
         
                if(dbCon!=null){
                     try{
                         dbCon.close();
                     }catch(SQLException sqle){
                             sqle.printStackTrace();
                     }
                 }

        }

    return articulos;
}
    


String  GET_CATALOGO_CLIENTES = "select * from clientes  order by id asc";

public List<Clientes> getCatalogoClientes(){
     
     List<Clientes> clientes = new ArrayList<Clientes>();
     Connection dbCon = null;
     try{

            dbCon =   new JDBCUtils().connectDatabase();

            QueryRunner run = new QueryRunner();

            // Use the BeanListHandler implementation to convert all
            // ResultSet rows into a List of Person JavaBeans.
            ResultSetHandler<List<Clientes>> h = new BeanListHandler<Clientes>(Clientes.class);
            

            // Execute the SQL statement and return the results in a List of
            // Person objects generated by the BeanListHandler.
         

            clientes = run.query(dbCon, GET_CATALOGO_CLIENTES , h );

     }catch ( SQLRecoverableException rec){

                rec.printStackTrace();

        }catch(Exception ex){
            
                ex.printStackTrace();
                
        }finally{
         
                if(dbCon!=null){
                     try{
                         dbCon.close();
                     }catch(SQLException sqle){
                             sqle.printStackTrace();
                     }
                 }

        }

    return clientes;
}

 String  GET_LISTA_DE_ARTICULOS = "select * from articulos where activo = true order by id asc";

public Map<String, Object> getListaArticulos(){
 System.out.println("getListaArticulos");
 Connection dbCon = null;
 Map<String, Object> resp = new HashMap<String, Object> ();
 List<Map<String, Object>> listaarticulos = new ArrayList<Map<String, Object>>();
 
 try{
     
		dbCon = new JDBCUtils().connectDatabase();
                 QueryRunner queryRunner = new QueryRunner();
             
                listaarticulos = queryRunner.query(dbCon, GET_LISTA_DE_ARTICULOS, new MapListHandler() );
                
                if(listaarticulos == null || listaarticulos.isEmpty()){
                        resp.put("success", Boolean.FALSE);
                        resp.put("erromsg", "The Table is empty");
                        resp.put("payload", null);                    
                }else{
                        resp.put("success", Boolean.TRUE);
                        resp.put("erromsg", null);
                        resp.put("payload", listaarticulos);
                }

 }catch(Exception e){
                e.printStackTrace();
 }finally{

            if(dbCon!=null){
                 try{
                     dbCon.close();
                 }catch(SQLException sqle){
                 }
             }
            
 }
 return resp;

}


String GET_LISTAARTICULOS_FULL =  "select a.id as id " +
                                ",a.lugar as lugar " +
                                ",a.valoriva as valorIva " +
                                ",a.pcio1 as precio1 " +
                                ",a.pcio2 as precio2 " +
                                ",a.pcio3 as precio3 " +
                                ",a.pcio4 as precio4 " +
                                ",a.parte as parte " +
                                ",a.estatus as estatus " +
                                ",a.codant as codAnt " +
                                ",a.minimo as minimo " +
                                ",a.valorutmin as valorUtMin " +
                                ",a.maximo as maximo " +
                                ",a.codigo as codigo " +
                                ",a.cvesat "+
                                ",a.unidadsat "+
                                ",a.valorutsug as valorUtSug " +
                                ",a.descripcion as descripcion " +
                                ",a.activo as activo " +
                                ",g.id as grupoId " +
                                ",g.clave as grupoClave " +
                                ",g.descripcion as grupoDescripcion " +
                                ",sg.id as subgrupoId " +
                                ",sg.clave as subgrupoClave " +
                                ",sg.descripcion as subgrupoDescripcion " +
                                ",um.id as unidaMedidaId " +
                                ",um.clave as unidadMedidaClave " +
                                ",um.descripcion as unidadMedidaDescripcion " +
                                ",al.id as almacenId " +
                                ",al.clave as almacenClave " +
                                ",al.descripcion as almacenDescripcion " +
                                "from articulos a, grupo g, subgrupo sg, catunidadmedidas um, almacen al " +
                                "where  a.grupo_id = g.id " +
                                "and a.subgrupo_id = sg.id " +
                                "and a.unidmed_id = um.id " +
                                "and a.almacen_id = al.id " +
                                "order by a.descripcion asc";

public Map<String, Object> getListaArticulosFull(){
Connection dbCon = null;
Map<String, Object> resp = new HashMap<String, Object> ();
List<Map<String, Object>> listaarticulos = new ArrayList<Map<String, Object>>();
 
 try{
     
		dbCon = new JDBCUtils().connectDatabase();
                 QueryRunner queryRunner = new QueryRunner();
             
                listaarticulos = queryRunner.query(dbCon, GET_LISTAARTICULOS_FULL, new MapListHandler() );
                
                if(listaarticulos == null || listaarticulos.isEmpty()){
                        resp.put("success", Boolean.FALSE);
                        resp.put("erromsg", "The Table is empty");
                        resp.put("payload", null);                    
                }else{
                        resp.put("success", Boolean.TRUE);
                        resp.put("erromsg", null);
                        resp.put("payload", listaarticulos);
                }

 }catch(Exception e){
                e.printStackTrace();
 }finally{

            if(dbCon!=null){
                 try{
                     dbCon.close();
                 }catch(SQLException sqle){
                 }
             }
            
 }
 return resp;

}

String  GET_PEDIDOBYID =            "select p.id as id" +
                                    ",p.status as status " +
                                    ",p.fechapedido as fechapedido " +
                                    ",p.fechacancelado as fechacancelado " +
                                    ",p.fechacierre as fechacierre " +
                                    ",ua.id as usrabrio_id "  +
                                    ",ua.usuario as usuarioabre " +
                                    ",ua.nombre as usuarioabrenombre " +
                                    ",uc.id as usrcerro_id " +
                                    ",uc.usuario as usuariocierra " +
                                    ",uc.nombre as usuariocierranombre " +
                                    ",ux.id as usuariocancela_id " +
                                    ",ux.usuario as usuariocancela " +
                                    ",ux.nombre as usuariocancelanombre " +                                
                                    ",p.areaentrega as areaentrega " +
                                    ",tp.id as tipopedido_id " +
                                    ",tp.clave as tipoPedidoClave " +
                                    ",tp.descripcion as tipopedidodescripcion " +
                                    ",c.id as clientes_id " +
                                    ",c.nombre as clientenombre " +
                                    ",c.telefono as clienteTelefono  " +
                                    ",v.id as vendedor_id " +
                                    ",v.clave as vendedorClave " +
                                    ",v.nombre as vendedornombre " +
                                    ",hi.id as hielera_id " + 
                                    ",hi.clave as hileraclave  " +
                                    ",hi.descripcion as hieleradescripcion " +
                                    "from pedidos p " +
                                    "left join cattipopedido tp on  p.tipopedido_id = tp.id " +
                                    "left join clientes c       on p.clientes_id = c.id  " +
                                    "left join vendedores v     on p.vendedor_id = v.id " +
                                    "left join usuarios ua      on  p.usrabrio_id = ua.id " +
                                    "left join usuarios uc      on  p.usrcerro_id = uc.id " +
                                    "left join usuarios ux      on  p.usrcancelo_id = ux.id " +
                                    "left join hieleras hi      on  p.hielera_id = hi.id  " +
                                    "where p.id =  ";




String  GET_PEDIDOSDETALLE =    "select pd.id as id  " +
                                ",pd.cantidad as cantidad  " +
                                ",pd.total as total  " +
                                ",pd.precio as precio  " +
                                ",pd.pedido_id as pedido_id "+
                                ",a.id as articulo_id " +
                                ",a.codigo as articuloCodigo " +
                                ",a.descripcion as articulodescripcion " +
                                "from pedidos_detalle pd, articulos a " +
                                " where pd.articulo_id = a.id " +
                                " and pedido_id = ";

public Map<String, Object> getPedidoById(String id){
 System.out.println("getPedidoById con id " + id );
 Connection dbCon = null;
 
 Map<String, Object> pedido = new HashMap<String, Object>();
 List<Map<String, Object>> pedidosdetalle = new ArrayList<Map<String, Object>>();
 Map<String, Object> resp = new HashMap<String, Object> ();
  
 if(!StringUtils.isNumeric(id)){
     resp.put("success", Boolean.FALSE);
     resp.put("erromsg", "ID invalido");
     resp.put("payload", null);
     
     return resp;
 }
 
 try{
     
		dbCon = new JDBCUtils().connectDatabase();           
                QueryRunner queryRunner = new QueryRunner();
                
                pedido = queryRunner.query(dbCon, GET_PEDIDOBYID+id, new MapHandler() );
                
                
                if(pedido != null &&  !pedido.isEmpty() ){ //  Proceso detalles
                    
                    // cambio fecha a String
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
                    String sfechapedido = sdf.format(pedido.get("fechapedido"));
                    pedido.remove("fechapedido");
                    pedido.put("fechapedido", sfechapedido);
                    
                  
                    
                    Object fechaobj = pedido.get("fechacierre");
                    pedido.remove("fechacierre");
                    if(fechaobj == null){
                        pedido.put("fechacierre", null);
                    }else{
                        String sfechacierre = sdf.format(fechaobj);                   
                        pedido.put("fechacierre", sfechacierre);
                    }
                    
                    fechaobj = pedido.get("fechacancelado");
                      pedido.remove("fechacancelado");
                    if(fechaobj == null){
                        pedido.put("fechacancelado", null);
                    }else{
                        String sfechacancelado = sdf.format(pedido.get("fechacancelado"));           
                        pedido.put("fechacancelado", sfechacancelado);
                    }
                    
                    
                    
                    pedidosdetalle = queryRunner.query(dbCon, GET_PEDIDOSDETALLE+id, new MapListHandler() );
                    
                    
                    pedido.put("pedidosdetalle",pedidosdetalle);
                    
                    resp.put("success", Boolean.TRUE);
                    resp.put("erromsg", null);
                    resp.put("payload", pedido);
                    
                }else{
                    resp.put("success", Boolean.FALSE);
                    resp.put("erromsg", "ID not found");
                    resp.put("payload", null);
                }

 }catch(Exception e){
                e.printStackTrace();
 }finally{

            if(dbCon!=null){
                 try{
                     dbCon.close();
                 }catch(SQLException sqle){
                 }
             }
            
 }
return resp;
}


  

String  INSERT_PEDIDOS = "INSERT INTO pedidos(version, status, fechapedido, usrabrio_id, clientes_id, vendedor_id, tipopedido_id, hielera_id, areaentrega) VALUES(?,?,?,?,?,?,?,?,?)";
String  UPDATE_PEDIDOS = "UPDATE pedidos SET version=?, status=?, fechapedido=?, fechacierre=?, fechacancelado=?, usrabrio_id=?, usrcerro_id=?, usrcancelo_id=?, clientes_id=?, vendedor_id=?, tipopedido_id=?, hielera_id=?, areaentrega=? WHERE id=?";
String  INSERT_PEDIDODETALLE = "INSERT INTO pedidos_detalle(version, cantidad, total, precio, articulo_id, pedido_id ) VALUES (?,?,?,?,?,?)";
String  UPDATE_PEDIDODETALLE = "UPDATE pedidos_detalle SET version=?, cantidad=?, total=?, precio=?, articulo_id=?, pedido_id=? WHERE id=?";  
        
public Map<String, Object> insertaPedido(Map elpedido){
    
    Connection dbCon = null;
    Map<String, Object> resp = new HashMap<String, Object> ();
    Map<String, Object> payload = new HashMap<String, Object> ();
    ScalarHandler<Long> scalarHandler = new ScalarHandler<Long>(); // paraa qyue obtenga el id
    // Proceso el mapa del pedido y sus detalles.
    // CABECERA
       Integer id            =  elpedido.get("id") == null ? 0 :   (Integer)elpedido.get("id");  // si viene es update si no viene o es cero es insert
       Integer usrabrio_id   =  elpedido.get("usrabrio_id") == null ?  null  :(Integer)elpedido.get("usrabrio_id") ;
       Integer usrcancelo_id =  elpedido.get("usrcancelo_id") == null? null  : (Integer)elpedido.get("usrcancelo_id") ;
       Integer usrcerro_id   =  elpedido.get("usrcerro_id") == null ?  null  : (Integer)elpedido.get("usrcerro_id") ;
       Integer clientes_id   =  elpedido.get("clientes_id") == null ? 0      : (Integer)elpedido.get("clientes_id") ;
       Integer vendedor_id   =  elpedido.get("vendedor_id") == null ? 0      : (Integer)elpedido.get("vendedor_id");
       Integer tipopedido_id =  elpedido.get("tipopedido_id") == null ? 0    : (Integer)elpedido.get("tipopedido_id");
       String  fechapedido   =  (String) elpedido.get("fechapedido");  // formato yyyy-MM-dd HH:mmm la hpra en foprmato de 24 horas
       String  fechacierre   =  elpedido.get("fechacierre") == null ? null   : (String) elpedido.get("fechacierre");  // formato yyyy-MM-dd HH:mmm la hpra en foprmato de 24 horas
       String  fechacancelado=  elpedido.get("fechacancelado") == null ? null : (String) elpedido.get("fechacancelado");  // formato yyyy-MM-dd HH:mmm la hpra en foprmato de 24 horas
       String  status        =  elpedido.get("status") == null ? "abierto"   : (String)elpedido.get("status");
       String areaentrega    =  (String)elpedido.get("areaentrega");
       Integer hielera_id    =  elpedido.get("hielera_id") == null ? null        : (Integer)elpedido.get("hielera_id") ;
       List<Map<String, Object>> detalles = (List<Map<String, Object>>)elpedido.get("pedidosdetalle");
       
       if( !status.equals("abierto") &&  !status.equals("cerrado") &&  !status.equals("cancelado")){
            resp.put("success", Boolean.FALSE);
            resp.put("erromsg", "status de pedido invalido");
            resp.put("payload", null);
            return resp;
        }
       
       if(clientes_id == 0){
            resp.put("success", Boolean.FALSE);
            resp.put("erromsg", "cliente_id invalido");
            resp.put("payload", null);
            return resp;
       }
       
       if(vendedor_id == 0){
           resp.put("success", Boolean.FALSE);
            resp.put("erromsg", "Vendedor_id invalido");
            resp.put("payload", null);
            return resp;
       }
       
       if(tipopedido_id == 0){
            resp.put("success", Boolean.FALSE);
            resp.put("erromsg", "tipopedido_id invalido");
            resp.put("payload", null);
            return resp;
       }
       
       if( ! GenericValidator.isDate(fechapedido, "yyyy-MM-dd HH:mm", true) ){
            resp.put("success", Boolean.FALSE);
            resp.put("erromsg", "fecha invalida");
            resp.put("payload", null);
            return resp;
       }
       
        
       if(usrabrio_id == null || usrabrio_id == 0){
            resp.put("success", Boolean.FALSE);
            resp.put("erromsg", "usrabrio_id invalido");
            resp.put("payload", null);
            return resp;
       }
       
       // solo para caso update
       
       if(id  > 0 && status.equals("cerrado")  && (fechacierre == null ||   !GenericValidator.isDate(fechacierre, "yyyy-MM-dd HH:mm", true)) ){
            resp.put("success", Boolean.FALSE);
            resp.put("erromsg", "fecha cierre invalida");
            resp.put("payload", null);
            return resp;
       }
       
        if(id  > 0 && status.equals("cerrado") && usrcerro_id == null ){
            resp.put("success", Boolean.FALSE);
            resp.put("erromsg", "falta o es invalido el id del usuario  que cierra el pedido");
            resp.put("payload", null);
            return resp;
       }
       
       if(id  > 0 && status.equals( "cancelado") && (fechacancelado == null ||  !GenericValidator.isDate(fechacancelado, "yyyy-MM-dd HH:mm", true) )){
            resp.put("success", Boolean.FALSE);
            resp.put("erromsg", "fecha cancelacion invalida");
            resp.put("payload", null);
            return resp;
       }
      
       if(id  > 0 && status.equals( "cancelado") && usrcancelo_id == null ){
            resp.put("success", Boolean.FALSE);
            resp.put("erromsg", "falta o es invalido el id del usuario que cancela el pedido");
            resp.put("payload", null);
            return resp;
       }
       
            
       //Procedo a grbar el encabezado
       try{
     
		dbCon = new JDBCUtils().connectDatabase();           
                dbCon.setAutoCommit(false);
                QueryRunner queryRunner = new QueryRunner();
                
                 int numrows; 
                 Long newid = 0L;
                if( id != 0){ // Update
                                                                           
                   numrows = queryRunner.update(dbCon, UPDATE_PEDIDOS , 0, status, fechapedido, fechacierre, fechacancelado, usrabrio_id, usrcerro_id, usrcancelo_id, clientes_id, vendedor_id,tipopedido_id, hielera_id, areaentrega, id);
                    payload.put("actualizados", numrows);
                }
                else{
                         
                     newid = queryRunner.insert(dbCon, INSERT_PEDIDOS , scalarHandler, 0, status, fechapedido, usrabrio_id, clientes_id, vendedor_id,tipopedido_id, hielera_id, areaentrega);
                      payload.put("id", newid);
                }
                
                // Procedo a insertar o actualizar los detalles del pedido
               if(detalles != null && !detalles.isEmpty()){
                  for(Map<String, Object> det : detalles){
                        Integer elidDet =     det.get("id")          == null ? 0 : (Integer)det.get("id"); 
                        Integer articulo_id = det.get("articulo_id") == null ? 0    : (Integer)det.get("articulo_id");   
                        
                        Double cantidad = 0.0;
                        if(det.get("cantidad") instanceof Integer){
                            cantidad =     det.get("cantidad")    == null ? 0.00 :  new Double((Integer)det.get("cantidad")) ;
                        }else if(det.get("cantidad") instanceof Double){
                            cantidad =     det.get("cantidad")    == null ? 0.00 :  (Double)det.get("cantidad") ;
                        }
                        
                        Double precio = 0.0;
                        if( det.get("precio") instanceof Integer){
                            precio =       det.get("precio")      == null ? 0.00 : new Double((Integer)det.get("precio"));
                        }else if(det.get("precio") instanceof Double){
                            precio =       det.get("precio")      == null ? 0.00 : (Double)det.get("precio");
                        }    
                        
                        Double total = 0.0;
                        if( det.get("total") instanceof Integer){
                            total =        det.get("total")       == null ? 0.00 : new Double((Integer)det.get("total"));
                        }else if(det.get("total") instanceof Double){
                            total =        det.get("total")       == null ? 0.00 : (Double)det.get("total");                            
                        }
                        
                        if(id == 0){  // Es  insercion de maestro, tambien inserto todos los detALLESdetalles
                            queryRunner.insert(dbCon, INSERT_PEDIDODETALLE, scalarHandler , 0, cantidad, total, precio, articulo_id, newid);
                        }else{ //actualizo detalles o inserto nuevos dependiend si traen o no su id
                            if(elidDet ==  0){  // Inserto detlle
                                queryRunner.insert(dbCon, INSERT_PEDIDODETALLE, scalarHandler , 0, cantidad, total, precio, articulo_id, id);
                            }else{
                                queryRunner.update(dbCon, UPDATE_PEDIDODETALLE, 0, cantidad, total, precio, articulo_id, id , elidDet);
                            }
                        }
                        
                   }
               }
                
                // Finalizo
                DbUtils.commitAndCloseQuietly(dbCon);
                
                resp.put("success", Boolean.TRUE);
                resp.put("erromsg", null);
                resp.put("payload", payload);
               
        }catch(Exception e){
            //procedo roolback
            e.printStackTrace();
            DbUtils.rollbackAndCloseQuietly(dbCon);
            resp.put("success", Boolean.FALSE);
            resp.put("erromsg", e.getMessage());
            resp.put("payload", null);        
        }finally{

            if(dbCon!=null){
                 try{
                     dbCon.close();
                 }catch(SQLException sqle){
                     resp.put("success", Boolean.FALSE);
                     resp.put("erromsg", sqle.getMessage());
                     resp.put("payload", null);      
                 }
             }
            
        }
       
       
    return resp;
    
}


String GET_CLIENTEBYID = "Select * from clientes where id = ";
public Clientes getOneClienteById(String  id){
      
     Clientes   reng = null;
     Connection dbCon = null;
     try{

            dbCon =   new JDBCUtils().connectDatabase();

            QueryRunner run = new QueryRunner();

                
            ResultSetHandler<Clientes> h = new BeanHandler<Clientes>(Clientes.class);

            
            reng = run.query(dbCon, GET_CLIENTEBYID+id , h);

     }catch ( SQLRecoverableException rec){

                rec.printStackTrace();

        }catch(Exception ex){
            
                ex.printStackTrace();
                
        }finally{
         
                if(dbCon!=null){
                     try{
                         dbCon.close();
                     }catch(SQLException sqle){
                             sqle.printStackTrace();
                     }
                 }

        }

    return reng;
    
}


String GET_VENDEDORBYID = "Select * from vendedores where id = ";
public Vendedores getOneVendedorById(String  id){
      
     Vendedores   reng = null;
     Connection dbCon = null;
     try{

            dbCon =   new JDBCUtils().connectDatabase();

            QueryRunner run = new QueryRunner();

                
            ResultSetHandler<Vendedores> h = new BeanHandler<Vendedores>(Vendedores.class);

            
            reng = run.query(dbCon, GET_VENDEDORBYID+id , h);

     }catch ( SQLRecoverableException rec){

                rec.printStackTrace();

        }catch(Exception ex){
            
                ex.printStackTrace();
                
        }finally{
         
                if(dbCon!=null){
                     try{
                         dbCon.close();
                     }catch(SQLException sqle){
                             sqle.printStackTrace();
                     }
                 }

        }

    return reng;
    
}

String GET_ARTICULOBYID = "Select * from articulos where id = ";
public Articulos getOneArticuloById(String  id){
      
     Articulos   reng = null;
     Connection dbCon = null;
     try{

            dbCon =   new JDBCUtils().connectDatabase();

            QueryRunner run = new QueryRunner();

                
            ResultSetHandler<Articulos> h = new BeanHandler<Articulos>(Articulos.class);

            
            reng = run.query(dbCon, GET_ARTICULOBYID+id , h);

     }catch ( SQLRecoverableException rec){

                rec.printStackTrace();

        }catch(Exception ex){
            
                ex.printStackTrace();
                
        }finally{
         
                if(dbCon!=null){
                     try{
                         dbCon.close();
                     }catch(SQLException sqle){
                             sqle.printStackTrace();
                     }
                 }

        }

    return reng;
    
}


String GET_ARTICULOBYID_FULL =  "select a.id as id " +
                                ",a.lugar as lugar " +
                                ",a.valoriva as valorIva " +
                                ",a.pcio1 as precio1 " +
                                ",a.pcio2 as precio2 " +
                                ",a.pcio3 as precio3 " +
                                ",a.pcio4 as precio4 " +
                                ",a.parte as parte " +
                                ",a.estatus as estatus " +
                                ",a.codant as codAnt " +
                                ",a.minimo as minimo " +
                                ",a.valorutmin as valorUtMin " +
                                ",a.maximo as maximo " +
                                ",a.codigo as codigo " +
                                ",a.valorutsug as valorUtSug " +
                                ",a.descripcion as descripcion " +
                                ",a.activo as activo " +
                                ",g.id as grupoId " +
                                ",g.clave as grupoClave " +
                                ",g.descripcion as grupoDescripcion " +
                                ",sg.id as subgrupoId " +
                                ",sg.clave as subgrupoClave " +
                                ",sg.descripcion as subgrupoDescripcion " +
                                ",um.id as unidaMedidaId " +
                                ",um.clave as unidadMedidaClave " +
                                ",um.descripcion as unidadMedidaDescripcion " +
                                ",al.id as almacenId " +
                                ",al.clave as almacenClave " +
                                ",al.descripcion as almacenDescripcion " +
                                "from articulos a, grupo g, subgrupo sg, catunidadmedidas um, almacen al " +
                                "where  a.grupo_id = g.id " +
                                "and a.subgrupo_id = sg.id " +
                                "and a.unidmed_id = um.id " +
                                "and a.almacen_id = al.id " +
                                "and a.id = ";
public Map<String, Object> getOneArticuloByIdFull(String  id){
    
   Connection dbCon = null;
   Map<String, Object> resp = new HashMap<String, Object> ();
   Map<String, Object> articulo = new HashMap<String, Object> ();
    
    
       
       //Procedo a grbar el encabezado
       try{
     
		dbCon = new JDBCUtils().connectDatabase();
                 QueryRunner queryRunner = new QueryRunner();
             
                articulo = queryRunner.query(dbCon, GET_ARTICULOBYID_FULL+ id , new MapHandler() );
                
               
                 
                   
                    
                
                if(articulo == null || articulo.isEmpty()){
                        resp.put("success", Boolean.FALSE);
                        resp.put("erromsg", "The Table is empty");
                        resp.put("payload", null);                    
                }else{
                        resp.put("success", Boolean.TRUE);
                        resp.put("erromsg", null);
                        resp.put("payload", articulo);
                }
                
                       
               
        }catch(Exception e){
            //procedo roolback
            DbUtils.rollbackAndCloseQuietly(dbCon);
            resp.put("success", Boolean.FALSE);
            resp.put("erromsg", e.getMessage());
            resp.put("payload", null);        
        }finally{

            if(dbCon!=null){
                 try{
                     dbCon.close();
                 }catch(SQLException sqle){
                     resp.put("success", Boolean.FALSE);
                     resp.put("erromsg", sqle.getMessage());
                     resp.put("payload", null);      
                 }
             }
            
        }
       
       
    return resp;
}


String GET_LISTADETALLEPEDIOBYIDPEDIDO =    "SELECT pd.id " +
                                            ", cantidad " +
                                            ",total " +
                                            ",precio " +
                                            ",pedido_id "+
                                            ",a.id as articulo_id " +
                                            ",a.descripcion as articulodescripcion " +
                                            "from " +
                                            "pedidos_detalle pd, articulos a  " +
                                            "where pd.articulo_id = a.id " +
                                            "and pd.pedido_id  = ";
public Map<String, Object> getListaPedidoDetalleByIdPedido(String id){
   Connection dbCon = null;
   List<Map<String, Object>> pedidodetalle =  new ArrayList<Map<String, Object>>();
   Map<String, Object>  resp = new HashMap<String, Object> ();
    
    
       
       //Procedo a grbar el encabezado
       try{
     
		dbCon = new JDBCUtils().connectDatabase();
                 QueryRunner queryRunner = new QueryRunner();
             
                pedidodetalle = queryRunner.query(dbCon, GET_LISTADETALLEPEDIOBYIDPEDIDO+ id , new MapListHandler() );
                                         
                if(pedidodetalle == null || pedidodetalle.isEmpty()){
                        resp.put("success", Boolean.FALSE);
                        resp.put("erromsg", "The Table is empty");
                        resp.put("payload", null);                    
                }else{
                        resp.put("success", Boolean.TRUE);
                        resp.put("erromsg", null);
                        resp.put("payload", pedidodetalle);
                }
                
                       
               
        }catch(Exception e){        
            resp.put("success", Boolean.FALSE);
            resp.put("erromsg", e.getMessage());
            resp.put("payload", null);        
        }finally{

            if(dbCon!=null){
                 try{
                     dbCon.close();
                 }catch(SQLException sqle){
                     resp.put("success", Boolean.FALSE);
                     resp.put("erromsg", sqle.getMessage());
                     resp.put("payload", null);      
                 }
             }
            
        }
       
       
    return resp;

}


String DETELEPEDIDOBYID =    "DELETE FROM pedidos_detalle WHERE id = ";
public Map<String, Object> deletePedidoDetalleById(String id){
   Connection dbCon = null;
   int resultadoSQL ;
   Map<String, Object>  resp = new HashMap<String, Object> ();
   Map<String, Integer>  registrosborrados = new HashMap<String, Integer> ();
    
       
       //Procedo a grbar el encabezado
       try{
     
		dbCon = new JDBCUtils().connectDatabase();
                 QueryRunner queryRunner = new QueryRunner();
             
                resultadoSQL = queryRunner.update(dbCon, DETELEPEDIDOBYID+ id  );
                                         
               registrosborrados.put("Registros Borrados", resultadoSQL);
               if(resultadoSQL == 0 ){
                   resp.put("success", Boolean.FALSE);
               }else{
                   resp.put("success", Boolean.TRUE);
               }
               
               resp.put("erromsg", null);
               resp.put("payload", registrosborrados);
                
                
                       
               
        }catch(Exception e){        
            resp.put("success", Boolean.FALSE);
            resp.put("erromsg", e.getMessage());
            resp.put("payload", null);        
        }finally{

            if(dbCon!=null){
                 try{
                     dbCon.close();
                 }catch(SQLException sqle){
                     resp.put("success", Boolean.FALSE);
                     resp.put("erromsg", sqle.getMessage());
                     resp.put("payload", null);      
                 }
             }
            
        }
       
       
    return resp;

}


String  INSERT_CLIENTE = "INSERT INTO clientes(version, iva, telefono,"
        + " rfc, nombre, email, observ, direccion, ciudad, nucta, "
        + " diascred, noext,pais_id,estado_id,codigopost,colonia, municipio, usocfdi_id, razonsocial, noint "
        + ") VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

String  UPDATE_CLIENTE = "UPDATE clientes SET version=?, iva=?, "
        + "telefono=?, rfc=?, nombre=?, email=?, observ=?, direccion=?, "
        + "ciudad=?, nucta=?, diascred=?, noext=?, pais_id=?, estado_id=?, "
        + "codigopost=?,colonia=?,municipio=?, usocfdi_id=?, razonsocial=?, noint=? WHERE id=?";
/**
 *  Metodo que inserta o actualiza a un cliente.
 * @param elcliente
 * @return 
 */
public Map<String, Object> insertaCliente(Map elcliente){
    
    Connection dbCon = null;
    Map<String, Object> resp = new HashMap<String, Object> ();
    Map<String, Object> payload = new HashMap<String, Object> ();
    ScalarHandler<Long> scalarHandler = new ScalarHandler<Long>(); // para qyue obtenga el id
 
    Integer id          = elcliente.get("id")       == null ? 0    : (Integer)elcliente.get("id");  // si viene es update si no viene o es cero es insert
    Double  iva         = elcliente.get("iva")      == null ? 0.0  : (Double) elcliente.get("iva");
    String  telefono    = elcliente.get("telefono") == null ? null : (String)elcliente.get("telefono");
    String  rfc         = elcliente.get("rfc")      == null ? null : (String)elcliente.get("rfc");
    String  nombre      = elcliente.get("nombre")   == null ? null : (String)elcliente.get("nombre");
    String  email       = elcliente.get("email")    == null ? null : (String)elcliente.get("email");    
    String  observ      = elcliente.get("observ")   == null ? null : (String)elcliente.get("observ");  
    String  direccion   = elcliente.get("direccion")== null ? null : (String)elcliente.get("direccion");
    String  ciudad      = elcliente.get("ciudad")   == null ? null : (String)elcliente.get("ciudad");
    String  noext      = elcliente.get("noext")   == null ? null : (String)elcliente.get("noext");
    String  codigopost      = elcliente.get("codigopost")   == null ? null : (String)elcliente.get("codigopost");
    String  colonia      = elcliente.get("colonia")   == null ? null : (String)elcliente.get("colonia");
    String  municipio      = elcliente.get("municipio")   == null ? null : (String)elcliente.get("municipio");
    Integer nucta      = elcliente.get("nucta")     == null ? 0    : (Integer)elcliente.get("nucta"); 
    Integer diascred    = elcliente.get("diascred") == null ? 0    : (Integer)elcliente.get("diascred"); 
    Integer pais_id      = elcliente.get("pais_id")     == null ? 0    : (Integer)elcliente.get("pais_id"); 
    Integer estado_id      = elcliente.get("estado_id")     == null ? 0    : (Integer)elcliente.get("estado_id"); 
    Integer usocfdi_id      = elcliente.get("usocfdi_id")     == null ? 0    : (Integer)elcliente.get("usocfdi_id"); 
    String  razonsocial      = elcliente.get("razonsocial")   == null ? null : (String)elcliente.get("razonsocial");
    String  noint      = elcliente.get("noint")   == null ? null : (String)elcliente.get("noint");
       

       
       //Procedo a grbar el encabezado
       try{
     
		dbCon = new JDBCUtils().connectDatabase();           
                QueryRunner queryRunner = new QueryRunner();
               
        
                int numrows; 
                Long newid = 0L;
                if( id != 0){ // Update
                    numrows = queryRunner.update(dbCon, UPDATE_CLIENTE , 0, iva, telefono, rfc, nombre,
                            email, observ, direccion, ciudad, nucta, diascred, noext, pais_id, estado_id, codigopost, colonia, municipio, usocfdi_id, razonsocial, noint, id );
                    payload.put("actualizados", numrows);
                }
                else{                  
                     newid = queryRunner.insert(dbCon, INSERT_CLIENTE , scalarHandler, 0,  iva, telefono, rfc, nombre, 
                             email, observ, direccion, ciudad, nucta, diascred, noext, pais_id, estado_id, codigopost, colonia, municipio, usocfdi_id, razonsocial, noint );
                      payload.put("id", newid);
                }
                
                // Finalizo
                DbUtils.commitAndCloseQuietly(dbCon);
                
                resp.put("success", Boolean.TRUE);
                resp.put("erromsg", null);
                resp.put("payload", payload);
               
        }catch(Exception e){
            e.printStackTrace();
            //procedo roolback
            DbUtils.rollbackAndCloseQuietly(dbCon);
            resp.put("success", Boolean.FALSE);
            resp.put("erromsg", e.getMessage());
            resp.put("payload", null);        
        }finally{

            if(dbCon!=null){
                 try{
                     dbCon.close();
                 }catch(SQLException sqle){
                     resp.put("success", Boolean.FALSE);
                     resp.put("erromsg", sqle.getMessage());
                     resp.put("payload", null);      
                 }
             }
            
        }
       
    return resp;
    
}




String  INSERT_ARTICULO = "INSERT INTO articulos(version,   lugar,   grupo_id,   subgrupo_id,   unidmed_id,   almacen_id,   valoriva,   pcio4,   pcio3,   pcio2,   pcio1,   parte,  estatus,   codant,   minimo,   maximo,   codigo,   valorutmin,   valorutsug,   descripcion,   activo, cvesat, unidadsat,prorden) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
String  UPDATE_ARTICULO = "UPDATE articulos  SET version=?, lugar=?, grupo_id=?, subgrupo_id=?, unidmed_id=?, almacen_id=?, valoriva=?, pcio4=?, pcio3=?, pcio2=?, pcio1=?, parte=?, estatus=?, codant=?, minimo=?, maximo=?, codigo=?, valorutmin=?, valorutsug=?, descripcion=?, activo=?, cvesat=?,unidadsat=?,prorden=? WHERE id=?";
/**
 *  Metodo que inserta o actualiza a un articulo.
 * @param elarticulo
 * @return 
 */
public Map<String, Object> insertaArticulo(Map elarticulo){
    
    Connection dbCon = null;
    Map<String, Object> resp = new HashMap<String, Object> ();
    Map<String, Object> payload = new HashMap<String, Object> ();
    ScalarHandler<Long> scalarHandler = new ScalarHandler<Long>(); // para qyue obtenga el id
 
    Integer id          = elarticulo.get("id")              == null ? 0     : (Integer)elarticulo.get("id");  // si viene es update si no viene o es cero es insert
    String  lugar       = elarticulo.get("lugar")           == null ? ""   : (String)elarticulo.get("lugar");
    Integer grupo_id    = elarticulo.get("grupo_id")        == null ? 0     : (Integer)elarticulo.get("grupo_id"); 
    Integer subgrupo_id = elarticulo.get("subgrupo_id")     == null ? 0     : (Integer)elarticulo.get("subgrupo_id"); 
    Integer unidmed_id  = elarticulo.get("unidmed_id")      == null ? 0     : (Integer)elarticulo.get("unidmed_id"); 
    Integer almacen_id  = elarticulo.get("almacen_id")      == null ? 0     : (Integer)elarticulo.get("almacen_id"); 
    Double  valoriva    = elarticulo.get("valoriva")        == null ? 0.0   : (Double)elarticulo.get("valoriva"); 
    Double  pcio4       = elarticulo.get("pcio4")           == null ? 0.0   : (Double)elarticulo.get("pcio4");
    Double  pcio3       = elarticulo.get("pcio3")           == null ? 0.0   : (Double)elarticulo.get("pcio3");
    Double  pcio2       = elarticulo.get("pcio2")           == null ? 0.0   : (Double)elarticulo.get("pcio2");
    Double  pcio1       = elarticulo.get("pcio1")           == null ? 0.0   : (Double)elarticulo.get("pcio1");
    String  parte       = elarticulo.get("parte")           == null ? ""   : (String)elarticulo.get("parte");
    String  estatus     = elarticulo.get("estatus")         == null ? ""   : (String)elarticulo.get("estatus");
    String  codant      = elarticulo.get("codant")          == null ? ""   : (String)elarticulo.get("codant");
    Double  minimo      = elarticulo.get("minimo")          == null ? 0.0   : ((elarticulo.get("minimo") instanceof Integer)?  new Double((Integer)elarticulo.get("minimo")) : (Double)elarticulo.get("minimo") ) ;
    Double  maximo      = elarticulo.get("maximo")          == null ? 0.0   : ((elarticulo.get("maximo") instanceof Integer)?  new Double((Integer)elarticulo.get("maximo")) : (Double)elarticulo.get("maximo") ) ;
    String  codigo      = elarticulo.get("codigo")          == null ? ""   : (String)elarticulo.get("codigo");
    Double  valorutmin  = elarticulo.get("valorutmin")      == null ? 0.0   : (Double)elarticulo.get("valorutmin");
    Double  valorutsug  = elarticulo.get("valorutsug")      == null ? 0.0   : (Double)elarticulo.get("valorutsug");
    String  descripcion = elarticulo.get("descripcion")     == null ? ""   : (String)elarticulo.get("descripcion");
    Boolean activo      = elarticulo.get("activo")          == null ? false : (Boolean)elarticulo.get("activo");
    String  cvesat      = elarticulo.get("cvesat")          == null ? ""   : (String)elarticulo.get("cvesat");
    String  unidadsat      = elarticulo.get("unidadsat")    == null ? ""   : (String)elarticulo.get("unidadsat");
    Double  prorden      = elarticulo.get("prorden")        == null ? 0.0   : ((elarticulo.get("prorden") instanceof Integer)?  new Double((Integer)elarticulo.get("prorden")) : (Double)elarticulo.get("prorden") ) ; 
    
 
       

       
       //Procedo a grbar el encabezado
       try{
     
		dbCon = new JDBCUtils().connectDatabase();           
                QueryRunner queryRunner = new QueryRunner();
               
    
                int numrows; 
                Long newid = 0L;
                if( id != 0){ // Update
                  
                    numrows = queryRunner.update(dbCon, UPDATE_ARTICULO ,               0, lugar, grupo_id, subgrupo_id, unidmed_id, almacen_id, valoriva, pcio4, pcio3, pcio2, pcio1, parte, estatus, codant, minimo, maximo, codigo, valorutmin, valorutsug, descripcion, activo, cvesat, unidadsat, prorden,  id );
                    payload.put("actualizados", numrows);
                }
                else{                  
                     newid = queryRunner.insert(dbCon, INSERT_ARTICULO , scalarHandler, 0, lugar, grupo_id, subgrupo_id, unidmed_id, almacen_id, valoriva, pcio4, pcio3, pcio2, pcio1, parte, estatus, codant, minimo, maximo, codigo, valorutmin, valorutsug, descripcion, activo, cvesat, unidadsat, prorden );
                      payload.put("id", newid);
                }
                
                // Finalizo
                DbUtils.commitAndCloseQuietly(dbCon);
                
                resp.put("success", Boolean.TRUE);
                resp.put("erromsg", null);
                resp.put("payload", payload);
               
        }catch(Exception e){
            e.printStackTrace();
            //procedo roolback
            DbUtils.rollbackAndCloseQuietly(dbCon);
            resp.put("success", Boolean.FALSE);
            resp.put("erromsg", e.getMessage());
            resp.put("payload", null);        
        }finally{

            if(dbCon!=null){
                 try{
                     dbCon.close();
                 }catch(SQLException sqle){
                     resp.put("success", Boolean.FALSE);
                     resp.put("erromsg", sqle.getMessage());
                     resp.put("payload", null);      
                 }
             }
            
        }
       
    return resp;
    
}


String  INSERT_VENDEDOR = "INSERT INTO vendedores (version, activo, clave, nombre)  VALUES(?,?,?,?)";
String  UPDATE_VENDEDOR = "UPDATE vendedores SET version=?, activo=?, clave=?, nombre=? WHERE id=?";
/**
 *  Metodo que inserta o actualiza a un cliente.
 * @param elvendedor
 * @return si insert regreso el id nuevo, sui update, regreso el numero de registros actualizados, usualmente 1
 */
public Map<String, Object> insertaVendedor(Map elvendedor){
    
    Connection dbCon = null;
    Map<String, Object> resp = new HashMap<String, Object> ();
    Map<String, Object> payload = new HashMap<String, Object> ();
    ScalarHandler<Long> scalarHandler = new ScalarHandler<Long>(); // para qyue obtenga el id
 
    Integer id      = elvendedor.get("id")      == null ? 0     : (Integer)elvendedor.get("id");  // si viene es update si no viene o es cero es insert
    Boolean activo  = elvendedor.get("activo")  == null ? false : (Boolean)elvendedor.get("activo");
    String  clave   = elvendedor.get("clave")   == null ? null  : (String) elvendedor.get("clave");
    String  nombre  = elvendedor.get("nombre")  == null ? null  : (String) elvendedor.get("nombre");
    
       

       
       //Procedo a grabar el encabezado
       try{
     
		dbCon = new JDBCUtils().connectDatabase();           
                QueryRunner queryRunner = new QueryRunner();
               
        
                int numrows; 
                Long newid = 0L;
                if( id != 0){ // Update
                    numrows = queryRunner.update(dbCon, UPDATE_VENDEDOR , 0, activo, clave, nombre,  id );
                    payload.put("actualizados", numrows);
                }
                else{                  
                    newid = queryRunner.insert(dbCon, INSERT_VENDEDOR , scalarHandler, 0,  activo, clave,  nombre );
                    payload.put("id", newid);
                }
                
                // Finalizo
                DbUtils.commitAndCloseQuietly(dbCon);
                
                resp.put("success", Boolean.TRUE);
                resp.put("erromsg", null);
                resp.put("payload", payload);
               
        }catch(Exception e){
            //procedo roolback
            DbUtils.rollbackAndCloseQuietly(dbCon);
            resp.put("success", Boolean.FALSE);
            resp.put("erromsg", e.getMessage());
            resp.put("payload", null);        
        }finally{

            if(dbCon!=null){
                 try{
                     dbCon.close();
                 }catch(SQLException sqle){
                     resp.put("success", Boolean.FALSE);
                     resp.put("erromsg", sqle.getMessage());
                     resp.put("payload", null);      
                 }
             }
            
        }
       
    return resp;
    
}


String  GET_LISTA_UNIDADES_MEDIDA = "SELECT id, clave, descripcion FROM catunidadmedidas";
                                    
public Map<String, Object> getCatalogoUnidadesMedida(){
    
     Connection dbCon = null;
    Map<String, Object> resp = new HashMap<String, Object> ();
   List<Map<String, Object>> listaUdeM = new ArrayList<Map<String, Object>>();
    
    
       
       //Procedo a grbar el encabezado
       try{
     
		dbCon = new JDBCUtils().connectDatabase();
                 QueryRunner queryRunner = new QueryRunner();
             
                listaUdeM = queryRunner.query(dbCon, GET_LISTA_UNIDADES_MEDIDA, new MapListHandler() );
                
              
                 
                   
                    
                
                if(listaUdeM == null || listaUdeM.isEmpty()){
                        resp.put("success", Boolean.FALSE);
                        resp.put("erromsg", "The Table is empty");
                        resp.put("payload", null);                    
                }else{
                        resp.put("success", Boolean.TRUE);
                        resp.put("erromsg", null);
                        resp.put("payload", listaUdeM);
                }
                
                       
               
        }catch(Exception e){
            //procedo roolback
            DbUtils.rollbackAndCloseQuietly(dbCon);
            resp.put("success", Boolean.FALSE);
            resp.put("erromsg", e.getMessage());
            resp.put("payload", null);        
        }finally{

            if(dbCon!=null){
                 try{
                     dbCon.close();
                 }catch(SQLException sqle){
                     resp.put("success", Boolean.FALSE);
                     resp.put("erromsg", sqle.getMessage());
                     resp.put("payload", null);      
                 }
             }
            
        }
       
       
    return resp;
}


String GET_UNIDAD_MEDIDA_BY_ID = "SELECT id, clave, descripcion FROM catunidadmedidas where id = ";

public Map<String, Object> getUnidadMedidaById(String id){
    
    Connection dbCon = null;
    Map<String, Object> resp = new HashMap<String, Object> ();
    Map<String, Object> unidadMedida= new HashMap<String, Object> ();
    
    
       
       //Procedo a grbar el encabezado
       try{
     
		dbCon = new JDBCUtils().connectDatabase();
                QueryRunner queryRunner = new QueryRunner();
             
                unidadMedida = queryRunner.query(dbCon, GET_UNIDAD_MEDIDA_BY_ID+ id, new MapHandler() );
                
              
                 
                   
                    
                
                if(unidadMedida == null || unidadMedida.isEmpty()){
                        resp.put("success", Boolean.FALSE);
                        resp.put("erromsg", "The Table is empty");
                        resp.put("payload", null);                    
                }else{
                        resp.put("success", Boolean.TRUE);
                        resp.put("erromsg", null);
                        resp.put("payload", unidadMedida);
                }
                
                       
               
        }catch(Exception e){
            //procedo roolback
            DbUtils.rollbackAndCloseQuietly(dbCon);
            resp.put("success", Boolean.FALSE);
            resp.put("erromsg", e.getMessage());
            resp.put("payload", null);        
        }finally{

            if(dbCon!=null){
                 try{
                     dbCon.close();
                 }catch(SQLException sqle){
                     resp.put("success", Boolean.FALSE);
                     resp.put("erromsg", sqle.getMessage());
                     resp.put("payload", null);      
                 }
             }
            
        }
       
       
    return resp;
}

String GET_LISTA_PAISES = "Select id, nombre from paises order by nombre ";
public Map<String, Object> getListaPaises(){
    
    Connection dbCon = null;
    Map<String, Object> resp = new HashMap<String, Object> ();
    List<Map<String, Object>> paises= new ArrayList<Map<String, Object>>();
    

       try{
     
		dbCon = new JDBCUtils().connectDatabase();
                QueryRunner queryRunner = new QueryRunner();
             
                paises = queryRunner.query(dbCon, GET_LISTA_PAISES, new MapListHandler() );
                            
                if(paises == null || paises.isEmpty()){
                        resp.put("success", Boolean.FALSE);
                        resp.put("erromsg", "The Table is empty");
                        resp.put("payload", null);                    
                }else{
                        resp.put("success", Boolean.TRUE);
                        resp.put("erromsg", null);
                        resp.put("payload", paises);
                }                           
        }catch(Exception e){           
            resp.put("success", Boolean.FALSE);
            resp.put("erromsg", e.getMessage());
            resp.put("payload", null);        
        }finally{

            if(dbCon!=null){
                 try{
                     dbCon.close();
                 }catch(SQLException sqle){
                     resp.put("success", Boolean.FALSE);
                     resp.put("erromsg", sqle.getMessage());
                     resp.put("payload", null);      
                 }
             }
            
        }
       
       
    return resp;
}


String GET_PAIS_BY_ID = "SELECT id, nombre FROM paises where id = ";

public Map<String, Object> getPaisById(String id){
    
    Connection dbCon = null;
    Map<String, Object> resp = new HashMap<String, Object> ();
    Map<String, Object> pais= new HashMap<String, Object> ();
    
    
       
       //Procedo a grbar el encabezado
       try{
     
		dbCon = new JDBCUtils().connectDatabase();
                QueryRunner queryRunner = new QueryRunner();
             
                pais = queryRunner.query(dbCon, GET_PAIS_BY_ID + id, new MapHandler() );
                         
                if(pais == null || pais.isEmpty()){
                        resp.put("success", Boolean.FALSE);
                        resp.put("erromsg", "Pais no encontrado");
                        resp.put("payload", null);                    
                }else{
                        resp.put("success", Boolean.TRUE);
                        resp.put("erromsg", null);
                        resp.put("payload", pais);
                }
                
                       
               
        }catch(Exception e){
            //procedo roolback
            DbUtils.rollbackAndCloseQuietly(dbCon);
            resp.put("success", Boolean.FALSE);
            resp.put("erromsg", e.getMessage());
            resp.put("payload", null);        
        }finally{

            if(dbCon!=null){
                 try{
                     dbCon.close();
                 }catch(SQLException sqle){
                     resp.put("success", Boolean.FALSE);
                     resp.put("erromsg", sqle.getMessage());
                     resp.put("payload", null);      
                 }
             }
            
        }
       
       
    return resp;
}

String GET_LISTA_ESTADOS_FULL = "SELECT e.id, e.nombre, p.id as pais_id, p.nombre as pais_nombre " +
                                 "FROM estados e, paises p " +
                                 "WHERE p.id = e.pais_id " +
                                 "ORDER BY p.nombre, e.nombre";

public Map<String, Object> getListaEstadosFull(){
    
     Connection dbCon = null;
    Map<String, Object> resp = new HashMap<String, Object> ();
   List<Map<String, Object>> listaestados = new ArrayList<Map<String, Object>>();
    
    
       
       //Procedo a grbar el encabezado
       try{
     
		dbCon = new JDBCUtils().connectDatabase();
                 QueryRunner queryRunner = new QueryRunner();
             
                listaestados = queryRunner.query(dbCon, GET_LISTA_ESTADOS_FULL, new MapListHandler() );
          
                
                if(listaestados == null || listaestados.isEmpty()){
                        resp.put("success", Boolean.FALSE);
                        resp.put("erromsg", "The Table is empty");
                        resp.put("payload", null);                    
                }else{
                        resp.put("success", Boolean.TRUE);
                        resp.put("erromsg", null);
                        resp.put("payload", listaestados);
                }
                
                       
               
        }catch(Exception e){
            //procedo roolback
            DbUtils.rollbackAndCloseQuietly(dbCon);
            resp.put("success", Boolean.FALSE);
            resp.put("erromsg", e.getMessage());
            resp.put("payload", null);        
        }finally{

            if(dbCon!=null){
                 try{
                     dbCon.close();
                 }catch(SQLException sqle){
                     resp.put("success", Boolean.FALSE);
                     resp.put("erromsg", sqle.getMessage());
                     resp.put("payload", null);      
                 }
             }
            
        }
       
       
    return resp;
}

String  GET_LISTA_DESTADOS = "select * from estados order by id  desc";
    
public List<Estados> getListaEstados(){
 
 Connection dbCon = null;
 List<Estados> listapedidos = new ArrayList<Estados>();
 
 try{
     
		dbCon = new JDBCUtils().connectDatabase();
                QueryRunner run = new QueryRunner();

               
                ResultSetHandler<List<Estados>> h = new BeanListHandler<Estados>(Estados.class);

                
                listapedidos = run.query(dbCon, GET_LISTA_DESTADOS, h );

 }catch(Exception e){
                e.printStackTrace();
 }finally{

            if(dbCon!=null){
                 try{
                     dbCon.close();
                 }catch(SQLException sqle){
                 }
             }
            
 }
 
  return listapedidos;
}


String GET_ESTADO_BY_ID = "SELECT e.id, e.nombre, p.id as pais_id, p.nombre as pais_nombre " +
                          "FROM estados e, paises p  " +
                          "WHERE p.id = e.pais_id " +
                          "AND e.id = ";

public Map<String, Object> getEstadoById(String id){
    
    Connection dbCon = null;
    Map<String, Object> resp = new HashMap<String, Object> ();
    Map<String, Object> estado= new HashMap<String, Object> ();
    
    
       
       //Procedo a grbar el encabezado
       try{
     
		dbCon = new JDBCUtils().connectDatabase();
                QueryRunner queryRunner = new QueryRunner();
             
                estado = queryRunner.query(dbCon, GET_ESTADO_BY_ID + id, new MapHandler() );
                         
                if(estado == null || estado.isEmpty()){
                        resp.put("success", Boolean.FALSE);
                        resp.put("erromsg", "Pais no encontrado");
                        resp.put("payload", null);                    
                }else{
                        resp.put("success", Boolean.TRUE);
                        resp.put("erromsg", null);
                        resp.put("payload", estado);
                }
                
                       
               
        }catch(Exception e){
            //procedo roolback
            DbUtils.rollbackAndCloseQuietly(dbCon);
            resp.put("success", Boolean.FALSE);
            resp.put("erromsg", e.getMessage());
            resp.put("payload", null);        
        }finally{

            if(dbCon!=null){
                 try{
                     dbCon.close();
                 }catch(SQLException sqle){
                     resp.put("success", Boolean.FALSE);
                     resp.put("erromsg", sqle.getMessage());
                     resp.put("payload", null);      
                 }
             }
            
        }
       
       
    return resp;
}

String  GET_LISTA_USOS_CFDI = "select * from cfdiuso order by id  desc";
public Map<String, Object> getListaUsoCFDI_Full(){
    
     Connection dbCon = null;
    Map<String, Object> resp = new HashMap<String, Object> ();
   List<Map<String, Object>> listausocfdi = new ArrayList<Map<String, Object>>();
    
    
       
       //Procedo a grbar el encabezado
       try{
     
		dbCon = new JDBCUtils().connectDatabase();
                 QueryRunner queryRunner = new QueryRunner();
             
                listausocfdi = queryRunner.query(dbCon, GET_LISTA_USOS_CFDI, new MapListHandler() );
          
                
                if(listausocfdi == null || listausocfdi.isEmpty()){
                        resp.put("success", Boolean.FALSE);
                        resp.put("erromsg", "The Table is empty");
                        resp.put("payload", null);                    
                }else{
                        resp.put("success", Boolean.TRUE);
                        resp.put("erromsg", null);
                        resp.put("payload", listausocfdi);
                }
                
                       
               
        }catch(Exception e){
            //procedo roolback
            DbUtils.rollbackAndCloseQuietly(dbCon);
            resp.put("success", Boolean.FALSE);
            resp.put("erromsg", e.getMessage());
            resp.put("payload", null);        
        }finally{

            if(dbCon!=null){
                 try{
                     dbCon.close();
                 }catch(SQLException sqle){
                     resp.put("success", Boolean.FALSE);
                     resp.put("erromsg", sqle.getMessage());
                     resp.put("payload", null);      
                 }
             }
            
        }
       
       
    return resp;
}


    
public List<Cfdiuso> getListaUsoCFDI(){
 
 Connection dbCon = null;
 List<Cfdiuso> listausocfdi = new ArrayList<Cfdiuso>();
 
 try{
     
		dbCon = new JDBCUtils().connectDatabase();
                QueryRunner run = new QueryRunner();

               
                ResultSetHandler<List<Cfdiuso>> h = new BeanListHandler<Cfdiuso>(Cfdiuso.class);

                
                listausocfdi = run.query(dbCon, GET_LISTA_USOS_CFDI, h );

 }catch(Exception e){
                e.printStackTrace();
 }finally{

            if(dbCon!=null){
                 try{
                     dbCon.close();
                 }catch(SQLException sqle){
                 }
             }
            
 }
 
  return listausocfdi;
}


String GET_USO_CFDI_BY_ID = "SELECT * FROM cfdiuso WHERE ID = " ;


public Map<String, Object> getUsoCfdiById(String id){
    
    Connection dbCon = null;
    Map<String, Object> resp = new HashMap<String, Object> ();
    Map<String, Object> usocfdi= new HashMap<String, Object> ();
    
    
       
       //Procedo a grbar el encabezado
       try{
     
		dbCon = new JDBCUtils().connectDatabase();
                QueryRunner queryRunner = new QueryRunner();
             
                usocfdi = queryRunner.query(dbCon, GET_USO_CFDI_BY_ID + id, new MapHandler() );
                         
                if(usocfdi == null || usocfdi.isEmpty()){
                        resp.put("success", Boolean.FALSE);
                        resp.put("erromsg", "UsoCFDI no encontrado");
                        resp.put("payload", null);                    
                }else{
                        resp.put("success", Boolean.TRUE);
                        resp.put("erromsg", null);
                        resp.put("payload", usocfdi);
                }
                
                       
               
        }catch(Exception e){
            //procedo roolback
            DbUtils.rollbackAndCloseQuietly(dbCon);
            resp.put("success", Boolean.FALSE);
            resp.put("erromsg", e.getMessage());
            resp.put("payload", null);        
        }finally{

            if(dbCon!=null){
                 try{
                     dbCon.close();
                 }catch(SQLException sqle){
                     resp.put("success", Boolean.FALSE);
                     resp.put("erromsg", sqle.getMessage());
                     resp.put("payload", null);      
                 }
             }
            
        }
       
       
    return resp;
}

String  GET_LISTA_HIELERAS = "select * from hieleras order by id  desc";
public Map<String, Object> getListaHieleras(){
    
    Connection dbCon = null;
    Map<String, Object> resp = new HashMap<String, Object> ();
   List<Map<String, Object>> listahieleras= new ArrayList<Map<String, Object>>();
    
    
       
       //Procedo
       try{
     
		dbCon = new JDBCUtils().connectDatabase();
                 QueryRunner queryRunner = new QueryRunner();
             
                listahieleras = queryRunner.query(dbCon, GET_LISTA_HIELERAS, new MapListHandler() );
          
                
                if(listahieleras == null || listahieleras.isEmpty()){
                        resp.put("success", Boolean.FALSE);
                        resp.put("erromsg", "The Table is empty");
                        resp.put("payload", null);                    
                }else{
                    
                    // Proceso las fechas
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
                    for(Map<String, Object> elemento_h : listahieleras){
                        // cambiop fecha a Styring
                    
                        String sfechaadquisicion = sdf.format(elemento_h.get("fecha_adquisicion"));
                        
                        String sfechabaja = elemento_h.get("fecha_baja") == null ? null : sdf.format(elemento_h.get("fecha_baja") );
                        
                        elemento_h.remove("fecha_adquisicion");
                        elemento_h.put("fecha_adquisicion", sfechaadquisicion);
                        
                        elemento_h.remove("fecha_baja");
                        elemento_h.put("fecha_baja", sfechabaja);
                        
                    }
                        resp.put("success", Boolean.TRUE);
                        resp.put("erromsg", null);
                        resp.put("payload", listahieleras);
                }
                
                       
               
        }catch(Exception e){
            //procedo roolback
            DbUtils.rollbackAndCloseQuietly(dbCon);
            resp.put("success", Boolean.FALSE);
            resp.put("erromsg", e.getMessage());
            resp.put("payload", null);        
        }finally{

            if(dbCon!=null){
                 try{
                     dbCon.close();
                 }catch(SQLException sqle){
                     resp.put("success", Boolean.FALSE);
                     resp.put("erromsg", sqle.getMessage());
                     resp.put("payload", null);      
                 }
             }
            
        }
       
       
    return resp;
}


String GET_HILERA_BY_ID = "SELECT * FROM hieleras WHERE ID = " ;
public Map<String, Object> getHieleraById(String id){
    
    Connection dbCon = null;
    Map<String, Object> resp = new HashMap<String, Object> ();
    Map<String, Object> hielera= new HashMap<String, Object> ();
    
    
       
       //Procedo a grbar el encabezado
       try{
     
		dbCon = new JDBCUtils().connectDatabase();
                QueryRunner queryRunner = new QueryRunner();
             
                hielera = queryRunner.query(dbCon, GET_HILERA_BY_ID + id, new MapHandler() );
                         
                if(hielera == null || hielera.isEmpty()){
                        resp.put("success", Boolean.FALSE);
                        resp.put("erromsg", "hielera no encontrado");
                        resp.put("payload", null);                    
                }else{
                        // modifico las fechas
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
                        String sfechaadquisicion = sdf.format(hielera.get("fecha_adquisicion"));
                        String sfechabaja = hielera.get("fecha_baja") == null ? null : sdf.format(hielera.get("fecha_baja"));                      
                        hielera.remove("fecha_adquisicion");
                        hielera.put("fecha_adquisicion", sfechaadquisicion);                       
                        hielera.remove("fecha_baja");
                        hielera.put("fecha_baja", sfechabaja);
                        
                        resp.put("success", Boolean.TRUE);
                        resp.put("erromsg", null);
                        resp.put("payload", hielera);
                }
                
                       
               
        }catch(Exception e){
            //procedo roolback
            DbUtils.rollbackAndCloseQuietly(dbCon);
            resp.put("success", Boolean.FALSE);
            resp.put("erromsg", e.getMessage());
            resp.put("payload", null);        
        }finally{

            if(dbCon!=null){
                 try{
                     dbCon.close();
                 }catch(SQLException sqle){
                     resp.put("success", Boolean.FALSE);
                     resp.put("erromsg", sqle.getMessage());
                     resp.put("payload", null);      
                 }
             }
            
        }
       
       
    return resp;
}


String  INSERT_HIELERA = "INSERT INTO hieleras (version, fecha_adquisicion, clave, descripcion, fecha_baja,activa, num_pedido_actual) VALUES(?,?,?,?,?,?,?)";
String  UPDATE_HIELERA = "UPDATE hieleras SET version=?, fecha_adquisicion=?, clave=?, descripcion=?, fecha_baja=?, activa=? , num_pedido_actual=? WHERE id=?";
   
        
public Map<String, Object> insertaHielera(Map lahielera){
    
    Connection dbCon = null;
    Map<String, Object> resp = new HashMap<String, Object> ();
    Map<String, Object> payload = new HashMap<String, Object> ();
    ScalarHandler<Long> scalarHandler = new ScalarHandler<Long>(); // paraa qyue obtenga el id
    // Proceso el mapa de la hielera.
    // CABECERA
       Integer id                =  lahielera.get("id") == null ? 0 :   (Integer)lahielera.get("id");  // si viene es update si no viene o es cero es insert
       String fecha_adquisicion  =  (String)lahielera.get("fecha_adquisicion");  // formato yyyy-MM-dd HH:mmm la hpra en foprmato de 24 horas
       String clave              =  (String)lahielera.get("clave");
       String descripcion        =  (String)lahielera.get("descripcion");
       String fecha_baja         =  lahielera.get("fecha_baja")        == null ? null  : (String) lahielera.get("fecha_baja");  // formato yyyy-MM-dd HH:mmm la hpra en foprmato de 24 horas
       Boolean activa            =  lahielera.get("activa")            == null ? false : (Boolean)lahielera.get("activa");
       Long num_pedido_actual    =  lahielera.get("num_pedido_actual") == null ? 0L    : new Long( (Integer)lahielera.get("num_pedido_actual"));
       
      
  
       if( ! GenericValidator.isDate(fecha_adquisicion, "yyyy-MM-dd HH:mm", true) ){
            resp.put("success", Boolean.FALSE);
            resp.put("erromsg", "fecha adquisicion invalida");
            resp.put("payload", null);
            return resp;
        }
       
       if( fecha_baja != null && !GenericValidator.isDate(fecha_baja, "yyyy-MM-dd HH:mm", true) ){
            resp.put("success", Boolean.FALSE);
            resp.put("erromsg", "fecha baja invalida");
            resp.put("payload", null);
            return resp;
        }
       
      
       
       //Procedo a grbar
       try{
     
		dbCon = new JDBCUtils().connectDatabase();           
                dbCon.setAutoCommit(false);
                QueryRunner queryRunner = new QueryRunner();
                
                 int numrows; 
                 Long newid = 0L;
                if( id != 0){ // UPDATE hieleras SET version=?, fecha_adquisicion=?, clave=?, descripcion=?, fecha_baja=?, activa=? , num_pedido_actual =? WHERE id=?;
                   numrows = queryRunner.update(dbCon, UPDATE_HIELERA , 0,fecha_adquisicion, clave, descripcion, fecha_baja, activa, num_pedido_actual, id);
                    payload.put("actualizados", numrows);
                }
                else{
                   // INSERT INTO hieleras (version, fecha_adquisicion, clave, descripcion, fecha_baja,activa, num_pedido_actual) VALUES(?,?,?,?,?,?,?)
                     newid = queryRunner.insert(dbCon, INSERT_HIELERA , scalarHandler, 0, fecha_adquisicion, clave, descripcion, fecha_baja, activa, num_pedido_actual);
                     payload.put("id", newid);
                }
                      
                // Finalizo
                DbUtils.commitAndCloseQuietly(dbCon);
                
                resp.put("success", Boolean.TRUE);
                resp.put("erromsg", null);
                resp.put("payload", payload);
               
        }catch(Exception e){
            //procedo roolback
            DbUtils.rollbackAndCloseQuietly(dbCon);
            resp.put("success", Boolean.FALSE);
            resp.put("erromsg", e.getMessage());
            resp.put("payload", null);        
        }finally{

            if(dbCon!=null){
                 try{
                     dbCon.close();
                 }catch(SQLException sqle){
                     resp.put("success", Boolean.FALSE);
                     resp.put("erromsg", sqle.getMessage());
                     resp.put("payload", null);      
                 }
             }
            
        }
       
       
    return resp;
    
}



String  GET_LISTA_GRUPO = "select * from grupo order by id  desc";
public Map<String, Object> getListaGrupo(){
    
    Connection dbCon = null;
    Map<String, Object> resp = new HashMap<String, Object> ();
    List<Map<String, Object>> listagrupo = new ArrayList<Map<String, Object>>();
    
    
       
       //Procedo a grbar el encabezado
       try{
     
		dbCon = new JDBCUtils().connectDatabase();
                QueryRunner queryRunner = new QueryRunner();
             
                listagrupo = queryRunner.query(dbCon, GET_LISTA_GRUPO, new MapListHandler() );
          
                
                if(listagrupo == null || listagrupo.isEmpty()){
                        resp.put("success", Boolean.FALSE);
                        resp.put("erromsg", "The Table is empty");
                        resp.put("payload", null);                    
                }else{
                        resp.put("success", Boolean.TRUE);
                        resp.put("erromsg", null);
                        resp.put("payload", listagrupo);
                }
                
                       
               
        }catch(Exception e){
            //procedo roolback
            DbUtils.rollbackAndCloseQuietly(dbCon);
            resp.put("success", Boolean.FALSE);
            resp.put("erromsg", e.getMessage());
            resp.put("payload", null);        
        }finally{

            if(dbCon!=null){
                 try{
                     dbCon.close();
                 }catch(SQLException sqle){
                     resp.put("success", Boolean.FALSE);
                     resp.put("erromsg", sqle.getMessage());
                     resp.put("payload", null);      
                 }
             }
            
        }
       
       
    return resp;
}


String GET_GRUPO_BY_ID = "SELECT * FROM grupo WHERE ID = " ;
public Map<String, Object> getGrupoById(String id){
    
    Connection dbCon = null;
    Map<String, Object> resp = new HashMap<String, Object> ();
    Map<String, Object> grupo= new HashMap<String, Object> ();
    
    
       
      
       try{
     
		dbCon = new JDBCUtils().connectDatabase();
                QueryRunner queryRunner = new QueryRunner();
             
                grupo = queryRunner.query(dbCon, GET_GRUPO_BY_ID + id, new MapHandler() );
                         
                if(grupo == null || grupo.isEmpty()){
                        resp.put("success", Boolean.FALSE);
                        resp.put("erromsg", "grupo no encontrado");
                        resp.put("payload", null);                    
                }else{
                        
                        resp.put("success", Boolean.TRUE);
                        resp.put("erromsg", null);
                        resp.put("payload", grupo);
                }
                
                       
               
        }catch(Exception e){
            //procedo roolback
            DbUtils.rollbackAndCloseQuietly(dbCon);
            resp.put("success", Boolean.FALSE);
            resp.put("erromsg", e.getMessage());
            resp.put("payload", null);        
        }finally{

            if(dbCon!=null){
                 try{
                     dbCon.close();
                 }catch(SQLException sqle){
                     resp.put("success", Boolean.FALSE);
                     resp.put("erromsg", sqle.getMessage());
                     resp.put("payload", null);      
                 }
             }
            
        }
       
       
    return resp;
}

String  GET_LISTA_PRECIOS = "SELECT l.id, l.articulo_id, a.codigo, a.descripcion, l.cliente_id, c.nombre, l.precio " +
                             "FROM lista_precios l, articulos a, clientes c " +
                             "WHERE  a.id = l.articulo_id " +
                             "AND    c.id = l.cliente_id";
public Map<String, Object> getListaPrecios(){
    
    Connection dbCon = null;
    Map<String, Object> resp = new HashMap<String, Object> ();
    List<Map<String, Object>> listaprecios = new ArrayList<Map<String, Object>>();
    
    
      
       try{
     
		dbCon = new JDBCUtils().connectDatabase();
                QueryRunner queryRunner = new QueryRunner();
             
                listaprecios = queryRunner.query(dbCon, GET_LISTA_PRECIOS, new MapListHandler() );
          
                
                if(listaprecios == null || listaprecios.isEmpty()){
                        resp.put("success", Boolean.FALSE);
                        resp.put("erromsg", "The Table is empty");
                        resp.put("payload", null);                    
                }else{
                        resp.put("success", Boolean.TRUE);
                        resp.put("erromsg", null);
                        resp.put("payload", listaprecios);
                }
                
                
        }catch(Exception e){
            //procedo roolback
            DbUtils.rollbackAndCloseQuietly(dbCon);
            resp.put("success", Boolean.FALSE);
            resp.put("erromsg", e.getMessage());
            resp.put("payload", null);        
        }finally{

            if(dbCon!=null){
                 try{
                     dbCon.close();
                 }catch(SQLException sqle){
                     resp.put("success", Boolean.FALSE);
                     resp.put("erromsg", sqle.getMessage());
                     resp.put("payload", null);      
                 }
             }
            
        }
       
       
    return resp;
}

String  GET_LISTA_PRECIOS_BY_ID_CLIENTE =
        
//        "SELECT l.id, l.articulo_id, a.codigo, a.descripcion, l.cliente_id, c.nombre, l.precio " +
//                             "FROM lista_precios l, articulos a, clientes c " +
//                             "WHERE  a.id = l.articulo_id " +
//                             "AND    c.id = l.cliente_id" +
//                             " AND   c.id = ";

" SELECT " +  
  "  a.id as articulo_id,  " +  
  "  a.codigo,  " +  
  "  a.descripcion, " +  
  "  c.id as cliente_id, " +  
  "  c.nombre, " +  
  "  ifnull((select id from lista_precios where articulo_id=a.id and cliente_id=c.id),0) as precio_id,  "+      
  "  ifnull((select precio from lista_precios where articulo_id=a.id and cliente_id=c.id),0) as precio  " +  
                            " FROM  articulos a, clientes c  " +  
                            " WHERE   c.id = ";

public Map<String, Object> getListaPreciosByIdCliente(String id){
    
    Connection dbCon = null;
    Map<String, Object> resp = new HashMap<String, Object> ();
    List<Map<String, Object>> listabycliente = new ArrayList<Map<String, Object>>();
    
    
      
       try{
     
		dbCon = new JDBCUtils().connectDatabase();
                QueryRunner queryRunner = new QueryRunner();
             
                listabycliente = queryRunner.query(dbCon, GET_LISTA_PRECIOS_BY_ID_CLIENTE + id, new MapListHandler() );
          
                
                if(listabycliente == null || listabycliente.isEmpty()){
                        resp.put("success", Boolean.FALSE);
                        resp.put("erromsg", "The Table is empty");
                        resp.put("payload", null);                    
                }else{
                        resp.put("success", Boolean.TRUE);
                        resp.put("erromsg", null);
                        resp.put("payload", listabycliente);
                }
                
                
        }catch(Exception e){
            //procedo roolback
            DbUtils.rollbackAndCloseQuietly(dbCon);
            resp.put("success", Boolean.FALSE);
            resp.put("erromsg", e.getMessage());
            resp.put("payload", null);        
        }finally{

            if(dbCon!=null){
                 try{
                     dbCon.close();
                 }catch(SQLException sqle){
                     resp.put("success", Boolean.FALSE);
                     resp.put("erromsg", sqle.getMessage());
                     resp.put("payload", null);      
                 }
             }
            
        }
       
       
    return resp;
}

String  INSERT_PRECIO_CLIENTEARTIULO = "INSERT INTO lista_precios(version, precio, articulo_id, cliente_id) VALUES(?,?,?,?)";
String  UPDATE_PRECIO_CLIENTEARTIULO = "UPDATE lista_precios SET version=?, precio=?, articulo_id=?, cliente_id=? WHERE id=?";
   
        
public Map<String, Object> insertaPrecioArticuloCliente(Map preciarticulocleinte){
    
    Connection dbCon = null;
    Map<String, Object> resp = new HashMap<String, Object> ();
    Map<String, Object> payload = new HashMap<String, Object> ();
    ScalarHandler<Long> scalarHandler = new ScalarHandler<Long>(); // paraa qyue obtenga el id
    
    // CABECERA
       Integer id           = preciarticulocleinte.get("id")          == null ? 0    : (Integer)preciarticulocleinte.get("id");  // si viene es update si no viene o es cero es insert
       Double precio        = preciarticulocleinte.get("precio")      == null ? 0.00 : (preciarticulocleinte.get("precio") instanceof Integer )?new Double((Integer)preciarticulocleinte.get("precio")):(Double)preciarticulocleinte.get("precio");            
       Integer articulo_id  = preciarticulocleinte.get("articulo_id") == null ? 0    : (Integer)preciarticulocleinte.get("articulo_id"); 
       Integer cliente_id   = preciarticulocleinte.get("cliente_id")  == null ? 0    : (Integer)preciarticulocleinte.get("cliente_id"); 
       
      
  
       if(articulo_id == 0 ){
            resp.put("success", Boolean.FALSE);
            resp.put("erromsg", "Articulo invalido");
            resp.put("payload", null);
            return resp;
        }
       
        if(cliente_id == 0 ){
            resp.put("success", Boolean.FALSE);
            resp.put("erromsg", "Cliente invalido");
            resp.put("payload", null);
            return resp;
        }
       
      
       
       //Procedo a grbar
       try{
     
		dbCon = new JDBCUtils().connectDatabase();           
                dbCon.setAutoCommit(false);
                QueryRunner queryRunner = new QueryRunner();
                
                 int numrows; 
                 Long newid = 0L;
                if( id != 0){ // String  UPDATE_PRECIO_CLIENTEARTIULO = "UPDATE lista_precios SET version=?, precio=?, articulo_id=?, cliente_id=? WHERE id=?";
                   numrows = queryRunner.update(dbCon, UPDATE_PRECIO_CLIENTEARTIULO , 0, precio, articulo_id, cliente_id, id);
                    payload.put("actualizados", numrows);
                }
                else{
                   // String  INSERT_PRECIO_CLIENTEARTIULO = "INSERT INTO lista_precios(version, precio, articulo_id, cliente_id) VALUES(?,?,?,?)";
                     newid = queryRunner.insert(dbCon, INSERT_PRECIO_CLIENTEARTIULO , scalarHandler, 0, precio, articulo_id, cliente_id);
                     payload.put("id", newid);
                }
                      
                // Finalizo
                DbUtils.commitAndCloseQuietly(dbCon);
                
                resp.put("success", Boolean.TRUE);
                resp.put("erromsg", null);
                resp.put("payload", payload);
               
        }catch(Exception e){
            //procedo roolback
            DbUtils.rollbackAndCloseQuietly(dbCon);
            resp.put("success", Boolean.FALSE);
            resp.put("erromsg", e.getMessage());
            resp.put("payload", null);        
        }finally{

            if(dbCon!=null){
                 try{
                     dbCon.close();
                 }catch(SQLException sqle){
                     resp.put("success", Boolean.FALSE);
                     resp.put("erromsg", sqle.getMessage());
                     resp.put("payload", null);      
                 }
             }
            
        }
       
       
    return resp;
    
}


}
