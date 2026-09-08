package semana3;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        /*5. Palíndromo. Leer una palabra 
        y determinar si es un palíndromo:  */
        System.out.println("Ingrese una palabra:");
        String palabra = sc.nextLine();

        Boolean esPolindromo = true;
        for(int i = 0; i < palabra.length(); i++){
            //toma la letra que esta en la posicion i del lado izquierdo 
            if(palabra.charAt(i) != palabra.charAt(palabra.length() - 1 - i)){//de esta parte toma la ultima del lado derecho
                esPolindromo = false; //el != compara si las dos letras son distintas
                break;
            }
        }
        if(esPolindromo){
            System.out.println("La palabra es palindromo");
        }else{
            System.out.println("La palabra no es palindromo");
        }
        sc.close();
    }
}
