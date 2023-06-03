package org.example;

public class Latte extends Beverages{
    double volumeMilk;
    public Latte(String beverageName, double beveragePrice, double beverageTemperature, double beverageVolume, double volumeMlk) {
        super(beverageName, beveragePrice, beverageTemperature, beverageVolume);
        this.volumeMilk = volumeMlk;
    }

    @Override
    public String toString() {
        return String.format("Beverage: %s, Volume of Milk: %f", super.toString(), volumeMilk);
    }
}
