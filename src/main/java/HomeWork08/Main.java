package HomeWork08;

import HomeWork08.interfaces.Barriers;
import HomeWork08.interfaces.Participant;

import java.util.ArrayList;

//1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти классы должны уметь бегать и
//   прыгать (методы просто выводят информацию о действии в консоль).
//2. Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять
//   соответствующие действия (бежать или прыгать), результат выполнения печатаем в консоль (успешно пробежал, не смог
//   пробежать и т.д.).
//3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
//4. * У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
//   Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(5, 100);
        Robot robot = new Robot(77,666);
        Human human = new Human(500,7000);

        ArrayList<Participant> participants = new ArrayList<>();
        participants.add(cat);
        participants.add(human);
        participants.add(robot);

        Wall wall = new Wall(2);
        Treadmill treadmill = new Treadmill(400);

        ArrayList<Barriers> barriers = new ArrayList<>();
        barriers.add(wall);
        barriers.add(treadmill);

        for (Participant participant : participants) {
            boolean isContinue = true;
            for (Barriers barrier : barriers) {
                if(barrier instanceof Wall){
                    Wall wallBarrier=(Wall) barrier;
                    isContinue = participant.jump(wallBarrier.getHeight());
                } else if (barrier instanceof Treadmill){
                    Treadmill treadmillBarrier=(Treadmill) barrier;
                    isContinue = participant.run(treadmillBarrier.getLenght());
                }
                if (!isContinue){
                    break;
                }
                if (isContinue){
                    System.out.println("Участник финишировал");
                } else {
                    System.out.println("Участник сошел с дистанции");

                }
            }
        }
    }
}
