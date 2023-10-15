package HomeWork4;

import java.util.ArrayList;
import java.util.Collection;


public class Box<T extends Fruit> {

    private ArrayList<T> fruits;

    public Box(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    public ArrayList<T> getFruits() {
        return fruits;
    }

    public float getWeight() {
        return fruits.get(0).getWeight() * fruits.size();
    }

    public void addAll(Collection<? extends T> c) {
        fruits.addAll(c);
    }

    public void clear() {
        fruits.clear();
    }

    public boolean compare(Box<?> fruitBox) {
        return this.getWeight() == fruitBox.getWeight();
    }
}

