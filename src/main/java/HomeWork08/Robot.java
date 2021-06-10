package HomeWork08;

public class Robot {
    public boolean run(int lenght) {

        if (lenght>200){
            System.out.println(" Робот не может пробежать дистанцию  " + lenght);
        } else {
            System.out.println(" Робот пробегает дистанцию "  + lenght);
        }
        return true;
    }

    public boolean jump(double height) {
        if (height>2.0){
            System.out.println(" Робот не может перепрыгнуть высоту " + height);
        } else {
            System.out.println(" Робот перепрыгивает высоту " + height);
        }
        return true;
    }
}
