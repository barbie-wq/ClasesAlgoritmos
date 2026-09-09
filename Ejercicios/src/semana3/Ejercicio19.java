package semana3;
import java.util.HashMap;
import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {
        /*19. Crear un HashMap que permita almacenar nombre → edad. Cargar algunos nombres y 
        edades y luego solicitar un nombre para consultar su edad.  */
        Scanner sc = new Scanner(System.in);
        HashMap <String,Integer> datosMapa = new HashMap<>();
        //Cargar nombres y edades
        datosMapa.put("Barbi",20);
        datosMapa.put("Caleb",10);
        datosMapa.put("Ian",19);
        datosMapa.put("Bianca", 13);
        System.out.println("Ingrese un nombre:");
        String nombre = sc.nextLine();
        //Si quiero q me devuelva algo
        Integer edad = datosMapa.get(nombre);
        if(edad != null){
            System.out.println("La edad de " + nombre + " es: " + edad);
        }else{
            System.out.println("Ese nombre no esta registrado");
        }
        sc.close();
    }
}
