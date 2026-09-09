package semana3;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*18. Crear una matriz de caracteres de 3 × 3 que represente un tablero. Inicialmente todos los 
        lugares contienen '.' (punto). Permitir al usuario indicar fila, columna y caractér (X u O). 
        Mostrar el tablero después de cada jugada.  */
        char[][] tablero =  new char[3][3];//se usa char para guardar un caracter
        for (int fila = 0; fila < tablero.length; fila++){
            for(int columna = 0; columna < tablero[fila].length; columna++){
               tablero[fila][columna]= '.';
            }
        }
        //Realizar 9 jugadas
        for(int jugada = 0; jugada < 9; jugada++){
            System.out.println("Ingrese la fila 1-3: ");
            int fila = sc.nextInt() - 1;

            System.out.println("Ingrese la columna 1-3: ");
            int columna = sc.nextInt() - 1;

            System.out.println("Ingrese el caracter X u O: ");
            char caracter = sc.next().toUpperCase().charAt(0);

            if (fila >= 0 && fila < 3 &&
                columna >= 0 && columna < 3 &&
                (caracter == 'X' || caracter == 'O')) {

                tablero[fila][columna] = caracter;

                for (int i = 0; i < tablero.length; i++) {
                    for (int j = 0; j < tablero[i].length; j++) {
                        System.out.print(tablero[i][j] + " ");
                    }
                    System.out.println();
                }

            } else {
                System.out.println("Datos inválidos. Intente nuevamente.");
                jugada--;
            }


        }
        sc.close();
        
    }

}
