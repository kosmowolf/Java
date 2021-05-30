package lesson05;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = a;
//        int c = a;
//        c++;
        increment(a);
        System.out.println(a + " " + b);

        System.out.println(Cat.getDescription());
        System.out.println("Котов: " + Cat.getCatCount());

        Cat cat1 = new Cat("Васька", "Рыжий", 10);
        //Какая-то логика заставившая кота сменить цвет
//        cat1.setColor("Грязный");
//        cat1.setAge(10);
        cat1.meow(true);
        System.out.println(cat1);

        Cat cat2 = new Cat("Белый", 5);
        cat2.setName("Пушистик");
        cat2.setColor("Белый");
        cat2.setAge(5);
        cat2.meow();

        System.out.println("Котов: " + Cat.getCatCount());


//        Cat catCopy = cat2;

//        changeName(catCopy);
//        incrementAge(catCopy);

        System.out.println(cat1.getAge());
    }

    private static void increment(int i) {
        i++;
    }

    private static void changeName(Cat cat) {
//        cat.name = cat.name + " Первый";
    }

    private static void incrementAge(Cat cat) {
//        cat.age++;
    }
}
