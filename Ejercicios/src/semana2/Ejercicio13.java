package semana2;
import java.util.Scanner;
public class Ejercicio13 {
    /*13. Leer números hasta encontrar un número negativo. */
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numeros:");
        int numeros = sc.nextInt(); 
        //AQUI HICIMOS QUE EL WHILE SE EJECUTE  CUANDO NUMEROS SEA MAYOR QUE 0 DE LO CONTRARIO
        //SI INGRESAMOS UN NUMERO NEGATIVO SE PARA
        while(numeros >= 0 ){
            numeros = sc.nextInt(); 
            
        }
        sc.close();
    }
}
