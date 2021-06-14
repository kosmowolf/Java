package HomeWork08;

import HomeWork08.interfaces.Participant;

public class Human implements Participant{
    private  int maxJumpHeight;
    private  int maxRunLength;

    public Human(int maxJumpHeight, int maxRunLength){

        this.maxJumpHeight = maxJumpHeight;
        this.maxRunLength = maxRunLength;
    }

    @Override
    public boolean run(int lenght) {
        if(maxRunLength >= lenght){
            System.out.println("Человек бежит дистанцию " + maxRunLength);
            return true;
        } else {
            System.out.println("Человек не может пробежать дистанцию " + maxRunLength);
            return false;
        }
    }
    @Override
    public boolean jump(int height) {
        if(maxJumpHeight >= maxJumpHeight){
            System.out.println("Человек делает прыжок " + maxRunLength);
            return true;
        } else {
            System.out.println("Человек не может прыгнуть " + maxRunLength);
            return false;
        }
    }
}
