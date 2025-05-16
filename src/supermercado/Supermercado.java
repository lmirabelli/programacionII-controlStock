/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package supermercado;

/**
 *
 * @author chuch
 */
import java.util.Scanner;

public class Supermercado {
    static final int PASILLOS = 2;
    static final int ESTANTES = 3;
    static final int POSICIONES = 4;

    static String[][][] deposito = new String[PASILLOS][ESTANTES][POSICIONES];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú del Sistema de Stock ---");
            System.out.println("1. Cargar producto");
            System.out.println("2. Consultar producto");
            System.out.println("3. Mostrar depósito");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    cargarProducto(scanner);
                    break;
                case 2:
                    consultarProducto(scanner);
                    break;
                case 3:
                    mostrarDeposito();
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);

        scanner.close();
    }

    public static void cargarProducto(Scanner scanner) {
        System.out.print("Ingrese pasillo (0-" + (PASILLOS - 1) + "): ");
        int p = scanner.nextInt();
        System.out.print("Ingrese estante (0-" + (ESTANTES - 1) + "): ");
        int e = scanner.nextInt();
        System.out.print("Ingrese posición (0-" + (POSICIONES - 1) + "): ");
        int pos = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        if (validarPosicion(p, e, pos)) {
            System.out.print("Ingrese nombre del producto: ");
            String producto = scanner.nextLine();
            deposito[p][e][pos] = producto;
            System.out.println("Producto cargado correctamente.");
        } else {
            System.out.println("Posición inválida.");
        }
    }

    public static void consultarProducto(Scanner scanner) {
        System.out.print("Ingrese pasillo: ");
        int p = scanner.nextInt();
        System.out.print("Ingrese estante: ");
        int e = scanner.nextInt();
        System.out.print("Ingrese posición: ");
        int pos = scanner.nextInt();

        if (validarPosicion(p, e, pos)) {
            String contenido = deposito[p][e][pos];
            if (contenido != null) {
                System.out.println("Producto encontrado: " + contenido);
            } else {
                System.out.println("La posición está vacía.");
            }
        } else {
            System.out.println("Posición inválida.");
        }
    }

    public static void mostrarDeposito() {
        for (int p = 0; p < PASILLOS; p++) {
            System.out.println("Pasillo " + p + ":");
            for (int e = 0; e < ESTANTES; e++) {
                System.out.print("  Estante " + e + ": ");
                for (int pos = 0; pos < POSICIONES; pos++) {
                    String contenido = (deposito[p][e][pos] != null) ? "[X]" : "[ ]";
                    System.out.print(contenido + " ");
                }
                System.out.println();
            }
        }
    }

    public static boolean validarPosicion(int p, int e, int pos) {
        return p >= 0 && p < PASILLOS && e >= 0 && e < ESTANTES && pos >= 0 && pos < POSICIONES;
    }
}
