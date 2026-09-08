package Semana4;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int a = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int b = sc.nextInt();
        System.out.println("suma: " + sumar(a, b));
        System.out.println("restar: " + restar(a, b));
        System.out.println("multiplicar: " + multiplicar(a, b));
       sc.close(); 
    } 

    public static int sumar(int a, int b) {
        int resultado = a+b;
        
        return resultado;

    }
    public static int restar(int a, int b){
        int resultado2 = a-b;
        return resultado2;
    }
    public static int multiplicar(int a, int b){
        int resultado3 = a*b;
        return resultado3;
        
    }
    
}
