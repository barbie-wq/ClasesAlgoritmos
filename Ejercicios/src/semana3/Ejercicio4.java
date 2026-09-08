package semana3;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* 4. Pedir al usuario una frase y luego una letra.
           Luego indicar:
           a. Si la frase contiene a esa letra.
           b. Posición de la primera aparición.
           c. Posición de la última aparición. */

        System.out.println("Ingrese una oracion: ");
        String oracion = sc.nextLine();

        System.out.println("Ingrese una letra: ");
        String letra = sc.nextLine();

        // Validar que se ingrese una sola letra
        if (letra.length() != 1) {
            System.out.println("Debe ingresar solo una letra.");
            sc.close();
            return;
        }

        char letraBuscada = letra.charAt(0); // Convertimos el String a char
        boolean contiene = false;
        int primeraPosicion = -1;
        int ultimaPosicion = -1; //por si la letra no existe 

        // Recorremos la frase caracter por caracter
        for (int i = 0; i < oracion.length(); i++) {
            char caracterActual = oracion.charAt(i);

            if (caracterActual == letraBuscada) {
                if (!contiene) { 
                    primeraPosicion = i;
                    contiene = true;
                }
                ultimaPosicion = i;
            }
        }

        if (contiene) {
            System.out.println("La frase contiene la letra: " + letra);
            System.out.println("Primera posicion: " + primeraPosicion);
            System.out.println("Ultima posicion: " + ultimaPosicion);
        } else {
            System.out.println("La frase NO contiene la letra: " + letra);
        }

        sc.close();
    }
}