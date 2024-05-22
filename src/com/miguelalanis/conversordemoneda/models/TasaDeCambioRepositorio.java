package com.miguelalanis.conversordemoneda.models;

public interface TasaDeCambioRepositorio {
    Moneda obtenerTasaDeCambio(String baseCode);
}