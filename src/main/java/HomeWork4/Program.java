package HomeWork4;
import java.util.ArrayList;
import java.util.Random;
/*
   a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
   b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
   поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
   c. Для хранения фруктов внутри коробки можно использовать ArrayList;
   d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
   вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
   e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
   подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
   Можно сравнивать коробки с яблоками и апельсинами;
   f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
   Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
   Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
   g. Не забываем про метод добавления фрукта в коробку.*/
public class Program {
    static Random random = new Random();
    static Apple apple = new Apple();
    static Orange orange = new Orange();


    //Создание коробки с  фруктами
    static ArrayList<Fruit> addFruits(int countOfFruits) {
        //int countOfFruits = random.nextInt(0, 16); // кол-во фруктов в коробке
        ArrayList<Fruit> fruits = new ArrayList<>();
        int casus = random.nextInt(0, 2);  // случайный выбор фрукта
        for (int i = 0; i < countOfFruits; i++) {
            if (casus == 0) {       // заполняем коробку яблоками
                fruits.add(apple);
            }
            if (casus == 1) {          // заполняем коробку апельсинами
                fruits.add(orange);
            }
        }
        return fruits;
    }

    static float getWeightBox(Box<Fruit> fruitBox) {
        float weightOfBox = 0;
        if (fruitBox.getFruits().isEmpty()){
            System.out.println("Эта коробка пустая. Вес коробки: " + weightOfBox + ".");
            return weightOfBox;
        }
        else {
            weightOfBox = fruitBox.getWeight();
            System.out.println("Вес коробки: " + weightOfBox + ".");
            return weightOfBox;
        }
    }

    static void interlardFruits(Box<Fruit> fruitBox1, Box<Fruit> fruitBox2) {
        if (fruitBox1.getFruits().isEmpty()){
            System.out.println(fruitBox1.getFruits().size() + " " + fruitBox2.getFruits().size());
            fruitBox1.addAll(fruitBox2.getFruits());
            fruitBox2.clear();
            System.out.println("Одна из этих коробок пуста. Фрукты пересыпаны в пустую коробку.");
            System.out.println(fruitBox1.getFruits().size() + " " + fruitBox2.getFruits().size());
            System.out.println();

        }
        else if (fruitBox2.getFruits().isEmpty()){
            System.out.println(fruitBox1.getFruits().size() + " " + fruitBox2.getFruits().size());
            fruitBox2.addAll(fruitBox1.getFruits());
            fruitBox1.clear();
            System.out.println("Одна из этих коробок пуста. Фрукты пересыпаны в пустую коробку.");
            System.out.println(fruitBox1.getFruits().size() + " " + fruitBox2.getFruits().size());
            System.out.println();
        }
        else if (fruitBox1.getFruits().get(0) instanceof Apple && fruitBox2.getFruits().get(0) instanceof Apple ||
                fruitBox1.getFruits().get(0) instanceof Orange && fruitBox2.getFruits().get(0) instanceof Orange) {
            System.out.println(fruitBox1.getFruits().size() + " " + fruitBox2.getFruits().size());
            fruitBox1.addAll(fruitBox2.getFruits());
            fruitBox2.clear();
            System.out.println("Фрукты пересыпаны в одну коробку.");
            System.out.println(fruitBox1.getFruits().size() + " " + fruitBox2.getFruits().size());
            System.out.println();

        } else {
            System.out.println(fruitBox1.getFruits().size() + " " + fruitBox2.getFruits().size());
            System.out.println("Эти фрукты нельзя пересыпать в одну коробку.");
            System.out.println(fruitBox1.getFruits().size() + " " + fruitBox2.getFruits().size());
            System.out.println();
        }
    }

    public static  void toCompare(Box<Fruit> fruitBox01, Box<Fruit> fruitBox02) {
        if (fruitBox01.getFruits().isEmpty() || fruitBox02.getFruits().isEmpty()){
            System.out.println("Одна из коробок пустая.");
        }
        else if (fruitBox01.getWeight() == fruitBox02.getWeight()){
            System.out.println("Вес коробок одинаковый.");;
        }
        else if (fruitBox01.getWeight() != fruitBox02.getWeight())
            System.out.println("Вес коробок разный.");;
    }


    public static void main(String[] args) {

        Box<Fruit> fruitBox1 = new Box<>(addFruits(6));
        Box<Fruit> fruitBox2 = new Box<>(addFruits(6));
        Box<Fruit> fruitBox3 = new Box<>(addFruits(4));
        Box<Fruit> fruitBox4 = new Box<>(addFruits(3));
        Box<Fruit> fruitBox5 = new Box<>(addFruits(0));
        System.out.println(fruitBox1.getFruits());
        System.out.println(fruitBox2.getFruits());
        System.out.println(fruitBox3.getFruits());
        System.out.println(fruitBox4.getFruits());
        System.out.println(fruitBox5.getFruits());
        System.out.println();
        getWeightBox(fruitBox1);
        getWeightBox(fruitBox2);
        getWeightBox(fruitBox3);
        getWeightBox(fruitBox4);
        getWeightBox(fruitBox5);
        System.out.println();
        toCompare(fruitBox4, fruitBox2);
        toCompare(fruitBox1, fruitBox4);
        toCompare(fruitBox2, fruitBox3);
        toCompare(fruitBox3, fruitBox1);
        System.out.println();
        System.out.println(fruitBox4.compare(fruitBox2));
        System.out.println(fruitBox1.compare(fruitBox4));
        System.out.println(fruitBox2.compare(fruitBox3));
        System.out.println(fruitBox3.compare(fruitBox1));
        System.out.println();
        interlardFruits(fruitBox1, fruitBox2);
        interlardFruits(fruitBox2, fruitBox3);
        interlardFruits(fruitBox4, fruitBox2);
        interlardFruits(fruitBox5, fruitBox1);

    }

}
