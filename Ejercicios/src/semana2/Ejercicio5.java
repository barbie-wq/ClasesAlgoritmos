package semana2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese el primer número: ");
		int num1 = sc.nextInt();

		System.out.print("Ingrese el segundo número: ");
		int num2 = sc.nextInt();

		System.out.print("Ingrese el operador (+, -, *, /):"	+ " ");
		//USAMOS STRING PARA GUARDAR TEXTO
		String operador = sc.next();
		//SI eligió +
	   // sumo

	    //SINO SI eligió -
	        //resto

	  //  SINO SI eligió *
	    //    multiplico

	   // SINO SI eligió /
	     //   divido

	   // SINO
	     //Y   operador inválido
		if (operador.equals("+")) {
		    System.out.println("1. El resultado es:" + (num1 + num2));
		// SE PUEDE USAR MAS ELSE IF 
		    // EL EQUALS ? EL OPERADOR ES IGAL A + Y ASI PENSAMOS CON TODOS 
		    //PONER NOMBRE QUE SE LE DIO AL TIPO DE VARIABLE + EL EQUALS 
		} else if (operador.equals("-")) {
		    System.out.println("2. El resultado es:" + (num1 - num2));
		} else if (operador.equals("*")) {
		    System.out.println("3. El resultado es:" + (num1 * num2));
		} else if (operador.equals("/")) {
		    System.out.println("4.El resultado es:" + (num1 / num2));
		} else {
		    System.out.println("Operador inválido");
		}
		sc.close();
	}

}
