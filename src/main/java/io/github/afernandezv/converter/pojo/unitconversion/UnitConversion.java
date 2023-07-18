package io.github.afernandezv.converter.pojo.unitconversion;

public class UnitConversion {
    private String measure;
    private Unit from;
    private Unit to;
    private double value;
    private String result;

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public Unit getFrom() {
        return from;
    }

    public void setFrom(Unit from) {
        this.from = from;
    }

    public Unit getTo() {
        return to;
    }

    public void setTo(Unit to) {
        this.to = to;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "UnitConversion{" +
                "measure='" + measure + '\'' +
                ", from=" + from +
                ", to=" + to +
                ", value=" + value +
                ", result='" + result + '\'' +
                '}';
    }
}
