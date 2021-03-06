/**
 * Probas para a clase Circulo
 * @author A21SaraLT
 */
package aro;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author A21SaraLT
 */
public class AroTest {
    
    /**
     *constructor
     */
    public AroTest() {
    }
    
    /**
     * Test of establecerX method, of class Aro.
     */
    @Test
    public void testSetCoordenadaX() {
        System.out.println("setCoordenadaX");
        int valorX = 0;
        Aro instance = new Aro();
        instance.setCoordenadaX(valorX);
    }

    /**
     * Test of obterX method, of class Aro.
     */
    @Test
    public void testGetCoordenadaX() {
        System.out.println("getCoordenadaX");
        Aro instance = new Aro(0,0,0.1);
        int expResult = 0;
        int result = instance.getCoordenadaX();
        assertEquals(expResult, result);
    }

    /**
     * Test of establecerY method, of class Aro.
     */
    @Test
    public void testSetCoordenadaY() {
        System.out.println("setCoordenadaY");
        int valorY = 0;
        Aro instance = new Aro();
        instance.setCoordenadaY(valorY);
    }

    /**
     * Test of obterY method, of class Aro.
     */
    @Test
    public void testGetCoordenadaY() {
        System.out.println("getCoordenadaY");
        Aro instance = new Aro(0,0,0.1);
        int expResult = 0;
        int result = instance.getCoordenadaY();
        assertEquals(expResult, result);
    }

    /**
     * Test of establecerRadio method, of class Aro.
     */
    @Test
    public void testEstablecerRadio() {
        System.out.println("establecerRadio");
        Aro instance = new Aro();
        instance.setRadio(0.0);
        instance.setRadio(0.1);
        instance.setRadio(-0.1);
    }

    /**
     * Test of obterRadio method, of class Aro.
     */
    @Test
    public void testObterRadio() {
        System.out.println("obterRadio");
        Aro instance = new Aro(0,0,0.1);
        double result = instance.getRadio();
        assertEquals(0.1, result,0);

        instance.setRadio(0.1);
        result= instance.getRadio();
        assertEquals(0.1, result,0);

        instance.setRadio(-0.1);
        result= instance.getRadio();
        assertEquals(0.0, result,0);
    }

    /**
     * Test of obterDiametro method, of class Aro.
     */
    @Test
    public void testObterDiametro() {
        System.out.println("obterDiametro");
        Aro instance = new Aro(0,0,0.1);
        double result = instance.obterDiametro();
        assertEquals(0.2, result,0);
    }

    /**
     * Test of obterCircunferencia method, of class Aro.
     */
    @Test
    public void testObterCircunferencia() {
        System.out.println("obterCircunferencia");
        Aro instance = new Aro(0,0,0.1);
        double expResult = 0.6283185;
        double result = instance.obterCircunferencia();
        assertEquals(expResult, result,1e-6);
    }

    /**
     * Test of obterSuperficie method, of class Aro.
     */
    @Test
    public void testObterSuperficie() {
        System.out.println("obterArea");
        Aro instance = new Aro(0,0,0.1);
        double expResult = 0.0314159;
        double result = instance.obterSuperficie();
        assertEquals(expResult, result,1e-6);
    }

    /**
     * Test of trasladarCentro method, of class Aro.
     */
    @Test
    public void testTrasladarCentro() {
        System.out.println("trasladarCentro");
        Aro instance = new Aro();
        int resultx=instance.getCoordenadaX();
        int resulty=instance.getCoordenadaY();
        instance.trasladarCentro(5, 6);
        int resultnx = instance.getCoordenadaX();
        int resultny = instance.getCoordenadaY();
        assertEquals(resultx+5, resultnx);
        assertEquals(resulty+6, resultny);
    }
    
}
