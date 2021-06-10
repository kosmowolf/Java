package HomeWork08;

public class Cat {
    public boolean run(int lenght) {

        if (lenght>200){
            System.out.println(" Кот не может пробежать дистанцию  " + lenght);
        } else {
            System.out.println(" Кот пробегает дистанцию "  + lenght);
        }
        return true;
    }

    public boolean jump(double height) {
        if (height>2.0){
            System.out.println(" Кот не может перепрыгнуть высоту " + height);
        } else {
            System.out.println(" Кот перепрыгивает высоту " + height);
        }
        return true;
    }
}
