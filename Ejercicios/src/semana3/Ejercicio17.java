package semana3;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // 17. Leer una matriz de 3 × 3 y mostrar: 
       int[][] matriz = new int[3][3];
     //Para que recorra las filas
     //se solicitan los valores
     for (int fila = 0; fila < matriz.length; fila++){
            for(int columna = 0; columna < matriz.length; columna++){
                System.out.println("Ingrese el valor: [" + fila + "][" + columna + "]:  ");
                matriz[fila][columna] = sc.nextInt();
            }
        }
         System.out.println("\n matriz:");
        for (int fila = 0; fila < matriz.length; fila++){
            for(int columna = 0; columna < matriz[fila].length; columna++){
                System.out.print(matriz[fila][columna] + "\t");
            }
            System.out.println();
        }
        //a. Los elementos de la diagonal principal 
        int suma = 0;
        System.out.println("\n Diagonal principal:");
     for (int i = 0; i < matriz.length; i ++){
            System.out.print(matriz[i][i] + "\t");
            suma = suma + matriz[i][i];
        }
        System.out.println();
        System.out.println("La suma de la diagonal principal es: " + suma);
        sc.close();
    }
}
