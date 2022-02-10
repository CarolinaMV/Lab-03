package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.Assert;
import org.junit.Test;

public class TarifaTest{
    @Test
    public void ValidarDiasAntelacionEdadPrimero(){
        double tarifaBase = 1000000;
        int diasAntelacion = 30;
        int edad = 83;
        double resultado = CalculadorDescuentos.calculoTarifa(1000000, 30, 83);
        Assert.assertEquals(850000, resultado, 0);
    }

    @Test
    public void ValidarMenorDiasAntelacionMenorEdad(){
        double tarifaBase = 1000000;
        int diasAntelacion = 4;
        int edad = 10;
        double resultado = CalculadorDescuentos.calculoTarifa(1000000, 4, 10);
        Assert.assertEquals(950000, resultado, 0);
    }

    @Test
    public void ValidarMenorDiasAntelacionEdadPrimero(){
        double tarifaBase = 1000000;
        int diasAntelacion = 4;
        int edad = 55;
        double resultado = CalculadorDescuentos.calculoTarifa(1000000, 4, 55);
        Assert.assertEquals(920000, resultado, 0);
    }

    @Test
    public void ValidarDiasAntelacionMenorEdad(){
        double tarifaBase = 1000000;
        int diasAntelacion = 26;
        int edad = 15;
        double resultado = CalculadorDescuentos.calculoTarifa(1000000, 26, 15);
        Assert.assertEquals(800000, resultado, 0);
    }

    @Test
    public void ValidarDiasAntelacionEdadSegundo(){
        double tarifaBase = 1000000;
        int diasAntelacion = 31;
        int edad = 60;
        double resultado = CalculadorDescuentos.calculoTarifa(1000000, 31, 60);
        Assert.assertEquals(770000, resultado, 0);
    }

    @Test
    public void ValidarMenorDiasAntelacionEdadSegundo(){
        double tarifaBase = 1000000;
        int diasAntelacion = 2;
        int edad = 71;
        double resultado = CalculadorDescuentos.calculoTarifa(1000000, 2, 71);
        Assert.assertEquals(1000000, resultado, 0);
    }
}