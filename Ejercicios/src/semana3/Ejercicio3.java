package semana3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*3. Contar cada vocal. 
        Modificar el ejercicio anterior para mostrar cuántas veces aparece 
        cada vocal.  */
        System.out.println("Ingrese una oracion:");
        String oracion = sc.nextLine().toLowerCase();

        int a = 0, e = 0, i = 0, o = 0, u = 0;

        for (int j = 0; j < oracion.length(); j++) {
            char letra = oracion.charAt(j);//para guardar cada caracter

            switch (letra) {
                case 'a': //si la letra es esta vocal, sumo al contador
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
            }
        }

        System.out.println("Cantidad de a: " + a);
        System.out.println("Cantidad de e: " + e);
        System.out.println("Cantidad de i: " + i);
        System.out.println("Cantidad de o: " + o);
        System.out.println("Cantidad de u: " + u);

        sc.close();
    }
}