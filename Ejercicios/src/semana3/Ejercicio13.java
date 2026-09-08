package semana3;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*13. Crear un array con varias palabras (no solicitar del usuario para crear el array). Luego 
        solicitar una palabra al usuario e indicar  */
        String [] palabras = {"Gato","Perro","Caballo","Tortuga","Serpiente","gato","tortuga"};
        System.out.println("Ingrese una palabra: ");
        String palabraIngresada = sc.nextLine();
        //a. Si la palabra está en el array.  
        int contador = 0;
        //Guarda varias posiciones juntas como texto
        String posiciones = " "; // el numero que sale es un int pero al poner " " lo convierte en texto
        for(int i = 0; i<palabras.length; i++){
            if(palabraIngresada.equalsIgnoreCase(palabras[i])){
              contador ++;
              posiciones = posiciones + i + " ";//I es la posicion actual del array y cuando se encuentra una coincidencia se agrega esa posicion a posiciones
            }
        }
        //b. Cuantas veces aparece.  
        if(contador > 0){
            System.out.println("La palabra si esta dentro del array: ");
            System.out.println("La palabra aparece " + contador + " vez/veces.");
            System.out.println("Aparece en las posiciones: " + posiciones);
        } else {
            System.out.println("La palabra no esta dentro del array");
        }
        //c. En que posiciones aparece. 
        sc.close();
    }
}
