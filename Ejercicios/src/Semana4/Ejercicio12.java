package Semana4;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        /*12. Fibonacci recursivo: 
        a. Tomar el ejercicio de Fibonacci de la Lista N°2 y modificarlo para implementarlo 
        en una función recursiva que retorne el término correspondiente:  */
        Scanner sc = new Scanner(System.in);
        System.out.println("=======================================");
        System.out.println("       Secuencia de Fibonacci          ");
        System.out.println("=======================================");
        System.out.println("Cuantos terminos desea mostrar? ");
        int n = sc.nextInt();
          if (n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }
       sc.close();
    }
    public static int fibonacci(int n){
        if (n == 0) {
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
