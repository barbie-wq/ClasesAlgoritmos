package semana3;
public class Ejercicio14 {
    public static void main(String[] args) {
       
        //14. Leer 5 palabras y mostrar: 
        String [] palabras = {"Barbi","Emmanuel","Narutos","Ian","Bianca"};
        int totalCaracteres = 0;
        // a. Cantidad total de caracteres. 
       for (int i = 0; i < palabras.length; i++) {
            totalCaracteres = totalCaracteres + palabras[i].length(); //lo cuenta por caracter de la palabra actual  
        }
        //c. Palabra más larga. 
        String palabrasLarga = palabras[0];
        for(int i = 1; i < palabras.length; i++){
            if(palabras[i].length() > palabrasLarga.length()){
                palabrasLarga = palabras[i];
            }
        }
        // d. Cantidad de palabras que comienzan con una vocal.  */
        int contadorVocales = 0;
        for(int i = 0; i < palabras.length; i++){
            // charAt(0) obtiene el primer carácter de la palabra actual.
            // toLowerCase convierte la letra a minúscula. 
            char primeraLetra = Character.toLowerCase(palabras[i].charAt(0));
            if(primeraLetra == 'a' || primeraLetra == 'e' ||
                primeraLetra == 'i'  || primeraLetra =='o'||
                primeraLetra == 'u'){
                contadorVocales ++;
            }
        }
        // b. Promedio de caracteres por palabra. 
        double promedio = (double)totalCaracteres/palabras.length;
        System.out.println("Cantidad de caracteres: " + totalCaracteres);
        System.out.println("El promedio por palabra es: " + promedio);
        System.out.println("La palabra mas larga es: " + palabrasLarga);
        System.out.println("Las palabras que comienzan con una vocal son: " + contadorVocales);

    }
}