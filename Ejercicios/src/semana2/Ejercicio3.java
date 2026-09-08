package semana2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el primer numero");
		int a = sc.nextInt();
		System.out.println("Ingrese el segundo numero");
		int b = sc.nextInt();
		//SE DEFINE COMO INT PARA QUE EL RESULTADO DE COMO ENTERO
		int resultado = a/b; 
		System.out.println("a. El resultado entero es:" + resultado);
		//SE DEFINE COMO DOUBLE PARA QUE PUEDA DAR DECIMAL
		double resultado2 = a/b;
		System.out.println("b. El resultado decimal es:" + resultado2);
		//EN ESTA PARTE ADENTRO DEL PARARENTECIS DEFINIS COMO QUERES QUE SEA TRATADO EN ESTE CASO
		// EL DOUBLE SERIA QUE EL RESULTADO ENTRE A/B SE MOSTRARA EN DECIMAL
		double resultado3 = (double) a/b;
		System.out.println("c. El resultado es:" + resultado3);
		sc.close();
	}

}
