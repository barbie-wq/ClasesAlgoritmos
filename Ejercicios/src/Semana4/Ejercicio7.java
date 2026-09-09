package Semana4;

public class Ejercicio7 {
    /*7. Función de búsqueda: 
    a. Crear una función que indique si un determinado carácter aparece dentro del 
    texto:  */
    public static void main(String[] args) {
        String texto = "Algoritmos";
        if(contiene(texto, 't')){
            System.out.println("El caracter esta dentro de texto");
        } else {
            System.out.println("El caracter no esta dentro de texto");
        }
        System.out.println("Primera posicion es:" + primeraPosicion(texto, 't'));
    }
    public static boolean contiene(String texto, char caracter){
        for(int i=0; i < texto.length(); i++){
            if(texto.charAt(i)==caracter){
                return true;
            }
        }
        return false;
    }
        //b. Luego crear otra función llamada primeraPosición que retorne la posición de la 
        //primera aparición del caracter: 
        public static int primeraPosicion(String texto, char caracter){
        for (int i = 0; i < texto.length(); i++) { 
            if (texto.charAt(i) == caracter) {
                return i;
            }

        }
        return -1;
    }
}
