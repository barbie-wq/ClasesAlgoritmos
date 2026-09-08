package semana3;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Sección 2: Arrays
        7. Leer 10 números y almacenarlos en un array. Mostrar:
        a. Suma.
        b. Promedio.
        c. Cantidad de números positivos.
        d. Cantidad de números negativos.
        e. Número mayor.
        f. Número menor.
        g. Posición donde aparece el número mayor.
        h. Posición donde aparece el número menor.
        */
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int suma = 0;
        double promedio;
        int positivos = 0;
        int negativos = 0;
        int numeroMayor = numeros[0];
        int numeroMenor = numeros[0];
        int posicionMayor = 0;
        int posicionMenor = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];

            if (numeros[i] > 0) {
                positivos++;
            }
            if (numeros[i] < 0) {
                negativos++;
            }
            if (numeros[i] > numeroMayor) {
                numeroMayor = numeros[i];
                posicionMayor = i;
            }
            if (numeros[i] < numeroMenor) {
                numeroMenor = numeros[i];
                posicionMenor = i;//se guarda indice del array
           }
            
        }

        promedio = suma / 10.0;

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
