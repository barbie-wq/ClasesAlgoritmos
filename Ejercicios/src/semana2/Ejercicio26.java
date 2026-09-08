package semana2;
import java.util.Scanner;
public class Ejercicio26 {
    /*26. Leer un número entre 1 y 1000. Luego, convertirlo en número romano y mostrar el 
    resultado por pantalla. Para esto, tener en cuenta cómo los números enteros de la lista 
    N coinciden con los números romanos de la lista R:  */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros  = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String [] romanos = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        System.out.println("Ingrese un numero entre 1 y 1000");
        int  numero = sc.nextInt();
        String resultado = "";
        //SE USA PARA RECORRER LA ARRAY DE NUMEROS
        //INT I = 0 SE REFIERE A POSICIONES
        for(int i = 0; i < numeros.length; i++){
            //
            while(numero >= numeros[i]){
                numero = numero - numeros[i];
                resultado  = resultado + romanos [i] ; 

            }
        }
        System.out.println("Numero Romano: " + resultado);
        sc.close();
    }
}

