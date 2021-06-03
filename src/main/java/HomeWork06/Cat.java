package HomeWork06;

public class Cat extends Animal{

    @Override
    public void running(int lenght) {
        //super.running(lenght);
        if (lenght>2){
            System.out.println("кот не может бежать со сколостью");
        } else {
            System.out.println("кот пробегает дистанцию");
        }
    }

    @Override
    public void jumping(double height) {
        if (height>2){
            System.out.println("кот не может перепрыгунть");
        } else {
            System.out.println("кот перепрыгунть на дистанцию");
        }
    }

    @Override
    public void swimming(int lenght) {
        super.swimming(lenght);
    }
}
