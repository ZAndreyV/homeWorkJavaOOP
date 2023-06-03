package org.example;

public class Cappuccino extends Beverages{
    private double volumeMilk;
    public Cappuccino(String beverageName, double beveragePrice, double beverageTemperature, double beverageVolume, double volumeMilk) {
        super(beverageName, beveragePrice, beverageTemperature, beverageVolume);
        this.volumeMilk = volumeMilk;
    }

    @Override
    public String toString() {
        return String.format("Beverage: %s, Volume of Milk: %f", super.toString(), volumeMilk);
    }
}
