package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

class AppTest {
    static Factorial f1, f2;

    @BeforeAll public static void setUp() {
        try
        {
            f1 = new Factorial(5);
            f2 = new Factorial(6);
        }
        catch (FactorialException fe )
        {
        }
    }

    @Test public void testN1() {
        assertTrue(f1.getN()==5);
    }

    @Test public void testN2() {
        assertTrue(f2.getN()==6);
    }

    @Test public void testF1() {
        assertTrue(f1.calcularFactorial()==120);
    }

    @Test public void testF2() {
        assertTrue(f2.calcularFactorial()==720);
    }
}