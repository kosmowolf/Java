package HomeWork08;

public class Human {
    public boolean run(int lenght) {

        if (lenght>200){
            System.out.println(" Человек не может пробежать дистанцию  " + lenght);
        } else {
            System.out.println(" Человек пробегает дистанцию "  + lenght);
        }
        return true;
    }

    public boolean jump(double height) {
        if (height>2.0){
            System.out.println(" Человек не может перепрыгнуть высоту " + height);
        } else {
            System.out.println(" Человек перепрыгивает высоту " + height);
        }
        return true;
    }
}
