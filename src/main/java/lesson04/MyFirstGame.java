package lesson04;

import java.util.Random;
import java.util.Scanner;

public class MyFirstGame {
    private static final int SIZE = 3;
    private static final int DOTS_TO_WIN = 3;
    private static final char DOT_EMPTY = '-';
    private static final char DOT_X = 'X';
    private static final char DOT_0 = '0';
    private static char[][] map;
    private static Scanner sc = new Scanner(System.in);
    private static Random rand = new Random();

    //Полностью разобраться с кодом, попробовать переписать с нуля;
    //* Усовершенствовать метод проверки победы;
    //* Расширить поле до 5х5 и в качестве условий победы установить серию равной 4.
    //** Проработать искусственный интеллект, чтобы он мог блокировать ходы игрока.

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true){
            humanTurn();
            printMap();
            if (isWin(DOT_X)){
                System.out.println("Вы выиграли, УРА!");
                break;
            }
            if (isMapFull()){
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (isWin(DOT_0)){
                System.out.println("Выиграл искусственный интеллект, увы...");
                break;
            }
            if (isMapFull()){
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра окончена");
    }

    private static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void humanTurn(){
        int x, y;
        do {
            System.out.println("Введите координату по вертикали");
            x = sc.nextInt() - 1;
            System.out.println("Введите координату по горизонтали");
            y = sc.nextInt() - 1;
        } while (isCellInvalid(x, y));
        map[y][x] = DOT_X;
    }

    private static boolean isCellInvalid(int x, int y) {
        /*if ((x>0 && x<SIZE) && (y>0 &&<SIZE) && map[x][y]==DOT_EMPTY){
            return true;
        }*/
        return (x < 0 || x >= SIZE)
                || (y < 0 || y >= SIZE)
                || map[y][x] != DOT_EMPTY;
    }
    private static boolean isWin(char symb) {
        if(map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
        if(map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
        if(map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
        if(map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
        if(map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
        if(map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
        if(map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
        if(map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
        return false;
    }
    private static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (isCellInvalid(x, y));
        System.out.printf("Компьютер походил в точку %d %d\n", x + 1, y + 1);
        map[y][x] = DOT_0;
    }
}
