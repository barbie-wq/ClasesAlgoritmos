package semana2;

import java.util.Scanner;

public class Ejercicio27 {
    /*Leer tres calificaciones de un estudiante y una letra. Si la letra es A, se deberá calcular y 
    mostrar la media aritmética de las calificaciones del estudiante, si es P, se deberá 
    calcular y mostrar el promedio ponderado, con pesos 5, 3 y 2. Permitir al usuario seguir 
    calculando promedios hasta que decida salir del programa. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Ingrese la primera calificacion: ");
            double calificacion1 = sc.nextDouble();
            System.out.print("Ingrese la segunda calificacion: ");
            double calificacion2 = sc.nextDouble();
            System.out.print("Ingrese la tercera calificacion: ");
            double calificacion3 = sc.nextDouble();
            System.out.print("Ingrese A de media aritmetica o P de ponderacion: ");
           //EL TOUPPERCASE ES PARA QUE ACEPTA MAYUSCULAS COMO MINUSCULAS
            char letra = sc.next().toUpperCase().charAt(0);
            double promedio; 
            if(letra == 'A'){
                promedio = (calificacion1 +calificacion2+ calificacion3)/3;
                System.out.println("La media aritmetica es:" + promedio);
            } else if (letra == 'P') {
                promedio = (calificacion1 * 5 +calificacion2 *3 + calificacion3 *2)/10;
                System.out.println("La ponderacion es: "+ promedio);
            } else {
                System.out.println("Letra invalida");
            }
            System.out.print("Desea continuar c/s:");
            //                  para que se lea, convierte en mayus o minis las letras c y s
            char continuar = sc.next().toUpperCase().charAt(0);//CHART OBTIENE LA PRIMERA LETRA 
            if(continuar =='S'){
                break;
            }
        }
        sc.close();
    }
}
