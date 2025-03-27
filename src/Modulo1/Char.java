package Modulo1;


public class Char {
    public static void main(String[] args) {


        System.out.println("-------------------------------");
        System.out.println();
        System.out.println("EJERCICIO 1");
        System.out.println();


        //Leer un char e imprimirlo

        char l = 'l';
        System.out.println(l);


        System.out.println();
        System.out.println("-------------------------------");
        System.out.println();
        System.out.println("EJERCICIO 2");
        System.out.println();

        //Comprobar si un char es una vocal.

        char v = 'a';

        if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u') {
            System.out.println(v + " es una vocal");
        }else{
            System.out.println(v + " no es una vocal");
        }


        System.out.println();
        System.out.println("-------------------------------");
        System.out.println();
        System.out.println("EJERCICIO 3");
        System.out.println();


        //Convertir un char a mayúscula.

        char m = 'M';

        boolean esMayus = Character.isUpperCase(m);

        if (esMayus) {
            System.out.println(m + "  es una mayuscula");
        }else{
            System.out.println(m + " no es una mayuscula");
        }

        System.out.println();
        System.out.println("-------------------------------");
        System.out.println();
        System.out.println("EJERCICIO 4");
        System.out.println();

        //Verificar si un char es un número.

        char n = '8';

        boolean isNumber = Character.isLetter(n);

        if (isNumber) {
            System.out.println(n + " No es un numero");
        }else{
            System.out.println(n + " Es un numero");
        }


        System.out.println();
        System.out.println("-------------------------------");
        System.out.println();
        System.out.println("EJERCICIO 5");
        System.out.println();

        //Contar cuántas veces aparece un carácter en una palabra.

        String palabra = "lalalo";

        char a = 'a';

        int count = 0;
        for(int i = 0; i < palabra.length(); i++){
            if (palabra.charAt(i) == a) {
                count++;
            }
        }

        System.out.println("En la palabra " + palabra + " aparece el caracter " + a + " " + count + " veces");

        System.out.println();
        System.out.println("-------------------------------");
        System.out.println();
        System.out.println("EJERCICIO 6");
        System.out.println();

        //Comprobar si un char es un símbolo (@, #, $, etc.).

        char simbol = '&';

        
        
        if (simbol == '@' || simbol == '#' || simbol == '$' || simbol == '&') {
            System.out.println(simbol + " es un simbolo");
        }else{
            System.out.println(simbol + " no es un simbolo");
        }


        System.out.println();
        System.out.println("-------------------------------");
        System.out.println();
        System.out.println("EJERCICIO 7");
        System.out.println();

        //


    }
}