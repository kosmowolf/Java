package HomeWork08;

import HomeWork08.interfaces.Barriers;

public class Treadmill implements Barriers {//беговая дорожка
    private  int lenght;

    public Treadmill(int lenght){this.lenght=lenght;}

    public int getLenght(){return lenght;}

//    @Override
//    public boolean passObstacleBy(Participant participant) {
//        if(participant.run()>lenght){
//            System.out.println(" Участник " + participant + " успешно пробежал дистанцию");
//            return true;
//        } else {
//            System.out.println(" Участник " + participant + " не может пробежать дистанцию");
//            return false;
//        }
//    }
}
