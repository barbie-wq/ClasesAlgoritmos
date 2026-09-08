package semana2;

import java.util.Scanner;

public class Ejercicio21 {
    /* 21. Crear un array para guardar 5 enteros.  
a. Inicializar cada elemento 
b. Mostrar la suma de sus elementos 
c. Leer un número y decir si está en el array. Hacer una prueba de escritorio. 
d. Encontrar el número mayor dentro del array 
e. Calcular el promedio del array */
     public static void main (String[] args){
      Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero:" );
        int[] enteros = new int[5];
        int suma= 0;
            //INICIALIZAR Y CALCULAR LA SUMA
        for(int i = 0; i < enteros.length; i++){
            enteros[i] = i + 1;
            suma = suma + enteros[i];
        }
        //MOSTRAR LOS ELEMENTOS DEL ARRAY
        System.out.println("Elementos del array:");
        for(int num : enteros){
            System.out.print(num);
        }
        //B.MOSTRAR LA SUMA
        System.out.println("\nLa suma es: " + suma);
        //C.LEER UN NUMERO Y BUSCARLO
        System.out.println("Ingrese el numero buscado: ");
        int buscado = sc.nextInt();
        //SE CREA LA VARIABLE ENCONTRADO Y SE PONE COMO FALSE 
        //PARA SUPONER LO PEOR
        boolean encontrado = false;
        //POR ESO AQUI SE CREA EL FOR PPARA QUE EL PROGRAMA
        //PARE SI ENCUENTRA EL NUMERO
      for (int num : enteros){
            if (num == buscado){
                encontrado = true;
                break;
            }
        }   //RESPUESTA POR SI LO ENCUENTRA O NO 
            if(encontrado){
                System.out.println("El numero: " + buscado + " si esta en el array");
            } else{
                System.out.println("El numero: " + buscado + " No esta en el array");
            }
              int numeroMayor = enteros[0]; 
                for (int num : enteros) {
              if (num > numeroMayor){ 
                numeroMayor = num;
             
              }
            }
             System.out.println("El numero mayor es:" + numeroMayor);
                // e. Calcular el promedio
                // Se hace un casteo a (double) para obtener decimales exactos
                //En este caso el enteros.length devuelve la cantidad de posiciones.
                double promedio = (double) suma / enteros.length;
             System.out.println("El promedio es: " + promedio);
                sc.close();
    }
}
