/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group.sunset.services;

import com.group.sunset.entity.Pedidos;
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
     * Test of getFacturasPorFecha method, of class JessmarController.
     */
    public void testGetFacturasPorFecha() {
        System.out.println("getFacturasPorFecha");
        JessmarController instance = new JessmarController();
        List<Pedidos> expResult = null;
        List<Pedidos> result = instance.getListaPedidos();
        for (Pedidos pedidos : result) {
            System.out.println(" "+pedidos.getId());
        }
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
