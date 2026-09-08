package semana2;

import java.util.Scanner;
import java.util.ArrayList;
public class Ejercicio23 {
    public static void main(String[] args) {
        /* 23. Crear una variable String llamada nombreAnimales, con el nombre de 5 animales. 
        a. Mostrar en la consola el nombre de cada uno de los animales 
        b. Transformar la variable nombreAnimales en un Array de Strings y mostrar por 
        consola 
        c. Crear un ArrayList con los elementos del String (nombreAnimales). Leer los 
        elementos uno a uno y mostrar por consola 
        d. ¿En qué casos se debería usar Array y en qué casos ArrayList? */
        Scanner sc = new Scanner(System.in);
        String nombreAnimales = "gato,perro,leon,jirafa,sapo";
        //EL SPLIT HACE QUE SE SEPARE CADA VEZ QUE HAYA UNA COMA,
        //LO CUAL HACE QUE VAYAN UNA DEBAJO DE LA OTRA
        //Arrays
        String [] animales = nombreAnimales.split(",");
        for(int i= 0; i < animales.length; i++){;
       System.out.println(animales[i]);
        }
        //ARRAYLIST
       ArrayList<String> animalesLista = new ArrayList<>();

        animalesLista.add("gato");
        animalesLista.add("perro");
        animalesLista.add("leon");
        animalesLista.add("jirafa");
        animalesLista.add("sapo");

        System.out.println(animalesLista);
        sc.close();
    }
}
