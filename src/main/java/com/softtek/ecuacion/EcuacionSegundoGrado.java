package com.softtek.ecuacion;

import static java.lang.Math.sqrt;

/**
 * Ecuación en formato:
 *
 * ax^2 + bx + c = 0
 *
 * a : parte1
 * b : parte2
 * + : operador
 * c: parte3
 *
 * Solucion:
 * x = (- b +- sqrt(b^2 - 4 * a * c)) / (2 * a)
 * es decir:
 *
 * x = (- parte2 +- sqrt(parte2^2 - 4 * parte1 * parte3)) / (2 * parte1)
 */
public class EcuacionSegundoGrado {

    private Parseador parseador = new Parseador();

    public Double[] obtenerResultado(final String ecuacion) {

        int parte1 = parseador.obtenerParteCuadratica(ecuacion);
        int parte2 = parseador.obtenerParteLineal(ecuacion);
        int parte3 = parseador.obtenerParteIndependiente(ecuacion);

        double discriminante = (Math.pow(parte2,2))-(4 * parte1 * parte3);
        if (discriminante > 0){
            double raiz = sqrt(discriminante);
            Double[] resultados = new Double[2];
            resultados[0] = (- parte2 + raiz) / (2 * parte1);
            resultados[1] = (- parte2 - raiz) / (2 * parte1);
            return resultados;
        } else if (discriminante == 0) {
            Double[] resultados = new Double[1];
            resultados[0] = Double.valueOf((- parte2) / (2 * parte1));
            return resultados;
        }else {
            return null;
        }
    }
}
