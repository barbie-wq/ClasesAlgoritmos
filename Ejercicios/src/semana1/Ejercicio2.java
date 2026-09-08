package semana1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserte el primer número");
		int a = sc.nextInt(); 
		System.out.println("Inserte el segundo número");
		int b = sc.nextInt(); 
		System.out.println("Inserte el tercer número");
		int c = sc.nextInt();
//--------------------SUMA-----------------------------------------------------------------------------------------------------------------------------
		int suma= a + b + c ;
		System.out.println("a) El resultado es: " + suma);
//--------------------PRODUCTO-------------------------------------------------------------------------------------------------------------------------
		int producto = a*b*c;
		System.out.println("b) El resultado es: " + producto);
//--------------------RESTO----------------------------------------------------------------------------------------------------------------------------
		int resto = a/b;
		System.out.println("d) El resultado es: " + resto);
//--------------------POTENCIA-------------------------------------------------------------------------------------------------------------------------
		double Elevado = Math.pow(a,b);
		System.out.println("c) El resultado es: " + Elevado);
//--------------------HIPOTENUSA-----------------------------------------------------------------------------------------------------------------------
		double Hipotenusa = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		System.out.println("e) El resultado es: " + Hipotenusa);
	
	
	
		sc.close();
	
	}

}
