package Semana4;

public class Ejercicio11 {
    public static void main(String[] args) {
        int resultado = factorial(5);
        System.out.println("El resultado es: " + resultado);
    }
    /*5 × factorial(4) 
    4 × factorial(3) 
    3 × factorial(2) 
    2 × factorial(1) 
    1  */
    public static int factorial(int n){
        if(n == 1){
            return 1;
        }else{
            return n* factorial(n-1);//sigue el ciclo 
        }
    } 
}
