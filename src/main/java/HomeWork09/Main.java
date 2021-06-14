package HomeWork09;

import HomeWork09.exceptions.MyArrayDataException;
import HomeWork09.exceptions.MyArraySizeException;

public class Main {
    //1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
    //   При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
    //2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
    //   Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
    //   должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
    //3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException
    //   и вывести результат расчета.
    public static void main(String[] arg) {
        String[][] arrTwo = new String[][]{{"1", "1", "1", "1"},
                {"1", "22", "3", "1"},
                {"43", "8", "1", "2"},
                {"4", "5", "6", "1"}};
        String[][] arrOne = new String[][]{{"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"}
        };


        try {
            convertAndSumArr(arrTwo);
            convertAndSumArr(arrOne);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e ){
            System.out.println("В ячейке с индексами: " + (e.i+1) + " " + (e.k+1) + " лежит некорректное значение");
            e.printStackTrace();
        }
    }


    public static void convertAndSumArr(String[][] arr) throws MyArrayDataException, MyArraySizeException {
        if (arr.length != 4){
            throw new MyArraySizeException("Массив должен быть 4 на 4");
        }
        for (String[] strings : arr) {
            if (strings.length!=4){
                throw new MyArraySizeException("Массив должен быть 4 на 4");
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr[i].length; k++) {
                try {
                    sum += Integer.parseInt(arr[i][k]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException(i, k);
                }
            }
        }

        System.out.println(sum);
    }

}
