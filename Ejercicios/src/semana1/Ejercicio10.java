package semana1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la edad de la primera persona:");
        int edad1 = sc.nextInt();

        System.out.println("Ingrese la edad de la segunda persona:");
        int edad2 = sc.nextInt();

        System.out.println("Ingrese la edad de la tercera persona:");
        int edad3 = sc.nextInt();

        // a. Al menos uno es mayor de edad
        if (edad1 >= 18 || edad2 >= 18 || edad3 >= 18) {
            System.out.println("Pueden viajar: true");
        } else {
            System.out.println("Pueden viajar: false");
        }

        // b. Todos son mayores de edad
        if (edad1 >= 18 && edad2 >= 18 && edad3 >= 18) {
            System.out.println("Todos pueden acceder al juego: true");
        } else {
            System.out.println("Todos pueden acceder al juego: false");
        }
        sc.close();
	}

}
