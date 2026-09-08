package semana2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		System.out.println("Ingrese el primer numero");
		int a = sc.nextInt();
		System.out.println("Ingrese el segundo numero");
		int b = sc.nextInt(); 
		System.out.println("Ingrese el tercero numero");
		int c = sc.nextInt();
		System.out.println(a + b * c);
		
		System.out.println((a + b) * c );
		System.out.println(a*b + c / a );
		
		sc.close();
	}

}
