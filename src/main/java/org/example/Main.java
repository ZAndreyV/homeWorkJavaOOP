package org.example;


public class Main {
    public static void main(String[] args) {
        VendingCoffeeMachine apparat = new VendingCoffeeMachine();
        apparat.addBeverage(new Cappuccino("Cappuccino", 80, 88, 250, 50))
                .addBeverage(new Latte("Latte",100, 75, 240, 85))
                .addBeverage(new Beverages("Coffee", 50, 95, 200))
                .addBeverage(new Cappuccino("Cappuccino", 801, 88, 250, 50));


        System.out.println(apparat.getCash());
        for (Beverages beverages : apparat.getVending()){
            System.out.println(beverages);
        }
        Beverages beverages = apparat.findProduct("Cpuccino");
        System.out.println(beverages);
        System.out.println("+++++++++++++++");
        Beverages saledProduct = apparat.saleBeverage("Cappuccino");
       Beverages saledProduct1 = apparat.saleBeverage("Latte");
        System.out.println(apparat.getCash());
        for (Beverages beverages1 : apparat.getVending()){
            System.out.println(beverages1);
        }
    }
}