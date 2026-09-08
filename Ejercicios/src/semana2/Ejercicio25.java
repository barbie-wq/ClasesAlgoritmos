package semana2;

import java.util.Scanner;

public class Ejercicio25 {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        /* 25. (Adaptación del problema de la lista de ejercicios de la anterior semana) Se necesita un 
        programa para mostrar el tipo de un triángulo a partir de la longitud de sus tres lados. El 
        usuario deberá poder repetir la consulta las veces que necesite presionando Enter luego 
        de un resultado, o bien, terminar el programa escribiendo cualquier texto para salir. Leer 
        la longitud de los 3 lados de un triángulo. A partir dichos lados y de la siguiente 
        información, mostrar qué tipo de triángulo es: 
        a. Escaleno: todos los lados distintos 
        b. Equilátero: todo los lados iguales 
        c. Isósceles: solo 2 lados iguales */
        while(true){  
            double lado1, lado2, lado3;

	        System.out.print("Ingrese el primer lado: ");
	        lado1 = sc.nextDouble();

	        System.out.print("Ingrese el segundo lado: ");
	        lado2 = sc.nextDouble();

	        System.out.print("Ingrese el tercer lado: ");
	        lado3 = sc.nextDouble();
            
	        if (lado1 == lado2 && lado2 == lado3) {
	            System.out.println("El triángulo es equilátero");
	        } 
	        else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
	            System.out.println("El triángulo es escaleno");
	        } 
	        else {
	            System.out.println("El triángulo es isósceles");
	        }
            sc.nextLine();
            System.out.println("Presione enter para repetir o escriba algo para salir");
            String respuesta = sc.nextLine();
            //isEmpty se usa para comprobar si una cadena de texto esta vacia 
            //otra forma es if (respuesta.length() > 0) { } break;

            if(!respuesta.isEmpty()){
                break;
            }
        }
        sc.close();
    }
}
