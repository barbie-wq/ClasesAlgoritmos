package semana1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Inserte el primer número");
		int a = sc.nextInt(); 
		System.out.println("Inserte el segundo número");
		int b = sc.nextInt(); 
//----------------------SUMA-------------------------------------------------------------------------------------------------
		int suma = a + b ;
		System.out.println("a) El resultado es: " + suma);
//----------------------RESTA------------------------------------------------------------------------------------------------
		int resta = a - b; 
		System.out.println("b) El resultado es:" + resta);
//----------------------MULTIPLICACION---------------------------------------------------------------------------------------
		int multiplicación = a * b;
		System.out.println("c) El resultado es:" + multiplicación);

		sc.close();
	}

}
