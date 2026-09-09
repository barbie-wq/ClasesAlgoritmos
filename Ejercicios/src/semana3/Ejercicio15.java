package semana3;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
     /*15. Cargar y mostrar una matriz. Crear una matriz de 3x3. Solicitar los valores al usuario y 
     luego mostrarla de manera ordenada  */
     Scanner sc = new Scanner(System.in);
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
            for(int columna = 0; columna < matriz.length; columna++){
                System.out.print(matriz[fila][columna] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
