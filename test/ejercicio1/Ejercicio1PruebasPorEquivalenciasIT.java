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
 * @author javier Bustamante Toledo
 */
public class Ejercicio1PruebasPorEquivalenciasIT {
    
    public Ejercicio1PruebasPorEquivalenciasIT() {
    }

    @Test
    public void testCaso3_1() {
        System.out.println("Caso 3.1: Datos de entrada: cadena de 5 caracteres. Resultado esperado (Salida): \n"
                + "La aplicación no permite el ingreso del dato y muestra un mensaje de error.");
        Ejercicio1 instance = new Ejercicio1();
        String expResult = "Cadena incorrecta. La longuitud de la cadena es < 6";
        String result = instance.IntroducirCadena("cinco");
        assertEquals(expResult, result);
    }
    @Test
    public void testCaso3_2() {
        System.out.println("Caso 3.2: Datos de entrada: cadena de 7 caracteres, incluyendo uno o más caracteres no\n" +
"alfabéticos. Resultado esperado (Salida): La aplicación no permite el ingreso del dato y\n" +
"muestra un mensaje de error.");
        Ejercicio1 instance = new Ejercicio1();
        String expResult = "Cadena incorrecta. No es alfabética.";
        String result = instance.IntroducirCadena("cinco55");
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCaso3_3() {
        System.out.println("Caso 3.3: Datos de entrada: cadena de 7 caracteres, solo de caracteres alfabéticos. Resultado\n" +
"esperado (Salida): La aplicación permite el ingreso del dato.");
        Ejercicio1 instance = new Ejercicio1();
        String expResult = "Cadena correcta. La aplicación permite el ingreso.";
        String result = instance.IntroducirCadena("septimo");
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCaso3_4() {
        System.out.println("Caso 3.4: Datos de entrada: cadena de 11 caracteres. Resultado esperado (Salida): La\n" +
"aplicación no permite el ingreso del dato y muestra un mensaje de error.");
        Ejercicio1 instance = new Ejercicio1();
        String expResult = "Cadena incorrecta. La longuitud de la cadena es > 10";
        String result = instance.IntroducirCadena("murcielagos");
        assertEquals(expResult, result);
    }
}
