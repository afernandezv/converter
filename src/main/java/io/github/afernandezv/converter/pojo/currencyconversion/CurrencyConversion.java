package io.github.afernandezv.converter.pojo.currencyconversion;

import com.google.gson.annotations.*;

public class CurrencyConversion {
    @SerializedName("old_amount")
    private double amount;

    @SerializedName("old_currency")
    private String fromCurrency;

    @SerializedName("new_currency")
    private String toCurrency;

    @SerializedName("new_amount")
    private double conversionAmount;

    public double getAmount() {
        return amount;
    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public double getConversionAmount() {
        return conversionAmount;
    }
}
