package semana2;

import java.util.Scanner;

public class Ejercicio19y20 {
    /* Sección 5: Arrays/Arreglos 
    19. Declarar un array de enteros. 
    20. Crear e inicializar (al mismo tiempo) un array con 5 números enteros. Luego, mostrar los 
    5 números por consola a partir del array creado. */
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int[] arrayEnteros2 = {1,2,3,4,5};
    for(int i = 0; i < arrayEnteros2.length; i++){
        System.out.println(arrayEnteros2[i]);
      
    }
      sc.close();
  }
}
