package semana3;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*16. Leer una matriz de 3x3 y calcular: */
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
        //a. Suma de todos los números en ella. 
        int suma = 0;
        int  numeroMayor = matriz [0][0];
        int numeroMenor = matriz [0][0];
        for (int fila = 0; fila < matriz.length; fila++){
            for(int columna = 0; columna < matriz.length; columna++){
                suma = suma + matriz [fila][columna];
                //c. Determinar el número mayor en ella. 
                if (matriz[fila][columna] > numeroMayor) {
                    numeroMayor = matriz[fila][columna];
                }
                //d. Determinar el número menor en ella. 
                if(matriz[fila][columna] < numeroMenor){
                    numeroMenor = matriz [fila][columna];
                }
            }

        }
        //b. Promedio de todos los números en ella.                                
        //es la cantidad de filas y la otra matriz es la cantidad de columnas
       double promedio = (double) suma / (matriz.length * matriz[0].length);
       System.out.println("La suma de todos los valores es: " + suma);
       System.out.println("El promedio es: " + promedio);
       System.out.println("El numero mayor es:" + numeroMayor);
       System.out.println("El numero menor es:" + numeroMenor);
       sc.close();
    }
}
