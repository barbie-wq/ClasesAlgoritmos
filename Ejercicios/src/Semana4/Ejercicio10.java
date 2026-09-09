package Semana4;

public class Ejercicio10 {
    public static void main(String[] args) {
          double resultado = potencia(2, 3);
    System.out.println("El resultado es:" + resultado);
    }
   public static double potencia(double base, double exponente){
        return Math.pow(base, exponente);   
    }
}
