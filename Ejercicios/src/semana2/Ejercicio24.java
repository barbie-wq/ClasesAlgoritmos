package semana2;

import java.util.Scanner;

public class Ejercicio24 {
    public static void fibonacci(int cantidad, int anterior, int actual) {
        if (cantidad == 0) {
            return;
        }
        System.out.print(anterior + " ");
        fibonacci(cantidad - 1, actual, anterior + actual);
    }

    /* 24. Leer un número entero (N) y mostrar los primeros N elementos de una secuencia de
    Fibonacci, de la siguiente manera: */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=======================================");
        System.out.println("       Secuencia de Fibonacci          ");
        System.out.println("=======================================");
        System.out.println("Cuantos terminos desea mostrar? ");
        int n = sc.nextInt();

        if (n > 0) {
            fibonacci(n, 0, 1);
        }

        sc.close();
    }
}
  
