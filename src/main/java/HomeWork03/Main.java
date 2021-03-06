package HomeWork03;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //1. Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
        // При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
        // После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
        guessRandomNumber(3);

        sc.close();

    }

    private static void guessRandomNumber(int tryCount) {
        Random rand = new Random();
         // число попыток
        int guessingNumber = rand.nextInt(9); //загаданное число от 0 до 9
        while (true) {
            if (tryCount == 0) {
                System.out.println("Исчерпано количество попыток! Вы проиграли.");
                if(continueTheGame()==0) {
                    break;
                } else {
                   continueTheGame();
                }
                //break;
            } else {
                System.out.println("Угадайте число от 0 до 9. Осталось попыток:" + tryCount);
                tryCount--;//декремент счетчика попыток

                int enteredNumber = sc.nextInt();
                //проверка выигрыша
                if (enteredNumber == guessingNumber) {
                    System.out.println("Поздравляю! Вы выиграли!");
                    continueTheGame();
                } else {
                    if (enteredNumber > guessingNumber) {
                        System.out.println("Введенное число больше загаданного");
                    } else {
                        System.out.println("Введенное число меньше загаданного");
                    }
                }
            }
        }
    }

    private static int continueTheGame() {
        int answer = 3;
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        int question = sc.nextInt();
        if (question == 0) {
            System.out.println("Досвидания!");
            answer=0;
        }
        if (question == 1) {
            answer = 1;
            guessRandomNumber(3);
        }
        if (question<0 || question>1) {
            System.err.println("Введено не корректное значение!");
            answer = 1;
        }
        return answer;
    }
}
