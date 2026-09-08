package semana1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("El número es positivo");
        } else if (numero < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
	
	
	
	}
    sc.close();
  }
}
