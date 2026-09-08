package semana3;

public class Ejercicio11 {
    public static void main(String[] args) {
        // Array original que vamos a analizar.
        int[] numeros = {4, 2, 7, 4, 8, 2, 4};

        // Cada posición comienza en false y pasa a true cuando ya fue analizada.
        boolean[] procesados = new boolean[numeros.length];

        // Recorre cada posición del array original.
        for (int i = 0; i < numeros.length; i++) {
            // Si este número ya fue contado, se salta para no mostrarlo otra vez.
            if (procesados[i]) {
                continue;
            }

            // Guarda cuántas veces aparece numeros[i].
            int contador = 0;

            // Compara el número actual con todos los números del array.
            for (int j = 0; j < numeros.length; j++) {
                // Si son iguales, encontramos otra aparición del número.
                if (numeros[i] == numeros[j]) {
                    contador++;
                    // Marca esta posición para no volver a procesarla después.
                    procesados[j] = true;
                }
            }

            // Solo muestra los números cuya cantidad es mayor que una.
            if (contador > 1) {
                System.out.println(numeros[i] + " aparece " + contador + " veces");
            }
        }

        // Cuenta cuántos valores diferentes habrá en el nuevo array.
        int cantidadSinRepetir = 0;

        // Recorre el array para contar solo la primera aparición de cada valor.
        for (int i = 0; i < numeros.length; i++) {
            // Indica si el valor actual ya apareció antes.
            boolean repetidoAntes = false;

            // Compara numeros[i] únicamente con las posiciones anteriores.
            for (int j = 0; j < i; j++) {
                // Si coincide con un valor anterior, es un duplicado.
                if (numeros[i] == numeros[j]) {
                    repetidoAntes = true;
                    // No hace falta seguir buscando este valor.
                    break;
                }
            }

            // Si no apareció antes, será un elemento del nuevo array.
            if (!repetidoAntes) {
                cantidadSinRepetir++;
            }
        }

        // Crea el nuevo array con el tamaño exacto que necesita.
        int[] sinRepetidos = new int[cantidadSinRepetir];

        // Indica en qué posición libre se guardará el próximo valor.
        int posicion = 0;

        // Recorre nuevamente el array original para copiar los valores únicos.
        for (int i = 0; i < numeros.length; i++) {
            // Supone inicialmente que el valor todavía no está repetido.
            boolean repetidoAntes = false;

            // Busca si el valor actual ya apareció en una posición anterior.
            for (int j = 0; j < i; j++) {
                // Si coincide con uno anterior, no se copia nuevamente.
                if (numeros[i] == numeros[j]) {
                    repetidoAntes = true;
                    break;
                }
            }

            // Copia el valor solo si es su primera aparición.
            if (!repetidoAntes) {
                sinRepetidos[posicion] = numeros[i];
                // Avanza a la siguiente posición del nuevo array.
                posicion++;
            }
        }

        // Muestra un texto sin salto de línea para imprimir los valores a continuación.
        System.out.print("Array sin repetidos: ");

        // Recorre el nuevo array y muestra cada elemento.
        for (int numero : sinRepetidos) {
            System.out.print(numero + " ");
        }
    }
}
