package io.github.afernandezv.converter.utils;

import com.google.gson.Gson;
import io.github.afernandezv.converter.pojo.currencyconversion.CurrencyConversion;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
public class CurrencyConverter {

    public static double convertCurrency(double amount, String fromCurrency, String toCurrency){
        return getConversion(amount, fromCurrency, toCurrency);
    }

    private static double getConversion(double amount, String fromCurrency, String toCurrency){
        Gson gson = new Gson();
        CurrencyConversion currencyConversion;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.api-ninjas.com/v1/convertcurrency?want="+toCurrency+"&have="+fromCurrency+"&amount="+amount))
                .header("X-Api-Key", "API_KEY")
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
