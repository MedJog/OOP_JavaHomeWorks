package HomeWork6;

public class Program {
    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */
    public static void main(String[] args) {



        System.out.println("Пожалуйста, введите данные Вашего заказа:");

        ConsoleInput order1 = new ConsoleInput();

        Order order = new Order(order1.getClientName(), order1.getProduct(), order1.getQnt(), order1.getPrice());

        SaveToJson saveToJson = new SaveToJson(order);

        saveToJson.saveToJson();
    }
}
