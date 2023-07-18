package io.github.afernandezv.converter.utils;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;
import io.github.afernandezv.converter.pojo.currencyconversion.CurrencyConversion;
import io.github.cdimascio.dotenv.Dotenv;
public class CurrencyConverter {

    public static double convertCurrency(double amount, String fromCurrency, String toCurrency){
        return getConversion(amount, fromCurrency, toCurrency);
    }

    private static double getConversion(double amount, String fromCurrency, String toCurrency){
        Dotenv dotenv = Dotenv.load();
        Gson gson = new Gson();
        CurrencyConversion currencyConversion;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(dotenv.get("API_NINJAS_ENDPOINT")+"?want="+toCurrency+"&have="+fromCurrency+"&amount="+amount))
                .header("X-Api-Key", dotenv.get("API_NINJAS_KEY"))
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();

        try {
            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            currencyConversion = gson.fromJson(response.body(), CurrencyConversion.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        return currencyConversion.getConversionAmount();
    }
}
