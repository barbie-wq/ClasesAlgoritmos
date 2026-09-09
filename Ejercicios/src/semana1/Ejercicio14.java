package semana1;

import java.util.Scanner;

public class Ejercicio14 {
    /*14. Calcular el KDA de un jugador: 
    a. Leer tres números enteros correspondientes a las bajas logradas, las bajas 
    recibidas y las asistencias. 
    b. Mostrar el “KDA” del jugador en base a lo siguiente: 
    i. Si el jugador no recibió ninguna baja, el KDA será el número de bajas 
    logradas más el número de asistencias. 
   ii. Caso contrario, el KDA será (el número de bajas logradas + número 
    de asistencias) / número de bajas recibidas. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int numero1 = sc.nextInt();
         System.out.println("Ingrese el segundo numero: ");
        int numero2 = sc.nextInt();
         System.out.println("Ingrese el tercer numero: ");
        int numero3 = sc.nextInt();

        int bajas = numero1;
        int recibidas = numero2;
        int asistencias = numero3;
        double kda;

        if(recibidas == 0 ){
           kda = (bajas + asistencias);
        }else{
            kda = (double)(bajas + asistencias) / recibidas;
        }
        System.out.println("el KDA es: " + kda);
        sc.close();
    }
}
