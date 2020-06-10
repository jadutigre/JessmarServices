/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group.spcsystems.controllers;

import com.group.spcsystems.entity.Usuarios;
import java.util.List;
import junit.framework.TestCase;

/**
 *
 * @author jadut
 */
public class JessmarControllerTest extends TestCase {
    
    public JessmarControllerTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of getListaPedidos method, of class JessmarController.
     */
//    public void testGetListaPedidos() {
//        System.out.println("getListaPedidos");
//        JessmarController instance = new JessmarController();
//        List<Pedidos> expResult = null;
//        List<Pedidos> result = instance.getListaPedidos();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getListaUsuarios method, of class JessmarController.
     */
    public void testGetListaUsuarios() {
        System.out.println("getListaUsuarios");
        JessmarController instance = new JessmarController();
        List<Usuarios> expResult = null;
        List<Usuarios> result = instance.getListaUsuarios();
        for (Usuarios usuarios : result) {
            System.out.println(" "+usuarios.getNombre());
        }
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getOneUsuario method, of class JessmarController.
     */
    public void testGetOneUsuario() {
        System.out.println("getOneUsuario");
        String idusuario = "jdelgado";
        JessmarController instance = new JessmarController();
        Usuarios expResult = null;
        Usuarios result = instance.getOneUsuario(idusuario);
        System.out.println("One User "+result.getNombre());
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
