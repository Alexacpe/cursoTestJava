package com.cursotest.javatest.player;

import java.util.Random;

//Clase para el dado
public class Dice {
    //numero de caras del dado
    private int sides;

    public Dice(int sides) {
        this.sides = sides;
    }

    //metodo que da el numero del dado
    public int roll(){
        //retornar numero random
        return new Random().nextInt(sides);
    }
}
