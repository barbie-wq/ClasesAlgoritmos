package semana1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		 Scanner sc = new Scanner(System.in);

	        System.out.println("Ingrese su edad:");
	        int edad = sc.nextInt();

	        // a. Puede votar
	        if (edad >= 16) {
	            System.out.println("Puede votar");
	        } else {
	            System.out.println("No puede votar");
	        }

	        // b. Mayor de edad
	        if (edad >= 18) {
	            System.out.println("Es mayor de edad");
	        } else {
	            System.out.println("No es mayor de edad");
	        }
			sc.close();
	}

}
