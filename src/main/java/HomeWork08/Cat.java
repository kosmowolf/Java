package HomeWork08;

import HomeWork08.interfaces.Participant;

public class Cat implements Participant {

    private  int maxJumpHeight;
    private  int maxRunLength;

    public Cat(int maxJumpHeight, int maxRunLength){

        this.maxJumpHeight = maxJumpHeight;
        this.maxRunLength = maxRunLength;
    }

    @Override
    public boolean run(int lenght) {
        if(maxRunLength >= lenght){
            System.out.println("Кот бежит дистанцию " + maxRunLength);
            return true;
        } else {
            System.out.println("Кот не может пробежать дистанцию " + maxRunLength);
            return false;
        }
    }
    @Override
    public boolean jump(int height) {
        if(maxJumpHeight >= maxJumpHeight){
            System.out.println("Кот делает прыжок " + maxRunLength);
            return true;
        } else {
            System.out.println("Кот не может прыгнуть " + maxRunLength);
            return false;
        }
    }


}
