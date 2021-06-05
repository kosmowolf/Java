package HomeWork06;

public class Cat extends Animal{

    @Override
    public boolean running(int lenght) {

        if (lenght>200){
            System.out.println(" Кот не может пробежать дистанцию  " + lenght);
        } else {
            System.out.println(" Кот пробегает дистанцию "  + lenght);
        }
        return true;
    }

    @Override
    public boolean jumping(double height) {
        if (height>2.0){
            System.out.println(" Кот не может перепрыгнуть высоту " + height);
        } else {
            System.out.println(" Кот перепрыгивает высоту " + height);
        }
        return true;
    }

    @Override
    public boolean swimming(int lenght) {
        System.out.println(" Кот не умеет плавать");
        //super.swimming(lenght);
        return false;
    }
}
