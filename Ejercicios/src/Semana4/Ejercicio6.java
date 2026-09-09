package Semana4;

import java.util.Scanner;

public class Ejercicio6 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*b. Desde main, solicitar un texto al usuario y utilizar las funciones correspondientes  */
        System.out.println("Ingrese una palabra:");
        String palabra = sc.nextLine();
        
        System.out.println("Cantidad de vocales: " + contarVocales(palabra));

        if (esPalindromo(palabra)) {
            System.out.println("Es palíndromo.");
        } else {
            System.out.println("No es palíndromo.");
        }

        sc.close();
    }
    public static int contarVocales(String texto){
        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            char letra = Character.toLowerCase(texto.charAt(i));

            if (letra == 'a' || letra == 'e' || letra == 'i'
                    || letra == 'o' || letra == 'u') {
                contador++;
            }
        }

        return contador;

    }
    public static boolean esPalindromo(String texto){
       
        for(int i = 0; i < texto.length(); i++){
            //toma la letra que esta en la posicion i del lado izquierdo 
            if(texto.charAt(i) != texto.charAt(texto.length() - 1 - i)){//de esta parte toma la ultima del lado derecho
                return false; //el != compara si las dos letras son distintas
                
            }
        }
        return true;
    }
}
