package semana1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantos años: ");
		double tiempo = sc.nextDouble();
		System.out.println("Cuantos cigarrilos: ");
		int cigarrillos = sc.nextInt();
		double diasPerdidos = (((cigarrillos  * tiempo)* 10)/60)/24;
		System.out.println("A perdido " + diasPerdidos + " dias de vida");
		sc.close();
	}

}
