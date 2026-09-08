package semana1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 System.out.println("Ingrese el primer número:");
	        int a = sc.nextInt();

	        System.out.println("Ingrese el segundo número:");
	        int b = sc.nextInt();

	        if (a > b) {
	            System.out.println("El mayor es: " + a);
	        } else if (b > a) {
	            System.out.println("El mayor es: " + b);
	        } else {
	            System.out.println("Los números son iguales");
	        }
	
			sc.close();
	}

}
