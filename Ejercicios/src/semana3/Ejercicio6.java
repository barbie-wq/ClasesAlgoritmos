package semana3;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Comparación de cadenas. 
        Leer dos palabras y determinar si son iguales o diferentes. 
        a. Primero, teniendo en cuenta mayúscula/minúsculas 
        b. Luego, que para determinar igualdad no importe la diferencia entre mayúscula y 
        minúscula  */
        System.out.println("Ingrese la primera palabra:");
        String palabraUno = sc.nextLine();
        System.out.println("Ingrese la segunda palabra:");
        String palabraDos = sc.nextLine();
        if(palabraUno.equalsIgnoreCase(palabraDos)){
            System.out.println("b.Las dos palabras son iguales sin importar mayusculas");
        }
        if (palabraUno.equals(palabraDos)){
            System.out.println("a.Las dos palabras son iguales considerando las mayusculas");
        } else{
            System.out.println("No son iguales");
        }


    
    
        sc.close();
    
    }
}
