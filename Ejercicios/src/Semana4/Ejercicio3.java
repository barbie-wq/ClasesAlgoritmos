package Semana4;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* a. Tomar el ejercicio 15 de la Lista Nº1, correspondiente al menú de operaciones.
		   Refactorizarlo de manera que cada operación sea realizada mediante una función: */
		/* b. El main deberá encargarse principalmente de la interacción con el usuario y
		   de decidir qué operación realizar. */
		double a, b;
		int opcion;
		double resultado;

		System.out.print("Ingrese el primer número: ");
		a = sc.nextDouble();

		System.out.print("Ingrese el segundo número: ");
		b = sc.nextDouble();

		System.out.println("Elija una operación:");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicación");
		System.out.println("4. División");

		opcion = sc.nextInt();
		switch (opcion) {
			case 1:
				resultado = calcularSuma(a, b);
				break;
			case 2:
				resultado = calcularResta(a, b);
				break;
			case 3:
				resultado = calcularMultiplicacion(a, b);
				break;
			case 4:
				resultado = calcularDivision(a, b);
				break;
			default: // Si ninguna de las opciones anteriores coincide.
				System.out.println("Opción inválida");
				return;
		}
        System.out.println("Resultado" + resultado);
        
	}

	public static double calcularSuma(double a, double b) {
		return a + b;
	}

	public static double calcularResta(double a, double b) {
		return a - b;
	}

	public static double calcularMultiplicacion(double a, double b) {
		return a * b;
	}

	public static double calcularDivision(double a, double b) {
		return a / b;
	}
    
}
       
