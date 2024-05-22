package com.miguelalanis.conversordemoneda.models;

import com.google.gson.Gson;
import io.github.cdimascio.dotenv.Dotenv;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiCambioServicio implements TasaDeCambioRepositorio {
    @Override
    public Moneda obtenerTasaDeCambio(String baseCode) {
        Dotenv dotenv = Dotenv.load();
        String API_KEY = dotenv.get("API_KEY");
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/" + baseCode);

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(direccion)
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No se encontró la moneda: " + baseCode, e);
        }
    }
}
