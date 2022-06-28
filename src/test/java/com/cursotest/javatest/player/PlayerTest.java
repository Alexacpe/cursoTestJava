package com.cursotest.javatest.player;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PlayerTest {
    //Pierde si el dado da un numero muy pequeño
    @Test
    public void loseWhenDiceNumberIsTooLow(){
        //implementar clase dado
        //Dice dice = new Dice(6);
        //como la clase me devuelve un numero random no puedo ejecutar bien la prueba ya que necesito un numero fijo
        //usar Mockito me sirve para simular  manipular la clase para obtener el resultado esperado
        Dice dice= Mockito.mock(Dice.class);//se indica la clase que quiero simular

        //simular que el dado tira un 2 al llamar roll de la clase dice para que jugador pierda
        Mockito.when(dice.roll()).thenReturn(2);

        Player player = new Player(dice,4);
        //esperando que pierda cuando juega
        assertFalse(player.play());
    }
    @Test
    public void winWhenDiceNumberIsBig(){
        Dice dice= Mockito.mock(Dice.class);//se indica la clase que quiero simular

        //simular que el dado tira un 6 al llamar roll de la clase dice para que jugador gane
        Mockito.when(dice.roll()).thenReturn(6);

        Player player = new Player(dice,4);
        //esperando que pierda cuando juega
        assertTrue(player.play());
    }
}

