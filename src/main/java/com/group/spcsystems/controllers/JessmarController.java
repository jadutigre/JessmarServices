/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group.spcsystems.controllers;

import Tool.JDBCUtils;
import com.group.spcsystems.entity.Cattipopedido;
import com.group.spcsystems.entity.Pedidos;
import com.group.spcsystems.entity.Usuarios;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLRecoverableException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

/**
 *
 * @author jadut
 */
public class JessmarController {
    
String  GET_LISTA_DE_PEDIDOS = "select * from pedidos order by id desc";
    
public List<Pedidos> getListaPedidos(){
 System.out.println("getListaPedidos");
 Connection dbCon = null;
 List<Pedidos> listapedidos = new ArrayList<Pedidos>();
 
 try{
     
		dbCon = new JDBCUtils().connectDatabase();
                QueryRunner run = new QueryRunner();

                // Use the BeanListHandler implementation to convert all
                // ResultSet rows into a List of Person JavaBeans.
                ResultSetHandler<List<Pedidos>> h = new BeanListHandler<Pedidos>(Pedidos.class);

                // Execute the SQL statement and return the results in a List of
                // Person objects generated by the BeanListHandler.
                listapedidos = run.query(dbCon, GET_LISTA_DE_PEDIDOS, h );

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
    
    
}
