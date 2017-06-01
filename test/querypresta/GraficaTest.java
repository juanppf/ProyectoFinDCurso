/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package querypresta;

import java.sql.SQLException;
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
public class GraficaTest {
    
    public GraficaTest() {
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
     * Test of hacer_conexionSql method, of class Grafica.
     */
    @Test
    public void testHacer_conexionSql() {
        System.out.println("hacer_conexionSql");
        Grafica.hacer_conexionSql();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Grafica.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Grafica.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of generar_grafica method, of class Grafica.
     */
    @Test
    public void testGenerar_grafica() throws SQLException {
        System.out.println("generar_grafica");
        String year = "";
        Grafica instance = new Grafica();
        instance.generar_grafica(year);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
