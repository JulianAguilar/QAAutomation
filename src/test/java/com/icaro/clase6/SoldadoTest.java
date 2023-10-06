package com.icaro.clase6;

import com.icaro.clase2.Clase6.Soldado;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SoldadoTest {
    @Test
    public void pelearTest(){
        Soldado  soldado = new Soldado(60);
        soldado.pelear(30);

        Assert.assertEquals(soldado.getSalud(), 45, "Error en el valor salud");
    }


    @Test
    public void morirTest(){
        Soldado soldado = new Soldado(50);
        soldado.pelear(500);
        Assert.assertTrue(soldado.estaMuerto());
    }

    @Test
    public void noMorirTest(){
        Soldado soldado = new Soldado(50);
        soldado.pelear(10);
        Assert.assertFalse(soldado.estaMuerto());
    }





}
