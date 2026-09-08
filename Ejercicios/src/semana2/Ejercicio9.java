package semana2;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("¿Cuántos números vas a ingresar?: ");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("Debe ingresar una cantidad mayor a 0.");
        } else {
            double suma = 0;
            
            for (int i = 1; i <= n; i++) {
                System.out.print("Ingrese el número " + i + ": ");
                double numero = sc.nextDouble();
                suma += numero;
            }
            
            double promedio = suma / n;
            System.out.println("El promedio es: " + promedio);
        }
        
        sc.close();
    }
}
