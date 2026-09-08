package TP;

import java.util.Scanner;

public class trinidad_Barbara_cajero_ATM {

    public static void main(String[] args) {
		//Se crea Scanner para leer los datos del usuario
        Scanner sc = new Scanner(System.in);
		//Arrays con informacion del usuario
        String[] usuario = {"Pamela Contreras", "Ian Bertellotti", "Lea Aranda", "Caleb Trinidad", "Naruto Trinidad"};
        int[] numeroCuenta = {1001, 2002, 3003, 4004, 5005};
        int[] clave = {1000, 2000, 3000, 4000, 5000};
        double[] saldo = {4000, 5000, 6000, 7000, 8000};
		//El -1 indica que todavia no hay un usuario logueado
        int usuarioActual = -1;

        System.out.println("======== BIENVENIDO AL CAJERO AUTOMATICO TP1 ========");
		//Se usa para repetir el login hasta que el usuario ingrese una cuenta y clave correctas
        boolean ejecutar = true;

        while (ejecutar) {
            System.out.println("Ingrese el numero de cuenta:");
            int cuentaIngresada = sc.nextInt();
			//Esta varible guarda la posicion del array numeroCuenta
            int posicion = -1;//indica que la cuenta no fue encontrada
			//Se recorre el array para buscar la cuenta que se ingreso
            for (int i = 0; i < numeroCuenta.length; i++) {
                if (numeroCuenta[i] == cuentaIngresada) {
                    posicion = i;//se guarda posicion
                    break;//se sale del ciclo por que ya encontramos la cuenta
                }
            }
			//Aca se verifica en caso de que se ingrese mal el numero de cuenta diga que es una cuenta inexistente y que vuelva a pedirla
            if (posicion == -1) {
                System.out.println("Cuenta inexistente.");
                continue;
            }
			//Variable que se define con una cantidad de 3 intentos
            int intentos = 3;
			//Es para que si se ingresa la cuenta con intentos mayor que 0 se pueda ejecutar
			//Osea si el primer while se ejecuta y tiene intentos este se ejecuta
            while (intentos > 0 && ejecutar) {
                System.out.println("Ingrese su clave:");
                int claveIngresada = sc.nextInt();
				//Si la clave coincide se acepta el ingreso
                if (clave[posicion] == claveIngresada) {
                    usuarioActual = posicion;// guardamos el usuario ingresado
                    ejecutar = false;//cerramos el ciclo de login
                    System.out.println("clave correcta");
                    System.out.println("Bienvenido/a: " + usuario[posicion]);
                    break;
                } else {
					intentos--;//si la clave es incorrecta se resta un intento

                    if (intentos > 0) {
                        System.out.println("clave incorrecta quedan " + intentos + " intentos");
                    } else {
                        System.out.println("Ha superado el máximo de intentos.");
                        System.out.println("Acceso bloqueado.");
                        ejecutar = false; //termina el programa
                    }
                }
            }
        }
		//si no se encuentra al usuario se termina el programa
        if (usuarioActual == -1) {
            sc.close();
            return;
        }
		//Menu principal del cajero
        while (true) {
            System.out.println("\n==== MENU =====");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Transferir a otra cuenta");
            System.out.println("5. Salir");
            System.out.println("Seleccione una opción:");

            int opcion = sc.nextInt();
			//segun la opcion que elija se ejecuta lo que debe hacer
            switch (opcion) {
                case 1:
					//Se muestra el saldo que tiene el usuario
                    System.out.println("Saldo disponible: $" + saldo[usuarioActual]);
                    break;

                case 2:
					//Se deposita el dinero
                    System.out.println("Cuánto quiere depositar:");
                    double deposito = sc.nextDouble();

                    if (deposito > 0) {//Deposito tiene que ser mayor que 0
                        saldo[usuarioActual] += deposito;//se le suma al dinero que tenia en su cuenta
                        System.out.println("Saldo actual: $" + saldo[usuarioActual]);
                    } else {
                        System.out.println("El deposito tiene que ser mayor a cero");
                    }
                    break;

                case 3:
                    System.out.println("Cuánto quiere retirar:");
                    double retiro = sc.nextDouble();

                    if (retiro <= 0) { 
                        System.out.println("El monto debe ser mayor que 0");
                    } else if (retiro > 2000) {
                        System.out.println("El retiro no puede ser mayor a 2000");
                    } else if (retiro > saldo[usuarioActual]) {
                        System.out.println("Saldo insuficiente");
                    } else { //se le resta la cantidad que quiere retirar
                        saldo[usuarioActual] = saldo[usuarioActual] - retiro;
                        System.out.println("Saldo retirado correctamente");
                        System.out.println("Saldo actual $" + saldo[usuarioActual]);
                    }
                    break;

                case 4:// Trensferencia entre cuentas
                    System.out.println("A que cuenta quiere transferir:");
                    int cuentaTransferida = sc.nextInt();

                    int cuentaDestino = -1;
					//Buscamos la cuenta destino
                    for (int i = 0; i < numeroCuenta.length; i++) {
                        if (numeroCuenta[i] == cuentaTransferida) {
                            cuentaDestino = i;
                            break;
                        }
                    }

                    if (cuentaDestino == -1) {
                        System.out.println("Cuenta Inexistente");
                    } else if (cuentaDestino == usuarioActual) {
                        System.out.println("No se puede transferir a su propia cuenta");
                    } else {
                        System.out.println("Cuanto quiere transferir:");
                        double transferencia = sc.nextDouble();

                        if (transferencia <= 0) {
                            System.out.println("El monto tiene que ser mayor a 0");
                        } else if (transferencia > saldo[usuarioActual]) {
                            System.out.println("Saldo Insuficiente");
                        } else {
                            saldo[usuarioActual] = saldo[usuarioActual] - transferencia;
                            saldo[cuentaDestino] = saldo[cuentaDestino] + transferencia;

                            System.out.println("Transferencia realizada correctamente");
                            System.out.println("Saldo actual $" + saldo[usuarioActual]);
                        }
                    }
                    break;

                case 5://Para salir del programa
                    System.out.println("Gracias por utilizar el cajero.");
                    sc.close();
                    return;
					//Por si la opcion no esta en el menu
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}