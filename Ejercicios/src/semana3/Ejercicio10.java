package semana3;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*10. Leer un array: 
        a. Mostrar sus elementos en orden inverso.  */
        int [] numeros = {1 ,2 ,3 ,4 ,5 };
        int [] invertido ={5,4,3,2,1};
        System.out.print(" original: ");
        for(int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i]);
        }

        //for(int i = numeros.length -1;i >=0 ; i--){
          System.out.println();
        //}
        System.out.print(" invertido: "); 
        for(int i = 0; i < invertido.length; i++){
            System.out.print(invertido[i]);
        }
       sc.close();
    
    }
}
