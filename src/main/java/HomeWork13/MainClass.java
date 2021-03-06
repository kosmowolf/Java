package HomeWork13;

public class MainClass {

    //Все участники должны стартовать одновременно, несмотря на разное время подготовки.
    // В тоннель может одновременно заехать не больше половины участников (условность).
    // Первый участник, пересекший финишную черту, объявляется победителем (в момент пересечения этой самой черты).
    // Победитель должен быть только один (ситуация с 0 или 2+ победителями недопустима).
    //Когда все завершат гонку, нужно выдать объявление об окончании.
    //Код менять можно и даже нужно
    public static final int CARS_COUNT = 4;
    public static void main(String[] args) {
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
        Race race = new Race(new Road(60), new Tunnel(), new Road(40));
        Car[] cars = new Car[CARS_COUNT];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10));
        }
        for (int i = 0; i < cars.length; i++) {
            new Thread(cars[i]).start();
        }
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
    }

}
