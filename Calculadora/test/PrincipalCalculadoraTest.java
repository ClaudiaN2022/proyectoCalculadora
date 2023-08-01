import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrincipalCalculadoraTest {


    /**
     * Prueba del metodo suma() de la clase Calculadora.
     */

    @Test
    public void testSuma(){

        assertEquals(50,PrincipalCalculadora.sumar(20,30));
    }

    @Test
    public void testResta(){

        assertEquals(10,PrincipalCalculadora.restar(30,20));
    }


    @Test
    public void testMultiplicacion(){

        assertEquals(100,PrincipalCalculadora.multiplicar(10,10));
    }

    @Test
    public void testDivision(){

        assertEquals(5,PrincipalCalculadora.dividir(10,2));
    }

}