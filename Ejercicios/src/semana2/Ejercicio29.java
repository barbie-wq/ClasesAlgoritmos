package semana2;

import java.util.Scanner;

public class Ejercicio29 {
 /*Leer un número entero mayor que 0. 
 -Calcular la suma de todos sus dígitos. Por ejemplo, 
 -el número 370 corresponderá al valor 10 (3+7+0). 
 -Si el parámetro leído no es un número 
 -entero mayor que cero 
 -mostrar un mensaje por consola y volver a pedir otro número. 
 -Permitir al usuario seguir calculando la suma de dígitos hasta que decida salir del 
 programa. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Ingrese un numero:");
            int numero = sc.nextInt();
        
            if (numero > 0){
                int suma = 0;
                int temp = numero;

                while(temp > 0){
                    suma = suma + (temp % 10);//Se va dividiendo de 10 hasta que quede un digito
                    temp = temp / 10;
                }
                System.out.println("La suma de los digitos es:" + suma);

                System.out.print("Desea continuar p/s:");
                char respuesta = sc.next().toUpperCase().charAt(0);

                if(respuesta == 'S'){ //Si su respuesta es salir se termina el programa
                    break;
                }
            } else {
                System.out.println("No es un numero mayor que 0");
            }
        }
        sc.close();
    }
}
