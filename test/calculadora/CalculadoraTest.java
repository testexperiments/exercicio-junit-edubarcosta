package calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CalculadoraTest{
    @Test
    public void TestSoma(){
        Calculadora c = new Calculadora();
        double soma = c.calc(5, 6, '+');
        assertEquals(11.0, soma);
    }

    @Test
    public void TestSub(){
        Calculadora b = new Calculadora();
        double sub = b.calc(10, 5, '-');
        assertEquals(5.0, sub);
    }

    @Test
    public void TestMult(){
        Calculadora b = new Calculadora();
        double sub = b.calc(10, 5, '*');
        assertEquals(50.0, sub);
    }
}
