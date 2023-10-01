package HomeWork2;

public class Cat implements CatEats{
    private String name;
    private int appetite;
    private boolean satiety; //сытость кота: false -  кот голоден, true - кот сыт.
    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean getSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }
    public String displayInfo() {
        return String.format("Имя - %s. Аппетит - %d. Сытость - %s.", name, appetite, satiety);
    }

    @Override
    public boolean eat(int food) {
        if (appetite <= food) {
            satiety = true;
            System.out.println("Кот-" + name + " поел.");
            System.out.println(displayInfo());
            return true;
        }
        else{
            satiety = false;
            System.out.println("Кот-" + name + " остался голодным.");
            System.out.println(displayInfo());
            return false;

        }
    }
}
