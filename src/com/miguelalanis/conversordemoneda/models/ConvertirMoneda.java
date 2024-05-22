package com.miguelalanis.conversordemoneda.models;

public class ConvertirMoneda {
    private final TasaDeCambioRepositorio repositorio;

    public ConvertirMoneda(TasaDeCambioRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public double convertir(String baseCode, String targetCode, double cantidad) {
        Moneda moneda = repositorio.obtenerTasaDeCambio(baseCode);
        Double tasa = moneda.conversion_rates().get(targetCode);
        if (tasa == null) {
            throw new IllegalArgumentException("Tasa de cambio no encontrada para " + targetCode);
        }
        return cantidad * tasa;
    }
}
