package semana1;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
	        double lado1, lado2, lado3;

	        System.out.print("Ingrese el primer lado: ");
	        lado1 = sc.nextDouble();

	        System.out.print("Ingrese el segundo lado: ");
	        lado2 = sc.nextDouble();

	        System.out.print("Ingrese el tercer lado: ");
	        lado3 = sc.nextDouble();
			
	        if (lado1 == lado2 && lado2 == lado3) {
	            System.out.println("El triángulo es equilátero");
	        } 
	        else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
	            System.out.println("El triángulo es escaleno");
	        } 
	        else {
	            System.out.println("El triángulo es isósceles");
	        }
		
		sc.close();
	}

}
