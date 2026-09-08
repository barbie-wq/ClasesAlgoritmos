package semana3;

import java.util.Scanner;

public class Ejercicio9{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        /* 9. Leer números enteros y guardarlos en un array. Luego solicitar un número al usuario e 
        indicar: 
        a. Si el número se encuentra en el array. 
        b. Cuantas veces aparece. 
        c. En qué posiciones aparece. */

        int [] numeroEnteros = {1,4,6,8,4,3};
        System.out.println("Ingrese un numero:");
        int numeroIngresado= sc.nextInt();
        int contador = 0;
        for(int i = 0; i < numeroEnteros.length; i++){
            if (numeroIngresado == numeroEnteros[i]){
                    
                 System.out.println("Si esta dentro del array: " + numeroEnteros[i]);
              
            }
            if(numeroIngresado == numeroEnteros[i]){
                contador  ++;
                System.out.println("El numero aparece en la posicion: " + (i+1));
            
            }
        
        }
        System.out.println("el numero aparece " + contador + " veces");
        sc.close();
    }
    
}