package HomeWork03;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //1. Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
        // При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
        // После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
        guessRandomNumber();

        sc.close();

        //2. * Создать массив из слов
        //String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"}.
        //При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
        // сравнивает его с загаданным словом и сообщает, правильно ли ответил пользователь.
        // Если слово не угадано, компьютер показывает буквы, которые стоят на своих местах.
        //apple – загаданное
        //apricot - ответ игрока
        //ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
        //Для сравнения двух слов посимвольно можно пользоваться:
        //String str = "apple";
        //char a = str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
        //Играем до тех пор, пока игрок не отгадает слово.
        //Используем только маленькие буквы.

    }




    private static void guessRandomNumber() {
        Random rand = new Random();
        int tryCount = 3; // число попыток
        int guessingNumber = rand.nextInt(9); //загаданное число от 0 до 9
        while (true) {
            if (tryCount == 0) {
                System.out.println("Исчерпано количество попыток! Вы проиграли.");
                int question = sc.nextInt();
                if (continueTheGame(question)==false){ break;}

            } else {
                System.out.println("Угадайте число от 0 до 9");
                int enteredNumber = sc.nextInt();
                //проверка выигрыша
                if (enteredNumber == guessingNumber) {
                    System.out.println("Поздравляю! Вы выиграли!");
                    int question = sc.nextInt();
                    continueTheGame(question);
                } else {
                    if (enteredNumber > guessingNumber) {
                        System.out.println("Введенное число больше загаданного");
                    } else {
                        System.out.println("Введенное число меньше загаданного");
                    }
                }
                tryCount--;//декремент счетчика попыток
            }

        }
    }

    private static boolean continueTheGame(int question) {
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        if (question == 0) {
            return false;
        } else if (question == 1) {
            guessRandomNumber();
        } else {
            System.out.println("Введено не корректное значение! Выход");
            return false;
        }
        return false;
    }
}
