package io.github.afernandezv.converter.utils;

import com.google.gson.Gson;
import io.github.afernandezv.converter.pojo.unitconversion.UnitConversion;
import io.github.cdimascio.dotenv.Dotenv;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class UnitConverter {

    public static double convertUnit(String type, double value, String fromUnit, String toUnit) {
        return getConversion(type, value, fromUnit, toUnit);
    }

    private static double getConversion(String type, double value, String fromUnit, String toUnit) {
        Dotenv dotenv = Dotenv.load();
        Gson gson = new Gson();
        UnitConversion unitConversion;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://measurement-unit-converter.p.rapidapi.com/" + type + "?value=" + value + "&from=" + fromUnit + "&to=" + toUnit))
                .header("X-RapidAPI-Key", dotenv.get("RAPID_API_KEY"))
                .header("X-RapidAPI-Host", dotenv.get("RAPID_API_HOST"))
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();

        try {
            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            unitConversion = gson.fromJson(response.body(), UnitConversion.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException();
        }
        return unitConversion.getValue();
    }
}
