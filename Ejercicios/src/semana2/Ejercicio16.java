package semana2;
import java.util.Scanner;
public class Ejercicio16 {
    /* 16. Leer una palabra y mostrar: 
a. Primera letra 
b. Última letra */
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String palabra = "hola";
        char primera = palabra.charAt(0);
        char ultima  = palabra.charAt(palabra.length()-1);
        System.out.println("primera letra: "+ primera);
        System.out.println("ultima letra: " + ultima);
        sc.close();
    }
}
