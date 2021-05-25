package lesson05;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "Вася";
        cat1.color = "Рыжий";
        cat1.age = 10;
        cat1.meow();

        Cat cat2 = new Cat();
        cat2.name = "Пушистик";
        cat2.color = "Белый";
        cat2.age = 5;
        cat2.meow();
    }
}
