package Modulo1;

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














    }



}
