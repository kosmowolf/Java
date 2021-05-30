package lesson05;

public class Cat {
    private static int catCount = 0;
    private static String description = "Божество, которое много орет и всегда просит еды";
    private String name;
    private String color;
    private int age;

    public static int getCatCount() {
        return catCount;
    }

    public static String getDescription() {
        return description;
    }

    public Cat(String color, int age) {
        this("Уличный", color, age);
    }

    public Cat(String name, String color, int age) {
        catCount++;
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void meow() {
        meow(false);
    }

    public void meow(boolean isLong) {
        if (isLong) {
            System.out.printf("Кот %s говорит: Мяяяяяяяяяяяяяу!\n", name);
        } else {
            System.out.printf("Кот %s говорит: Мяу!\n", name);
        }
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0) {
            System.err.println("Неверно указан возраст");
        } else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
