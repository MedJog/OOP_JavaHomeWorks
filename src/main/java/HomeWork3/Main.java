package HomeWork3;

import java.util.Arrays;
import java.util.Random;

public class Main {

        static Random random = new Random();

        static Worker generateWorker() {
            String[] names = new String[]{"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
            String[] surnames = new String[]{"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};

            int age = random.nextInt(18, 65);
            int salary = random.nextInt(50000, 100000);
            Worker worker = new Worker(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], age, salary);
            return worker;
        }

        static Freelancer generateFreelancer() {
            String[] names = new String[]{"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
            String[] surnames = new String[]{"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};

            int age = random.nextInt(18, 65);
            /* примерное кол-во рабочих дней в месяце - 20,8
             * 550,55 рублей за час работы
             * numberOfHours среднее количество часов работы в день */
            int numberOfHours = random.nextInt(1, 9);
            double salary = 20.8 * numberOfHours * 550.55;
            Freelancer freelancer = new Freelancer(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)],
                    age, salary);
            return freelancer;
        }

        /**
         * TODO: Переработать метод generateEmployees. Метод должен возвращать массив сотрудников
         *  разных типов (Worker, Freelancer), метод должен быть ОДИН!
         *
         * @param count
         * @return
         */

        static Employee[] generateEmployees(int count) {
            Employee[] employees = new Employee[count];
            for (int i = 0; i < employees.length; i++) {
                int casus = random.nextInt(0, 2);
                if (casus == 0) {
                    employees[i] = generateWorker();
                }
                if (casus == 1){
                    employees[i] = generateFreelancer();
                }
            }
            return employees;
        }

        public static void main (String[]  args){

            Employee[] employees = generateEmployees(10);
            System.out.println("Список всех сотрудников:");
            for (Employee employee : employees) {
                System.out.println(employee);
            }
            System.out.println();
            System.out.println("Сортировка по возрастанию заработной платы:");

            Arrays.sort(employees, new SalaryComparator(SortType.Ascending));

            for (Employee employee : employees) {
                System.out.println(employee);
            }

            System.out.println();
            System.out.println("Сортировка по убыванию заработной платы:");


            Arrays.sort(employees, new SalaryComparator(SortType.Descending));

            for (Employee employee: employees) {
                System.out.println(employee);
            }
            System.out.println();
            System.out.println("Сортировка по увеличению возраста:");


            Arrays.sort(employees, new AgeComparator(SortType.Ascending));

            for (Employee employee : employees) {
                System.out.println(employee);
            }

            System.out.println();
            System.out.println("Сортировка по уменьшению возраста:");

            Arrays.sort(employees, new AgeComparator(SortType.Descending));

            for (Employee employee: employees) {
                System.out.println(employee);
            }
        }
    }

