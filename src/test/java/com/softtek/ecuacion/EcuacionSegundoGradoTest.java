package com.softtek.ecuacion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EcuacionSegundoGradoTest {

    EcuacionSegundoGrado ecuacion = new EcuacionSegundoGrado();

    @Test
    public void solucionDiscriminanteMayor0() {

        Double[] resultado = ecuacion.obtenerResultado("5x^2 + 6x + 1");

        Double valor1 = -0.2;
        Double valor2 = -1.0;

        assertEquals(valor1, resultado[0]);
        assertEquals(valor2, resultado[1]);
    }

    @Test
    public void solucionaDiscriminanteMenor0() {

        Double[] resultado = ecuacion.obtenerResultado("5x^2 + 2x + 1");

        Double valueExpected = null;

        assertEquals(valueExpected, resultado);
    }

    @Test
    public void solucionaDiscriminanteIgual0() {

        Double[] resultado = ecuacion.obtenerResultado("2x^2 - 4x + 2");

        Double valueExpected = 1.0;

        assertEquals(valueExpected, resultado[0]);
    }

}
