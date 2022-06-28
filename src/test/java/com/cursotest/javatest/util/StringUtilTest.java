package com.cursotest.javatest.util;

//prueba unitaria manual para repetir strings
public class StringUtilTest {
    public static void main(String[] args) {

        //se llama la funcion a la que se le va a realizar el test
        String result = StringUtil.repeat("Saludo, ",5);
        if(result.equals("Saludo, Saludo, Saludo, Saludo, Saludo,")){
            System.out.println("OK");
        } else {
            System.out.println("no son los parametros");
        }

        String result2 = StringUtil.repeat("Saludo, ",1);
        if(result2.equals("Saludo, ")){
            System.out.println("OK");
        }
    }
}