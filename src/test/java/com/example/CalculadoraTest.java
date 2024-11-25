package com.example;

// Los imports deben ir al inicio, fuera de las clases.
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    void testSumar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(5, calculadora.sumar(2, 3));
    }

    @Test
    void testRestar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(1, calculadora.restar(3, 2));
    }
}

