package semana3;

public class Ejercicio12 {
    /*Sección 3: Arrays y Strings  
    12. Solicitar al usuario 5 palabras y almacenarlas en un array. 
    a. Mostrar todas las palabras.  
    b. Mostrar la palabra más larga. 
    c. Mostrar la palabra más corta. 
    d. Indicar cuántas palabras tienen más de 5 caracteres. */
    public static void main(String[] args) {
        
    
        String[] palabras = {"Hoja", "Cepillo","Aguja", "holas","celulares"};
        for(int i =0; i < palabras.length; i++){
        System.out.print(palabras[i] + " "); 
        }
        String palabrasLarga = palabras[0];
        for(int i = 0 ; i < palabras.length; i++){
            if(palabras[i].length() > palabrasLarga.length()){
                palabrasLarga = palabras[i];
            }
        }
        String palabrasCorta = palabras[0];
        for(int i =0; i< palabras.length; i++){
            if(palabras[i].length() < palabrasCorta.length()){
                palabrasCorta = palabras[i];
            }
        }
            int contador = 0;
         for(int i =0; i < palabras.length; i++){
            if(palabras[i].length() > 5){
                contador++; 
            }
        }
        System.out.println();
        System.out.println("Palabra mas larga: " + palabrasLarga);
        System.out.println("Palabra mas corta: " + palabrasCorta);
        System.out.println("Palabras con mas de 5 caracteres: " + contador);
        
    }   
    
}
