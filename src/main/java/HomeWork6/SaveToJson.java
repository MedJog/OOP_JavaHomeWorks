package HomeWork6;

import java.io.FileWriter;
import java.io.IOException;

public class SaveToJson {

    private final Order order;

    public SaveToJson(Order order) {
        this.order = order;
    }

    public void saveToJson() {
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"Имя клиента\":\""+ order.getClientName() + "\",\n");
            writer.write("\"Наименование продукта\":\""+order.getProduct()+"\",\n");
            writer.write("\"Количество\":"+ order.getQnt()+",\n");
            writer.write("\"Цена\":"+ order.getPrice() + "\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
