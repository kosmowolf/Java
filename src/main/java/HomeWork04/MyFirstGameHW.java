package HomeWork04;

import java.util.Random;
import java.util.Scanner;

public class MyFirstGameHW {
    private static final int SIZE = 5;
    private static final int DOTS_TO_WIN = 4;
    private static final char DOT_EMPTY = '-';
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';
    private static char[][] map;
    private static final Scanner sc = new Scanner(System.in);
    private static final Random rand = new Random();

    public static int aiX = -1, aiY = -1;


    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
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
            if (isWin(DOT_O)){
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

    private static void humanTurn() {
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
        return (x < 0 || x >= SIZE)
                || (y < 0 || y >= SIZE)
                || map[y][x] != DOT_EMPTY;
    }

    public static boolean isWin(char sym) {
        return checkHorizontalAndVertical(sym) || checkDiagonal(sym);
    }

    private static boolean checkHorizontalAndVertical(char sym) {
        int horizontalWinSeries = 0;
        int verticalWinSeries = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                //Проверяем горизонталь
                if (map[i][j] == sym) {
                    horizontalWinSeries++;
                    if (horizontalWinSeries == DOTS_TO_WIN) {
                        return true;
                    }
                    takeBlockAiCoordinates(horizontalWinSeries, j + 1, i, sym);
                } else {
                    horizontalWinSeries = 0;
                }
                //Проверяем вертикаль
                if (map[j][i] == sym) {
                    verticalWinSeries++;
                    if (verticalWinSeries == DOTS_TO_WIN) {
                        return true;
                    }
                    takeBlockAiCoordinates(verticalWinSeries, i, j + 1, sym);
                } else {
                    verticalWinSeries = 0;
                }
            }
            horizontalWinSeries = 0;
        }
        return false;
    }

    private static void takeBlockAiCoordinates(int winSeries, int x, int y, char sym) {
        if (winSeries == DOTS_TO_WIN - 1) {
            if (!isCellInvalid(x, y) && sym == 'X') {
                aiX = x;
                aiY = y;
            }
            if (!isCellInvalid(x, y - DOTS_TO_WIN) && sym == 'X') {
                aiX = x;
                aiY = y - DOTS_TO_WIN;
            }
            if (!isCellInvalid(x - DOTS_TO_WIN, y) && sym == 'X') {
                aiX = x - DOTS_TO_WIN;
                aiY = y;
            }
            if (!isCellInvalid(x - DOTS_TO_WIN, y - DOTS_TO_WIN) && sym == 'X') {
                aiX = x - DOTS_TO_WIN;
                aiY = y - DOTS_TO_WIN;
            }
        }
    }

    private static boolean checkDiagonal(char sym) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (checkDiagonalLeft(i, j, sym)) {
                    return true;
                }
                if (checkDiagonalRight(i, j, sym)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkDiagonalRight(int i, int j, char sym) {
        int popeda = 0;
        int l = j;
        for (int k = i; k < SIZE; k++) {
            if (l == -1) {
                break;
            }
            if (map[k][l] == sym) {
                popeda++;
            } else {
                popeda = 0;
            }
            takeBlockAiCoordinates(popeda, l - 1, k + 1, sym);
            l--;

            if (popeda == DOTS_TO_WIN) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkDiagonalLeft(int i, int j, char sym) {
        int popeda = 0;
        int l = j;
        for (int k = i; k < SIZE; k++) {
            if (l == SIZE) {
                break;
            }
            if (map[k][l] == sym) {
                popeda++;
            } else {
                popeda = 0;
            }
            takeBlockAiCoordinates(popeda, l + 1, k + 1, sym);
            l++;
            if (popeda == DOTS_TO_WIN) {
                return true;
            }
        }
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
        if (aiX == -1) {
            do {
                x = rand.nextInt(SIZE);
                y = rand.nextInt(SIZE);
            } while (isCellInvalid(x, y));
        } else {
            x = aiX;
            aiX = -1;
            y = aiY;
            aiY = -1;
        }
        System.out.printf("Компьютер походил в точку %d %d\n", x + 1, y + 1);
        map[y][x] = DOT_O;
    }
}
