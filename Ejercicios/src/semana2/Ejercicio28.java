package semana2;

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*28. Leer un número entero positivo impar N. Calcular el factorial doble de ese número. El 
        factorial doble se define como el producto de todos los números naturales impares 
        desde 1 hasta algún número natural impar N. Por ejemplo, el doble factorial de 5 es: 5! = 
        1 * 3 * 5 = 15. Mostrar el resultado por consola. Permitir al usuario seguir calculando el 
        factorial doble hasta que decida salir del programa.  */
        System.out.println("Ingrese un numero");
        int n = sc.nextInt();
        //si n porcentaje 2 es impar se ejecuta 
        if(n % 2 ==1 ){
            int factorial = n;
            //AQUI FOR CUMPLE EL RECORRIDO SI i ES MENOR AL NUMERO QUE INGRESAMOS
            for(int i =1; i < n; i++){
                //Esto es si n-1 porcentaje 2 es igual a 1 
                if ((n-i) % 2 == 1 ) {
                    //Entonces factorial es igual a factorial que seria el numero que ingresamos, 
                    //por lo que se multiplica (el resultado del numero ingresado - i )
                    factorial = factorial * (n-i);
                    
                }

            } 
            System.out.println("Factorial: " + factorial);
        } else{
            System.out.println("No acepta numeros pares");
        }
        sc.close();
    }
}