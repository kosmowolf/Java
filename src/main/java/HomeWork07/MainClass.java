package HomeWork07;

public class MainClass {
    public static void main(String[] args) {

        Plate plate = new Plate(100);
        Cat cat = new Cat("Barsik", 5, 10);
        Cat rijik = new Cat("Рыжик", 10, 20);

        while (plate.getFood()>0){
            System.out.println("Кот Барсик пытается поесть из миски ");
            cat.eat(plate);
            plate.info();
            System.out.println("Кот Рыжик пытается поесть из миски ");
            rijik.eat(plate);
            plate.info();
        }
    }
}
