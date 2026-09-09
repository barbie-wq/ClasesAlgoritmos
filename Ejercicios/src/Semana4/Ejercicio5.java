package Semana4;

public class Ejercicio5 {

    public static int calcularSuma(int[] numeros) {
        int suma = 0;

        for (int numero : numeros) {
            suma += numero;
        }

        return suma;
    }

    public static double calcularPromedio(int[] numeros) {
        return (double) calcularSuma(numeros) / numeros.length;
    }

    public static int obtenerMayor(int[] numeros) {
        int mayor = numeros[0];

        for (int numero : numeros) {
            if (numero > mayor) {
                mayor = numero;
            }
        }

        return mayor;
    }

    public static int obtenerMenor(int[] numeros) {
        int menor = numeros[0];

        for (int numero : numeros) {
            if (numero < menor) {
                menor = numero;
            }
        }

        return menor;
    }

    public static int contarPositivos(int[] numeros) {
        int contador = 0;

        for (int numero : numeros) {
            if (numero > 0) {
                contador++;
            }
        }

        return contador;
    }

    public static int contarNegativos(int[] numeros) {
        int contador = 0;

        for (int numero : numeros) {
            if (numero < 0) {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("La suma es: " + calcularSuma(numeros));
        System.out.println("El promedio es: " + calcularPromedio(numeros));
        System.out.println("El número mayor es: " + obtenerMayor(numeros));
        System.out.println("El número menor es: " + obtenerMenor(numeros));
        System.out.println("Cantidad de positivos: " + contarPositivos(numeros));
        System.out.println("Cantidad de negativos: " + contarNegativos(numeros));
    }
    
}
