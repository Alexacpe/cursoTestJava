package com.cursotest.javatest.util;

//prueba unitaria manual para repetir strings
public class StringUtilTest {
    public static void main(String[] args) {

        //se llama la funcion a la que se le va a realizar el test
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
        //funcion con parametros valor actual y valor esperado
    private static void assertEquals(String actual, String expected) {
        if (!actual.equals(expected)) {
            //lanzar excepcion para mostrar el error
            throw new RuntimeException(actual + "no es igual al valor esperado: "+expected);
        }
    }
}
