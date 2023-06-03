package org.example;

import java.util.ArrayList;
import java.util.List;

public class VendingCoffeeMachine {
    private List<Beverages> vending = new ArrayList<>();
    private double cash = 0;

    public VendingCoffeeMachine addBeverage(Beverages prod){
        vending.add(prod);
        return this;
    }

    public List<Beverages> getVending() {
        return vending;
    }
    public Beverages findProduct(String name){
        for (Beverages beverages: vending)
            if (name.equals(beverages.getBeverageName())) {
                return beverages;
            }
        return null;
    }

    public double getCash() {
        return cash;
    }

    public Beverages saleBeverage(String nameBeverage){
        Beverages found = findProduct(nameBeverage);
        if (found != null){
            cash = cash +found.getBeveragePrice();
            vending.remove(found);

        }
        return found;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
