package Semana4;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        /*13. Refactorizando un programa: 
        a. Tomar uno de los programas realizados anteriormente 
        —por ejemplo, el menú de peraciones, 
        el cálculo de KDA o el programa de estadísticas de un array— y 
        refactorizarlo aplicando: 
        i. funciones; 
        ii. parámetros; 
        iii. valores de retorno; 
        iv. variables locales; 
        v. responsabilidad única. 
        b. El objetivo no es modificar qué hace el programa, 
        sino cómo está organizado.  */
        Scanner sc = new Scanner(System.in);

        int bajas = solicitarNumeros(sc,"Ingrese las bajas: ");
        int recibidas = solicitarNumeros(sc, "Ingrese las recibidas: ");
        int asistencias = solicitarNumeros(sc, "Ingrese las asistencias: ");
        double kda = calcularKDA(bajas, recibidas, asistencias);

        if(recibidas == 0 ){
           kda = (bajas + asistencias);
        }else{
            kda = (double)(bajas + asistencias) / recibidas;
        }
        System.out.println("el KDA es: " + kda);
        sc.close();
    }
    public static int solicitarNumeros(Scanner sc, String mensaje){
        System.out.println(mensaje);
        return sc.nextInt();
    }
    public static double calcularKDA(int bajas, int recibidas, int asistencias){
        if(recibidas == 0 ){
           return bajas + asistencias;
        }
        return(double)(bajas + asistencias) / recibidas;
    }
}
