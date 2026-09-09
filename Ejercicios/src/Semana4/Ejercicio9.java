package Semana4;

public class Ejercicio9 {
    public static void main(String[] args) {
        double promedio = calcularPromedio(6, 7, 10);
        System.out.println("El promedio es:" + promedio);
        
    }
    //a.  Crear una función que retorne el promedio de tres números enteros 
    public static double calcularPromedio(int a, int b, int c){
        int suma = a + b+ c ;
        return (double) suma/3;
        //b. Luego probar las siguientes dos alternativas 
        //return (double)(a + b + c) / 3; 
        //Aqui primero hace la suma que lo convierte a un double y luego hace la division
        //return (double)((a + b + c) / 3);
        //En este caso hace la suma y la division y luego lo convierte en double. osea si el resultado da como duble se corta ya que tiene como parametro entero
    }
    
}
