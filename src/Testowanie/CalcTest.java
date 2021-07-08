package Testowanie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {
    
    Calc calc = new Calc();
    
    @Test
    public void testSuma(){
        assertEquals(10, calc.suma(5, 5));
    }

    @Test
    public void testRoznica(){
        assertEquals(5, calc.roznica(7, 2));
    }

    @Test
    public void testIloczyn(){
        assertEquals(20, calc.iloczyn(4, 5));
    }

    @Test
    public void testIloraz(){
        assertEquals(7, calc.iloraz(21, 3));
    }

}
