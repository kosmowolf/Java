package lesson02;

public class Main {
    public static void main(String[] args) {
        String name = "Вася";
        switch (name){
            case "Петя":
                System.out.println("Привет петя");
                break;
            case "Вася":
                System.out.println("Привет вася");
                break;
        }
//        for (int i = 0; i <= 10; i++) {
//            System.out.println("cikl"+i);
//            for (int j = 0; j <= 10 ; j++) {
//                System.out.println("i*j="+i*j);
//
//            }
//        }
        int flag = 0;
        while(flag<=10){
             flag++;
            System.out.println(flag+"Условие все еще выполняется");
        }
    }
}
