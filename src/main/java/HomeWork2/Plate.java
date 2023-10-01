package HomeWork2;

public class Plate {
    protected int food;
    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public int setFood(int food) {
        this.food = food;
        return food;
    }

    public void info() {
        System.out.println("Количество еды в миске: " + food);
    }
    public int addFood(int leftoverFood) {
        this.food = food + 50;
        return food;
    }

}

