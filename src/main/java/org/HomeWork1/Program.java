package org.HomeWork1;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
    Product product = new Product();

        Product medicines1 = new Medicines("OOO ФАРМ+", "Нурофен", 200, "Таблетки", 400);
        System.out.println(medicines1.displayInfo());

        Product medicines2 = new Medicines("OOO ФАРМ+", "Парацетамол", 150, "Таблетки", 500);
        System.out.println(medicines2.displayInfo());

        Product medicines3 = new Medicines("OOO ФАРМ+", "Анальгин", 50, "Таблетки", 500);
        System.out.println(medicines3.displayInfo());

        Product externalMeans1 = new ExternalMeans("ООО Фарма", "Хлоргексидин", 100, "Раствор", 150, 0.5 );
        System.out.println(externalMeans1.displayInfo());

        Product externalMeans2 = new ExternalMeans("ООО Фарма", "Йодопирон", 300, "Раствор", 100, 1);
        System.out.println(externalMeans2.displayInfo());

        Product externalMeans3 = new ExternalMeans("СОЛОФАРМ", "Ангидак", 350, "Спрей", 30, 0.2);
        System.out.println(externalMeans3.displayInfo());

        ArrayList<Product> products = new ArrayList<>();
        products.add(medicines1);
        products.add(medicines2);
        products.add(medicines3);
        products.add(externalMeans1);
        products.add(externalMeans2);
        products.add(externalMeans3);

        VendingMachine vendingMachine = new VendingMachine(products);
        //Medicines medicines = vendingMachine.getMedicines("Парацетамол", 100);
        //Medicines medicines = vendingMachine.getMedicines("Парацетамол", 500);
        Medicines medicines = vendingMachine.getMedicines("Нурофен", 400);
        if (medicines == null){
            System.out.println("По Вашему запросу ничего не найдено.");
        }
        else {
            System.out.println("Вы купили:");
            System.out.println(medicines.displayInfo());
        }

        ExternalMeans externalMeans = vendingMachine.getExternalMeans("Ангидак", "Спрей", 30);
        //ExternalMeans externalMeans = vendingMachine.getExternalMeans("Хлоргексидин", "Раствор", 150);

        if (externalMeans == null){
            System.out.println("По Вашему запросу ничего не найдено.");
        }
        else {
            System.out.println("Вы купили:");
            System.out.println(externalMeans.displayInfo());
        }

    }
}