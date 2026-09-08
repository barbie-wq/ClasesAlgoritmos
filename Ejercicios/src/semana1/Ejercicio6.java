package semana1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		//AQUI EL SYSTEM ES PARA QUE SE ESCRIBA EN LA PANTALLA
		System.out.println("Ingrese un numero");
		int número = sc.nextInt();
		//SE DIVIDE POR 2 POR Q ASI VEMOS SI ES PAR O IMPAR 
		if (número % 2 == 0 ) {
			System.out.println("El número es par");
		} else {
			System.out.println("El número es impar");
	} 
		sc.close();
		}	

	}
