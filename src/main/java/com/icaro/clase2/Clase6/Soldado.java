package com.icaro.clase2.Clase6;

public class Soldado {


    private int salud;

    public Soldado(int salud) {
        this.salud = salud;
    }

    public Soldado() {
        this.salud = 100;
    }

    public  int getSalud(){
        return this.salud;
    }

    public void pelear (int ataque) {
        this.salud = this.salud - (ataque/2);
    }

    public void descansar (){
            this.salud = this.salud + 10;
        this.salud +=10;
    }

    public boolean estaMuerto(){
        return this.salud <=0;
    }
}
