/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package querypresta;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author FTVWEB1
 */
public class QueryPrestaTest {
    
    public QueryPrestaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of ejecutar_sql_update method, of class QueryPresta.
     */
  

    /**
     * Test of hacer_conexion method, of class QueryPresta.
     */
    @Test
    public void testHacer_conexion() {
        System.out.println("hacer_conexion");
        QueryPresta.hacer_conexion();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of hacer_conexionSql method, of class QueryPresta.
     */
    @Test
    public void testHacer_conexionSql() {
        System.out.println("hacer_conexionSql");
        QueryPresta.hacer_conexionSql();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class QueryPresta.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        QueryPresta.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
