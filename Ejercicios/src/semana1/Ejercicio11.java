package semana1;

import java.util.Scanner;

class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la calificación:");
        double nota = sc.nextDouble();

        if (nota < 6) {
            System.out.println("Desaprobado");
        } else if (nota < 8) {
            System.out.println("Aprobado");
        } else if (nota < 10) {
            System.out.println("Bueno");
        } else if (nota == 10) {
            System.out.println("Excelente");
      }
      sc.close();
	}

}
