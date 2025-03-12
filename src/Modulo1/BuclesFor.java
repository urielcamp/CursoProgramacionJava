package Modulo1;

import java.util.Arrays;
import java.util.LinkedList;

public class BuclesFor {

    public static void main(String[] args) {

        System.out.println("------------------------------------------");
        System.out.println("Ejercicio 1");
        System.out.println("------------------------------------------");
        System.out.println();
        //Imprimir los números pares del 2 al 20.

        for (int i = 2; i <= 20; i++){
            if(i%2 == 0){
                System.out.print(i + " ");
            }

        }


        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println("Ejercicio 2");
        System.out.println("------------------------------------------");
        System.out.println();

        //Sumar los primeros 100 números naturales.

        int sum = 0;

        for (int i = 1; i <= 100; i++){
            sum += i;

        }

        System.out.println(sum);

        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println("Ejercicio 3");
        System.out.println("------------------------------------------");
        System.out.println();

        //Mostrar los números del 10 al 1 en orden inverso.

        for (int i = 10; i >= 1; i--){
            System.out.print(i + " ");
        }


        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println("Ejercicio 4");
        System.out.println("------------------------------------------");
        System.out.println();

        //Calcular el factorial de un número ingresado por el usuario.

        int n = 5;
        int facAux = 1;
        for (int i = 1; i <= n; i++){
            facAux *= i;
        }

        System.out.println(facAux);


        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println("Ejercicio 5");
        System.out.println("------------------------------------------");
        System.out.println();

        //Mostrar la tabla de multiplicar del 5.

        for (int i = 1; i <= 10; i++){
            System.out.println("tabla del 5: " + " 5 * " + i + " = " + 5*i );
        }

        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println("Ejercicio 6");
        System.out.println("------------------------------------------");
        System.out.println();

        //Imprimir los primeros 10 números de la serie Fibonacci.


        int[] fib = new int[10];
        fib[0] = 1;
        fib[1] = 1;

        int num;
        for (int i = 2; i < fib.length; i++){
            num = fib[i -1] + fib[i - 2];
            fib[i] = num;
        }

        System.out.println(Arrays.toString(fib));














    }



}
