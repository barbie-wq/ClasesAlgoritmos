package semana2;
import java.util.Scanner;

public class Ejercicio17 {
    /*17. Leer dos palabras y mostrar por consola si son iguales (true) o no (false).  */
     public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String palabra = "hola";
        String palabra2 = "Hola";
        if(palabra.equalsIgnoreCase(palabra2)){
            System.out.println("Las palabras son exactamente iguales");
        }

        sc.close();
     }
}
