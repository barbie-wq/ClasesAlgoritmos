package semana3;

import java.util.Scanner;

public class Ejercicio2 {
        /*2. Contar vocales.  
        Leer una frase y mostrar cuántas vocales contiene, considerando tanto 
        mayúsculas como minúsculas.  */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una oracion:");
        String oracion = sc.nextLine().toLowerCase();//convierte en minusculas 
        
        int contadorVocales = 0;
        for(int i=0; i < oracion.length(); i++){
            if(oracion.charAt(i)== 'a' ||oracion.charAt(i)== 'e'||oracion.charAt(i)== 'i'||oracion.charAt(i)== 'o'||oracion.charAt(i)== 'u'){

                contadorVocales++;
            
            }

        }   
        System.out.println("Cantidad de vocales:" + contadorVocales);     
        sc.close();   
    }
}
