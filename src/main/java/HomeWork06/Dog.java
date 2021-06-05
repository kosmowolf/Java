package HomeWork06;

public class Dog extends Animal{

    @Override
    public boolean running(int lenght) {
        if (lenght>500){
            System.out.println(" Собака не может пробежать дистанцию  " + lenght);
        } else {
            System.out.println(" Собака пробегает дистанцию "  + lenght);
        }
        return true;
    }

    @Override
    public boolean jumping(double height) {
        if (height>0.5){
            System.out.println(" Собака не может перепрыгнуть высоту " + height);
        } else {
            System.out.println(" Собака перепрыгивает высоту " + height);
        }
        return true;
    }

    @Override
    public boolean swimming(int lenght) {
        //super.swimming(lenght);
        if (lenght>10){
            System.out.println(" Собака не может пробежать дистанцию  " + lenght);
        } else {
            System.out.println(" Собака пробегает дистанцию "  + lenght);
        }
        return true;
    }
}
