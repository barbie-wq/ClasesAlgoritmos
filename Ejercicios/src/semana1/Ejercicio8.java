package semana1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	Scanner sc = new Scanner(System.in);

	        System.out.println("Ingrese el primer número:");
	        int a = sc.nextInt();

	        System.out.println("Ingrese el segundo número:");
	        int b = sc.nextInt();

	        if ((a % 2 == 0) != (b % 2 == 0)) {//!= distinto de
	            System.out.println("true");
	        } else {
	            System.out.println("false");
	        }
			sc.close();
	}

}
