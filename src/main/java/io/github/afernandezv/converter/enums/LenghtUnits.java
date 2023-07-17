package io.github.afernandezv.converter.enums;

import java.util.Arrays;
import java.util.List;

public enum LenghtUnits {
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

    LenghtUnits(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public static List<LenghtUnits> getUnits(){
        return Arrays.asList(LenghtUnits.values());
    }

    @Override
    public String toString() {
        return symbol;
    }
}
