package semana2;

import java.util.Scanner;
/*12. Mayor número. Leer varios números hasta ingresar -1. Luego, mostrar el número mayor. 
Hacer una prueba de escritorio */
public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese numeros hasta (-1 para terminar): ");
		//ESTO INDICA QUE EL PRIMER NUMERO QUE INGRESES VA A SER EL MAYOR YA QUE ES SOLO UNO 
		int numero = sc.nextInt(); 
		//POR ESO EL PRIMER NUMERO PASA A SER NUMERO MAYOR
		int numeroMayor = numero;
		//HACEMOS UN WHILE PARA QUE AGARRE EL NUMERO Y SI NO ES -1 VUELVE A INGRESAR OTRO NUMERO 
		while(numero != -1){
			numero = sc.nextInt();
			//POR ESO HACEMOS UN IF ADENTRO PARA QUE HAYA UNA COMPARACION Y QUE EL NUEVO NUMERO SI ES MAYOR QUE EL
			//ANTERIOR PASE A SER ESE EL MAYOR
			if(numero > numeroMayor){
				numeroMayor = numero;
			}

		}
		System.out.println("Numero Mayor: " + numeroMayor);

		// use scanner as needed
		sc.close();
	}

}
