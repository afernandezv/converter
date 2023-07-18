package io.github.afernandezv.converter.enums;

import java.util.Arrays;
import java.util.List;

public enum LengthUnit {
    NANOMETROS("Nanómetros", "nm"),
    MICROMETROS("Micrómetros", "μm"),
    MILIMETROS("Milímetros", "mm"),
    CENTIMETROS("Centímetros", "cm"),
    METROS("Metros", "m"),
    KILOMETROS("Kilómetros", "km"),
    PULGADAS("Pulgadas", "in"),
    YARDAS("Yardas", "yd"),
    PIES("Pies", "ft"),
    MILLAS("Millas", "mi");

    private String name;
    private String symbol;

    LengthUnit(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public static <T> List<T> getUnits(){
        return (List<T>) Arrays.asList(LengthUnit.values());
    }

    @Override
    public String toString() {
        return name;
    }
}
