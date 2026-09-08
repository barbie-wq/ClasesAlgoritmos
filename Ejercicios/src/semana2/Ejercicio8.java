package semana2;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int suma= 0;
		for (int i = 1 ; i<=5; i++) {
			//ESTO HARA QUE ESA ORACION SE REPITA 5 VECES 
			System.out.println("Ingrese un numero");
			int num = sc.nextInt();
			//EN ESTA PARTE SE HACE LA SUMA DE ESO 5 NUMERO INGRESADOS
			 suma = suma + num;		 
		}
	 
		System.out.println("Suma total:" + suma);
		sc.close();
	}
}