package Modulo1;

import java.util.Arrays;
import java.util.LinkedList;

public class BuclesFor {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println("DIFICULTAD FACIL");
        System.out.println("------------------------------------------");
        System.out.println();

        System.out.println();
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


        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println("DIFICULTAD MEDIA");
        System.out.println("------------------------------------------");
        System.out.println();


        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println("Ejercicio 1");
        System.out.println("------------------------------------------");
        System.out.println();

        //Imprimir los números primos entre 1 y 50.


        for (int i = 2; i <= 50; i++){
            boolean esPrimo = true;

            for (int j = 2; j <= Math.sqrt(i); j++){
                if (i% j == 0){
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo){
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println("Ejercicio 2");
        System.out.println("------------------------------------------");
        System.out.println();

        //Comprobar si un número es perfecto.


        boolean esPerfect = true;
        int numero = 496;
        double aux = 0;

        for (int i = 1; i <= numero; i++){

            if (numero%i == 0){
                aux += i;
            }


            if (aux == numero){
                esPerfect = true;
                break;
            }else {
                esPerfect = false;
            }


        }

        if (esPerfect){
            System.out.println(numero + " es perfecto");
        }else {
            System.out.println(numero + " no es perfecto");
        }


        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println("Ejercicio 3");
        System.out.println("------------------------------------------");
        System.out.println();

        //Calcular la media de una lista de números ingresados por el usuario.

        int usNum = 10;
        int auxil = 0;
        for (int i = 1; i<= usNum; i++){
            auxil += i;
        }


        System.out.println("La media de " + usNum + " es: " + auxil/usNum);


        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println("Ejercicio 4");
        System.out.println("------------------------------------------");
        System.out.println();

        //Generar los primeros 20 números de la serie Fibonacci.

        int[] fibExt = new int[20];

        fibExt[0] = 1;
        fibExt[1] = 1;

        int afib = 0;

        for (int i = 2; i < fibExt.length; i++){
            afib = fibExt[i - 1] + fibExt[i -2];
            fibExt[i] = afib;
        }

        System.out.println(Arrays.toString(fibExt));


        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println("DIFICULTAD DIFICIL");
        System.out.println("------------------------------------------");
        System.out.println();


        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println("Ejercicio 1");
        System.out.println("------------------------------------------");
        System.out.println();

        //Resolver la serie de Collatz para un número ingresado.

        int m = 3;
        int numb = 0;

        for (; m != 1;){
            if (m%2==0){
                m = m/2;
            }else {
                m = 3*m + 1;
            }

            System.out.print(m + " ");
        }


        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println("Ejercicio 2");
        System.out.println("------------------------------------------");
        System.out.println();


        //Resolver el problema de la serie de Tribonacci.






















    }



}
