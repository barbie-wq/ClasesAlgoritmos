package semana2;
import java.util.Scanner;
public class Ejercicio15 {
    /*15. Leer un texto y mostrar cuántos caracteres tiene.  */
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String texto = "hola Mundo";
       int cantidad =  texto.length();
        System.out.println("la cantidad que tiene es:" + cantidad);
        sc.close();

    }

}
