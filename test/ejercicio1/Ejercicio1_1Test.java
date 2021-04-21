/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author javie
 */
public class Ejercicio1_1Test {
    
    public Ejercicio1_1Test() {
    }

    /**
     * Test of getCampoTexto method, of class Ejercicio1.
     */


    /**
     * Test of IntroducirCadena method, of class Ejercicio1.
     */
/*    @Test
    public void testIntroducirCadena() {
        System.out.println("IntroducirCadena");
        String miCadena = "";
        Ejercicio1 instance = new Ejercicio1();
        String expResult = "";
        String result = instance.IntroducirCadena(miCadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/    
     @Test
    public void testIntroducirCadena_Menos_de_6() {
        System.out.println("IntroducirCadena");
        String miCadena = "cinco";
        Ejercicio1 instance = new Ejercicio1();
        String expResult = "Cadena incorrecta. La longuitud de la cadena es < 6";
        String result = instance.IntroducirCadena(miCadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
