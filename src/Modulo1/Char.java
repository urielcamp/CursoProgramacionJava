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


    }
}