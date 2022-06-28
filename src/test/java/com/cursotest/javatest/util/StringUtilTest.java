package com.cursotest.javatest.util;

//prueba unitaria manual para repetir strings
public class StringUtilTest {
    public static void main(String[] args) {
        //se llama la funcion a la que se le va a realizar el test
        String result = StringUtil.repeat("Saludo, ",5);
        System.out.println(result);
    }
}