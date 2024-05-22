package com.miguelalanis.conversordemoneda;

import com.miguelalanis.conversordemoneda.controllers.ConversorControlador;
import com.miguelalanis.conversordemoneda.models.ApiCambioServicio;
import com.miguelalanis.conversordemoneda.models.ConvertirMoneda;
import com.miguelalanis.conversordemoneda.views.ConversorVista;

public class Main {
    public static void main(String[] args) {
        // Configurar el servicio de API de cambio
        ApiCambioServicio apiServicio = new ApiCambioServicio();

        // Configurar el convertidor de moneda con el servicio de API
        ConvertirMoneda convertirMoneda = new ConvertirMoneda(apiServicio);

        // Configurar el controlador con el convertidor de moneda
        ConversorControlador controlador = new ConversorControlador(convertirMoneda);

        // Configurar la vista con el controlador
        ConversorVista vista = new ConversorVista(controlador);

        // Iniciar la aplicación mostrando el menú de conversión
        vista.mostrarMenu();
    }
}
