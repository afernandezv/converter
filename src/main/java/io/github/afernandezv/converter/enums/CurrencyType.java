package io.github.afernandezv.converter.enums;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public enum CurrencyType {
    USD("Dólar Estadounidense", "USD"),
    EUR("Euro", "EUR"),
    GBP("Libra Esterlina", "GBP"),
    MXN("Peso Mexicano", "MXN"),
    KRW("Won Surcoreano", "KRW"),
    JPY("Yen Japonés", "YEN");

    private String type;
    private String symbol;

    CurrencyType(String type, String symbol) {
        this.type = type;
        this.symbol = symbol;
    }

    public String getType() {
        return type;
    }

    public String getSymbol() {
        return symbol;
    }

    public static List<CurrencyType> getTypes(){
        return Arrays.asList(CurrencyType.values());
    }

    @Override
    public String toString() {
        return type;
    }
}
