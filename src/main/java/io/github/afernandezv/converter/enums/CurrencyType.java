package io.github.afernandezv.converter.enums;

import java.util.Arrays;
import java.util.List;

public enum CurrencyType {
    USD("Dólar Estadounidense"),
    EUR("Euro"),
    GBP("Libra Esterlina"),
    MXN("Peso Mexicano"),
    KRW("Won Surcoreano"),
    JPY("Yen Japonés");

    private final String name;

    CurrencyType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static <T> List<T> getTypes(){
        return (List<T>) Arrays.asList(CurrencyType.values());
    }

    @Override
    public String toString() {
        return name;
    }
}
