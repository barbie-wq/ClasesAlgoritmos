package semana2;
import java.util.Scanner;
public class Ejercicio14 {
/*Teniendo en cuenta el ejercicio de mostrar un menú de opciones de la sección anterior, 
refactorizarlo de tal manera que después de elegir una opción y mostrar el resultado por 
consola, el usuario pueda seguir seleccionando opciones hasta que elija la opción de 
salir.  */
      public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        externo: while (true){
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");

            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt();
            
            System.out.print("Número 1: ");
            double num1 = sc.nextDouble();

            System.out.print("Número 2: ");
            double num2 = sc.nextDouble();
            
            switch (opcion) {
            case 1:
                System.out.println(num1 + num2);
                break;
    //BREAK SIGNIFICA YA ENCONTRE EL CASO QUE CORRESPONDIA, SALGO DEL SWICTH
            case 2:
                System.out.println(num1 - num2);
                break;

            case 3:
                System.out.println(num1 * num2);
                break;

            case 4:
                System.out.println(num1 / num2);
                break;

            case 5:
                System.out.println("¡Hasta luego!");
                break externo;

            default:
                System.out.println("Opción inválida");
            }
        }
        sc.close();
    }
}
