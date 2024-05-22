package com.miguelalanis.conversordemoneda.models;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ArchivoUtilidad {

    private static final String RUTA_ARCHIVO = "src/com/miguelalanis/conversordemoneda/UltimasConversiones.txt";
private static final DateTimeFormatter FORMATO_DE_FECHA = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    public static void guardarConversion(String monedaOrigen, String monedaDestino, double cantidad, double resultado) {
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        String fechaHoraFormateada = fechaHoraActual.format(FORMATO_DE_FECHA);
        String conversion = String.format("[%s] %.2f %s -> %.2f %s%n", fechaHoraFormateada, cantidad, monedaOrigen, resultado, monedaDestino);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(RUTA_ARCHIVO, true))) {
            writer.write(conversion);
        } catch (IOException e) {
            System.err.println("Error al guardar la conversión: " + e.getMessage());
        }
    }
}

