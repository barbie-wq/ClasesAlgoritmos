package semana1;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 Scanner sc = new Scanner(System.in);

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
	                resultado = a + b;
	                System.out.println("Resultado: " + resultado);
	                break;

	            case 2:
	                resultado = a - b;
	                System.out.println("Resultado: " + resultado);
	                break;

	            case 3:
	                resultado = a * b;
	                System.out.println("Resultado: " + resultado);
	                break;

	            case 4:
	                resultado = a / b;
	                System.out.println("Resultado: " + resultado);
	                break;

	            default://	SI NINGUNA DE LAS OPCIONES ANTERIORES COINCIDE HACE ESTP
	                System.out.println("Opción inválida");
	        }
			sc.close();
	}

}
