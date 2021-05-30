package HomeWork05;

public class personal {//1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
        private String fullName;
        private String position;
        private String email;
        private String phone;
        private int salary;
        private int age;

        public personal(String fullName, String position, String email, String phone, int salary, int age){
            //2. Конструктор класса должен заполнять эти поля при создании объекта.
            this.fullName = "\u001B[36m" + fullName + "\u001B[0m";
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age =  age;
        }

        public void printPersonalCard() { //3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
            System.out.printf(
                    " ФИО:         %s \n" +
                            " Должность:   %s \n" +
                            " Почта:       %s \n" +
                            " Телефон:     %s \n" +
                            " Зарплата:    %d \n" +
                            " Возраст:    \u001B[31m %d \u001B[0m \n", fullName, position, email, phone, salary, age);
        }

        public int getAge() {//метод возвращает возраст
            return age;
        }
}
