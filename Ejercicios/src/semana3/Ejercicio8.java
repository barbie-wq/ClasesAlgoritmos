package semana3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*8. Repetir el ejercicio anterior, 
        utilizando un Array dinámico (ArrayList). 
        Para esto, leer 
        números escritos por el usuario hasta que escriba 0.*/
        ArrayList<Integer>numeros = new ArrayList<>();
        while(true){
            System.out.println("Ingrese un numero:");
            int numero = sc.nextInt();
            if(numero == 0){
              break;  
            }
            numeros.add(numero);
        }
         int suma = 0;
        double promedio;
        int positivos = 0;
        int negativos = 0;
        int numeroMayor = numeros.get(0);
        int numeroMenor = numeros.get(0);
        int posicionMayor = 0;
        int posicionMenor = 0;

        for (int i = 0; i < numeros.size(); i++) {
            suma += numeros.get(i);

            if (numeros.get(i)> 0) {
                positivos++;
            }
            if (numeros.get(i) < 0) {
                negativos++;
            }
            if (numeros.get(i) > numeroMayor) {
                numeroMayor = numeros.get(i);
                posicionMayor = i;
            }
            if (numeros.get(i) < numeroMenor) {
                numeroMenor = numeros.get(i);
                posicionMenor = i;//se guarda indice del array
           }
            
        }

        promedio = suma / (double) numeros.size();

        System.out.println("La suma es: " + suma);
        System.out.println("El promedio es: " + promedio);
        System.out.println("La cantidad de numeros positivos es: " + positivos);
        System.out.println("La cantidad de numeros negativos es: " + negativos);
        System.out.println("El numero mayor es: " + numeroMayor);
        System.out.println("El numero menor es: " + numeroMenor);
        System.out.println("La posicion del numero mayor es: " + posicionMayor);
        System.out.println("La posicion del numero menor es: " + posicionMenor);
        sc.close();
    

    }
}
