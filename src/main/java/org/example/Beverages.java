package org.example;

public class Beverages {
    private String beverageName;
    private double beveragePrice;
    private double beverageTemperature;
    private double beverageVolume;

    public Beverages(String beverageName, double beveragePrice, double beverageTemperature, double beverageVolume) {
        this.beverageName = beverageName;
        this.beveragePrice = beveragePrice;
        this.beverageTemperature = beverageTemperature;
        this.beverageVolume = beverageVolume;
    }

    @Override
    public String toString() {
        return String.format("Beverage: %s, Price: %f, Temperature: %f, Volume: %f", beverageName, beveragePrice,
                beverageTemperature, beverageVolume);
    }

    public String getBeverageName() {
        return beverageName;
    }

    public double getBeveragePrice() {
        return beveragePrice;
    }

    public double getBeverageTemperature() {
        return beverageTemperature;
    }

    public double getBeverageVolume() {
        return beverageVolume;
    }
}
