package HomeWork2;

public class Main {
    public static void main(String[] args) {

        Cat cats [] = {
                new Cat("Барсик", 5, false),
                new Cat("Васька", 15, false),
                new Cat("Рыжик", 40, false),
                new Cat("Персик", 20, false),
                new Cat("Кокос", 30, false),
                new Cat("Сеня", 10, false),
                new Cat("Тихон", 15, false),
                new Cat("Серый", 25, false)
        };

        Plate plate = new Plate(50);
        plate.info();

        int leftoverFood = plate.getFood(); // остаток еды в миске
        for (Cat cat : cats){
            if ( leftoverFood >= cat.getAppetite()){
                cat.eat(plate.getFood());
                leftoverFood = plate.setFood(plate.getFood() - cat.getAppetite());
                System.out.println("Остаток еды в миске: " + leftoverFood);
                System.out.println();
            }
            else if (leftoverFood < cat.getAppetite() && leftoverFood != 0){
                cat.eat(plate.getFood());
                System.out.println("Еды в миске мало для этого кота!");
                System.out.println("Остаток еды в миске: " + leftoverFood);
                System.out.println();
            }
            else  {
                System.out.println("Еда в миске кончилась! Пополните миску!");
                leftoverFood = plate.addFood(leftoverFood);
                System.out.println("Миска пополнена. Количество еды в миске: " + plate.getFood());
                System.out.println();

            }
        }
    }
}