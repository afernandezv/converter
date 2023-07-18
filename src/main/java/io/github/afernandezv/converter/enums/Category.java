package io.github.afernandezv.converter.enums;

public enum Category {
    CURRENCY("Divisas"),
    LENGTH("Longitud"),
    MASS("Masa"),
    TEMPERATURE("Temperatura");

    private final String description;

    Category(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
}
