package semana1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserte el primer número");
		int a = sc.nextInt(); 
		System.out.println("Inserte el segundo número");
		int b = sc.nextInt(); 
		double alturaMaxima = Math.sqrt(Math.pow(a, 2) - Math.pow(b, 2));

		System.out.println("La altura máxima del ropero es: " + alturaMaxima);	
		
		sc.close();
	}

}
