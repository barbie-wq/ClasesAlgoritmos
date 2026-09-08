package semana2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		//1. PRIMERO RAZONA EL EJERCICIO IMAGINALO , LUEGO LO ESCRIBES 
		System.out.print("Ingrese un entero: ");
		// SE CREA LA VARIABLE, EL INT SOLO ACEPTA ENTEROS
		int entero = sc.nextInt();

		System.out.print("Ingrese un decimal: ");
		//UN DOUBLE SERIA QUE ACEPTA LOS NUMEROS DECIMALES
		double decimal = sc.nextDouble();

		double suma = entero + decimal;
		
		double division = entero / decimal;
		
		int resultadoEntero = (int) division; //(int) valor QUIERO QUE ESTE VALOR SEA TRATADO COMO ENTERO 
		// O QUIERO QUE ESTE VALOR SEA TRATADO COMO DECIMAL.

		System.out.println("Suma: " + suma);
		System.out.println("División: " + division);
		System.out.println("Resultado convertido a entero: " + resultadoEntero);

		sc.close();
	}


}
