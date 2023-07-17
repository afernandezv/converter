package io.github.afernandezv.converter.enums;

import java.util.Arrays;
import java.util.List;

public enum TemperatureUnit {
    CELSIUS("Celsius", "C"),
    FAHRENHEIT("Fahrenheit", "F"),
    KELVIN("Kelvin", "K"),
    RANKINE("Rankine", "R");

    private String name;
    private String symbol;

    TemperatureUnit(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public static List<TemperatureUnit> getUnits(){
        return Arrays.asList(TemperatureUnit.values());
    }

    @Override
    public String toString() {
        return symbol;
    }
}

