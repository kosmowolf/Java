package HomeWork08;

import HomeWork08.interfaces.Barriers;

public class Wall implements Barriers {
    private int height;
    public Wall(int height){this.height = height;}
    public int getHeight(){return height;}

//    @Override
//    public boolean passObstacleBy(Participant participant){
//        if (participant.jump()>height){
//            System.out.println(" Участник " + participant + " успешно перепрыгнул стену");
//            return true;
//        } else {
//            System.out.println(" Участник " + participant + " не смог перепрыгнуть стену " + height);
//            return true;
//        }
//    }
}
