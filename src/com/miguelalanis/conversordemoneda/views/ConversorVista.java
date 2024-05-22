package com.miguelalanis.conversordemoneda.views;

import com.miguelalanis.conversordemoneda.controllers.ConversorControlador;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConversorVista {
    private ConversorControlador controlador;
    private Scanner teclado;

    // Constructor
    public ConversorVista(ConversorControlador controlador) {
        this.controlador = controlador;
        this.teclado = new Scanner(System.in);
    }

    // Método para mostrar el menú de opciones y manejar las selecciones del usuario
    public void mostrarMenu() {
        while (true) {
            System.out.println("Convertidor de moneda. Teclea una opción:");
            System.out.println("1. Convertir de USD a MXN");
            System.out.println("2. Convertir de MXN a USD");
            System.out.println("3. Convertir de USD a EUR");
            System.out.println("4. Convertir de EUR a USD");
            System.out.println("5. Convertir de EUR a MXN");
            System.out.println("6. Convertir de MXN a EUR");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                System.out.print("Seleccione una opción: ");
                int opcion = teclado.nextInt();

                if (opcion == 7) {
                    System.out.println("Saliendo...");
                    break;
                }

                manejarOpcion(opcion);
            } catch (InputMismatchException e) {
                System.out.println("\u001B[33m\u26A0 Opcion inválida: Debe ingresar un número entero. Escribe solo un número del 1 al 7.\u001B[0m");
                teclado.next(); // Limpiar el buffer del scanner
            }
        }
    }

    // Método para manejar la selección de opción del usuario
    private void manejarOpcion(int opcion) {
        String monedaOrigen = "";
        String monedaDestino = "";

        switch (opcion) {
            case 1:
                monedaOrigen = "USD";
                monedaDestino = "MXN";
                break;
            case 2:
                monedaOrigen = "MXN";
                monedaDestino = "USD";
                break;
            case 3:
                monedaOrigen = "USD";
                monedaDestino = "EUR";
                break;
            case 4:
                monedaOrigen = "EUR";
                monedaDestino = "USD";
                break;
            case 5:
                monedaOrigen = "EUR";
                monedaDestino = "MXN";
                break;
            case 6:
                monedaOrigen = "MXN";
                monedaDestino = "EUR";
                break;
            default:
                System.out.println("Opción no válida. Intenta de nuevo.");
                return;
        }

        System.out.print("Ingrese la cantidad a convertir: ");
        double cantidad = teclado.nextDouble();
        controlador.convertirYGuardar(monedaOrigen, monedaDestino, cantidad);
    }
}
