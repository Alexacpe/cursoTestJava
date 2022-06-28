package com.cursotest.javatest.util;

import org.junit.Assert;
import org.junit.Test;

//prueba unitaria manual para repetir strings
public class StringUtilTest {
   /* public static void main(String[] args) {

       /* //se llama la funcion a la que se le va a realizar el test
        String result = StringUtil.repeat("Saludo, ", 5);
        if (!result.equals("Saludo, Saludo, Saludo, Saludo, Saludo, ")) {
            //lanzar excepcion para mostrar el error
            throw new RuntimeException("ERROR");
        }else{
            System.out.println("---compilacion completa");
        }

        //crear funcion con mas informacion, lo que resulta con lo esperado
        String result2 = StringUtil.repeat("Saludo2, ", 3);

        assertEquals(result2,"Saludo2, Saludo2, Saludo2, sa");
    }
        //funcion con parametros valor actual y valor esperado de forma manual
    //private static void assertEquals(String actual, String expected) {
      if (!actual.equals(expected)) {
            lanzar excepcion para mostrar el error
            throw new RuntimeException(actual + "no es igual al valor esperado: "+expected);
        }
    }
    }*/
    //Con JUnit no se usa el metodo main, se le indica por medio de anotacion cual es el metodo de test
    @Test
    public void testRepeat(){
        //funcion con parametros valor valor esperado y valor actual JUnit
        Assert.assertEquals("Saludo 3, Saludo 3, ",StringUtil.repeat("Saludo 3, ", 2));
        Assert.assertEquals("Saludo 4, ",StringUtil.repeat("Saludo 4, ", 1));
    }
}
