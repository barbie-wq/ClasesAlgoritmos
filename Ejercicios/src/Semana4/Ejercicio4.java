package Semana4;

public class Ejercicio4 {
    // Método principal que prueba las funciones de cálculo
    public static void main(String[] args) {
        // Array de números enteros para calcular la suma
        int [] numerosIngresados = {1,2,4,5,6};
        calcularSuma(numerosIngresados);
        System.out.println("suma: " + calcularSuma(numerosIngresados));
        
        // Array de números decimales para calcular el promedio
        double [] numerosPromedio ={1,3,2,4,5};
        System.out.println("promedio: " + calcularPromedio(numerosPromedio));
    }
    
    // Función que calcula la suma de todos los elementos de un array de enteros
    public static int calcularSuma(int []numeros){
        // Inicializa la suma con el primer elemento del array
        int suma = numeros[0];
        
        // Itera desde el segundo elemento hasta el final del array
        for(int i= 1; i < numeros.length; i++){
            // Acumula la suma de todos los elementos
            suma = suma + numeros[i];
        }
        // Retorna el resultado de la suma
        return suma;
    }
    
    // Función que calcula el promedio de todos los elementos de un array de decimales
    public static double calcularPromedio(double[]numeros){
        // Inicializa la suma en cero
        double suma = 0;
    
        // Itera sobre todos los elementos del array
        for(int i =0; i < numeros.length; i++){
            // Acumula la suma de todos los elementos
            suma = suma + numeros[i];
        }
        // Retorna el promedio diviendo la suma por la cantidad de elementos
        return suma / numeros.length;
    }
}
