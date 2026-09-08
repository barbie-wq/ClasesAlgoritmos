package semana2;

import java.util.Scanner;

public class Ejercicio18 {
    /* 18. Leer una frase y contar cuántas vocales tiene. */
     public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba una frase: ");
        String frase = sc.nextLine();

        int contadorVocales = 0; 
        for(int i = 0; i < frase.length();i++){
            if(frase.charAt(i) == 'a' || 
                frase.charAt(i)== 'e' ||
                frase.charAt(i)=='i'  ||
                frase.charAt(i)=='o'  ||
                frase.charAt(i) =='u'){
                    contadorVocales ++;
            }
        }
        System.out.println("La cantidad de vocales es:" + contadorVocales);
        sc.close();
     }
}
