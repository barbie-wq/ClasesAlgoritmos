package semana2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		System.out.println("Ingrese el primer numero");
		int numero = sc.nextInt();
		//AQUI SE PONE PARA COMPARAR DE QUE EL NUMERO ESTE ENTRE 10 Y 100
		//EN ESTE CASO >= SIGNIFICA QUE DEBE SER MAYOR QUE 10
		// Y <= ES QUE DEBE SER MENOR QUE 100 
		if (10 >= numero && numero <= 100) {
			System.out.println("Esta entre 10 y 100: " + numero);
		//ALGO PARA SABER ES QUE SOLO SE PUEDE PONER UN ELSE POR IF	
		} else {
			System.out.println("No esta entre 10 y 100: " + numero);
			//ESTRUCTURA DEL IF 
			// IF(CONDICIONAL1){
			//}ELSE IF(CONDICIONAL2){
			//}ELSE { }
		} 
		sc.close();	
	}

}
