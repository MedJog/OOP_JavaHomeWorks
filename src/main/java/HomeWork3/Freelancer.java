package HomeWork3;

import java.util.Random;


/**
 * TODO: Разработать тип Freelancer самостоятельно в рамках выполнения
 *  домашней работы
 * Фрилансер (работник с почасовой оплатой)
 */
public class Freelancer extends Employee{
    public Freelancer(String surName, String name, int age, double salary) {
        super(surName, name, age, salary);
    }
    static Random random = new Random();
    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("Фрилансер: %s %s, Возраст: %d, Среднемесячная заработная плата (расчитанная): %.2f (руб.)",
                surName, name, age, calculateSalary());
    }

}
