package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

    private Calculadora calculadora = new Calculadora();
    
    @Test
    void somar(){
        int resultado = calculadora.somar(1, 2);

        Assertions.assertEquals(3, resultado);
        
    }

    @Test
    void subtrair(){
        int resultado = calculadora.subtrair(10, 2);

        Assertions.assertEquals(8, resultado);
    }

    @Test
    void divisao(){
        int resultado  = calculadora.divisao(10, 2);

        Assertions.assertEquals(5, resultado);
    }

    @Test
    void multiplicar(){
        int resultado = calculadora.multiplicar(10, 3);

        Assertions.assertEquals(30, resultado);
    }
}
