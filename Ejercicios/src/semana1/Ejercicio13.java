package semana1;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

        int ganados, empatados, perdidos;
        int puntos;

        System.out.print("Ingrese partidos ganados: ");
        ganados = sc.nextInt();

        System.out.print("Ingrese partidos empatados: ");
        empatados = sc.nextInt();

        System.out.print("Ingrese partidos perdidos: ");
        perdidos = sc.nextInt();

        puntos = ganados * 3 + empatados * 1 + perdidos * 0;

        System.out.println("El equipo obtuvo " + puntos + " puntos.");

        sc.close();
	}

}
