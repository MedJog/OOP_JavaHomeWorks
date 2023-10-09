package HomeWork3;

    /**
     * Работник (базовый класс)
     */
    public abstract class Employee implements Comparable<Employee> {
        /**
         * Имя
         */
        protected String name;

        /**
         * Фамилия
         */
        protected String surName;

        /**
         * Возраст
         */
        protected int age;

        public int getAge() {
            return age;
        }

        /**
         * Ставка заработной платы
         */
        protected double salary;

        public Employee(String surName, String name, int age, double salary) {
            this.name = name;
            this.surName = surName;
            this.age = age;
            this.salary = salary;
        }

        /**
         * Расчет среднемесячной заработной платы
         * @return
         */
        public abstract double calculateSalary();

        @Override
        public int compareTo(Employee o) {
            int surNameRes = surName.compareTo(o.surName);
            if (surNameRes == 0){
                return name.compareTo(o.name);
            }
            return surNameRes;
        }
    }



