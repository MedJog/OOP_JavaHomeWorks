package HomeWork6;

import java.util.Scanner;

public class ConsoleInput {
    private String clientName = prompt("Введите имя клиента:  ");
    private String product = prompt("Введите наименование продукта:  ");
    private int qnt = Integer.parseInt(prompt("Количество: "));
    private double price = Double.parseDouble(prompt("Цена: "));

    public ConsoleInput() {
    }

    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public double getPrice() {
        return price;
    }
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}

