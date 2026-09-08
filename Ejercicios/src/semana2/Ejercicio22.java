package semana2;

import java.util.Scanner;

public class Ejercicio22 {
    /*22. Crear un array de Strings. 
        a. Inicializar cada elemento a partir de palabras escritas por el usuario 
        b. Mostrar la lista de palabras en el array 
        c. Crear un array de enteros a partir del array de Strings, donde cada elemento del 
        array de enteros corresponde al número de caracteres de cada elemento en el 
        array de Strings.  */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuántas palabras vas a ingresar?");
        int n = sc.nextInt();
        sc.nextLine();

        // Crear el array de Strings
        String[] palabras = new String[n];

        // a. Inicializar cada elemento con palabras del usuario
        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Ingrese una palabra:");
            palabras[i] = sc.nextLine();
        }

        // b. Mostrar la lista de palabras
        System.out.println("Palabras ingresadas:");

        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }

        // c. Crear el array de enteros
        int[] caracteres = new int[n];
            //mientras i sea menor que palabras se suma 1 
        for (int i = 0; i < palabras.length; i++) {
            caracteres[i] = palabras[i].length();
        }

        // Mostrar cantidad de caracteres
        System.out.println("Cantidad de caracteres de cada palabra:");

        for (int i = 0; i < caracteres.length; i++) {
            System.out.println(caracteres[i]);
        }
      sc.close();
    }
}
