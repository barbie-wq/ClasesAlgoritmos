package semana3;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrada:");
        String texto = sc.nextLine();//Para que lea una oracion 
        String espacio = texto.replaceAll("[^ ]", "");//reemplaza todo excepto los espacios 
        int contar = texto.length(); //contar
        System.out.println("Cantidad de caracteres:" + contar);
        System.out.println("Cantidad de espacios:" + espacio.length());//para que cuente los caracteres
        
        sc.close();
    }
}
