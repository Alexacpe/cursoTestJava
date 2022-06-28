package com.cursotest.javatest.util;

public class StringUtil {
    //funcion para repetir string (parametro: el string que se va a repetir, las veces que se va a repetir)
    public static String repeat(String str, int times){
        //implementar la funcion
        //inicia vacio
        String result = "";
        //iterar las veces que indica times
        for (int i = 0; i < times; i++) {
            result += str;
        }
        return result;
    }
}
