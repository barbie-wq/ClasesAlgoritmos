package semana2;

import java.util.Scanner;
/*10. Leer números hasta que el usuario ingrese 0. Luego mostrar: 
a. Suma total 
b. Cantidad de números ingresados.  */
public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese número (0 para terminar): ");
        int i = sc.nextInt();
        
        int suma = 0;
        int cantidad = 0;
        
        while (i != 0) {
            suma += i;
            cantidad++;
            
            System.out.print("Ingrese número (0 para terminar): ");
            i = sc.nextInt(); // Leemos el siguiente número antes de volver a evaluar
        }
        
        System.out.println("Suma Total: " + suma);
        System.out.println("Cantidad ingresada: " + cantidad);
        
        sc.close();
    }
}
