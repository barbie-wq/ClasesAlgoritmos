package semana3;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*20. Crear un HashMap de calificaciones de estudiantes (estudiante → calificación). Cargar 
        algunos estudiantes con su calificación y luego permitir consultar la calificación de uno 
        de ellos.  */
        HashMap <String,Integer> datosMapa = new HashMap<>();
        //Cargar nombres y notas
        datosMapa.put("Barbi",5);
        datosMapa.put("Caleb",8);
        datosMapa.put("Ian",10);
        datosMapa.put("Bianca", 9);

        System.out.println("Ingrese un nombre:");
        String nombre = sc.nextLine();
        Integer nota = null;

        for (String estudiante : datosMapa.keySet()) {
            if (estudiante.equalsIgnoreCase(nombre)) {//Para que ignore las mayusculas o minusculas
                nota = datosMapa.get(estudiante);
                break;
            }
        }
        if(nota != null){
            System.out.println("La nota de " + nombre + " es: " + nota);
        }else{
            System.out.println("Ese nombre no esta registrado");
        }
        sc.close();
    }
}
