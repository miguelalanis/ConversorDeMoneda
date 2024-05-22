package com.miguelalanis.conversordemoneda.controllers;

import com.miguelalanis.conversordemoneda.models.ConvertirMoneda;
import com.miguelalanis.conversordemoneda.models.ArchivoUtilidad;

public class ConversorControlador {
    private ConvertirMoneda convertirMoneda;

    // Constructor
    public ConversorControlador(ConvertirMoneda convertirMoneda) {
        this.convertirMoneda = convertirMoneda;
    }

    // Método para convertir y guardar el resultado
    public void convertirYGuardar(String baseCode, String targetCode, double cantidad) {
        try {
            double resultado = convertirMoneda.convertir(baseCode, targetCode, cantidad);
            System.out.printf("Resultado: %.2f %s -> %.2f %s%n", cantidad, baseCode, resultado, targetCode);
            ArchivoUtilidad.guardarConversion(baseCode, targetCode, cantidad, resultado);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
