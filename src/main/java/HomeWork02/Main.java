package HomeWork02;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        //  Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        //  С помощью цикла и условия заменить 0 на 1, 1 на 0;
        System.out.println("1. Задание №1");
        int[] intArr = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(" Был  массив " + Arrays.toString(intArr));
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i]==0){
                intArr[i]=1;
            } else if (intArr[i]==1){
                intArr[i]=0;
            }
        }
        System.out.println(" Стал массив " + Arrays.toString(intArr));

        //2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        System.out.println("2. Задание №2");
        int[] intEmptyArr = new int[8];
        for (int i = 0; i < intEmptyArr.length; i++) {
            intEmptyArr[i] = i*3;
        }
        System.out.println(" Результат: " + Arrays.toString(intEmptyArr));

        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        System.out.println("3. Задание №3");
        int[] iArr6x2 = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(" Было  " + Arrays.toString(iArr6x2));
        for (int i = 0; i < iArr6x2.length ; i++) {
            if (iArr6x2[i]<6){
                iArr6x2[i]=iArr6x2[i]*2;
            }
        }
        System.out.println(" Стало " + Arrays.toString(iArr6x2));

        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        //  и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        System.out.println("4. Задание №4");
        int[][] squareArray = new int[6][6];
        for (int i = 0; i < squareArray.length; i++) {
            for (int j = 0, x = squareArray[i].length - 1; j < squareArray[i].length; j++, x--) {
                if (i == j || i == x) squareArray[i][j] = 1;
                else squareArray[i][j] = 0;
                System.out.print(" " + squareArray[i][j] + " ");
            }
            System.out.print("\n");
        }
        //5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        System.out.println("5. Задание №5");
        int[] minMaxArrVal = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(" Поиск пиковых значений в массиве: " + Arrays.toString(minMaxArrVal));
        //нужно сравнить элементы массива в цикле, поэтому запишем значение 1го элемета в переменные
        int maxVal = minMaxArrVal[0];
        int minVal = minMaxArrVal[0];
        for (int i = 0; i < minMaxArrVal.length; i++) {
            if (minMaxArrVal[i]>maxVal){ // если значение элемента больше чем значение в переменной
                maxVal=minMaxArrVal[i]; // то запишем его в переменную в кач-ве максимального значения
            }
            if (minMaxArrVal[i]<minVal){ // если значение элемента меньше чем значение в переменной
                maxVal=minMaxArrVal[i]; // то запишем его в переменную в кач-ве минимального значения
            }
        }
        System.out.println(" Максимальное значение = " + maxVal + ", минимальное значение = " + minVal);

        //6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
        //  метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
        //  Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
        //  граница показана символами ||, эти символы в массив не входят.
        System.out.println("6. Задание №6");
        int[] nArr = new int[] {2,2,2,1,2,2,10,1};
        System.out.println(" Поиск равных сумм левой и правой части в массиве: " + Arrays.toString(nArr));
        System.out.println(" Равная сумма наЙдена = " + equalSumReturn(nArr));


        //7. **** Написать метод, которому на вход подается одномерный массив и
        //  число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементы
        //  массива на n позиций. Элементы смещаются циклично.
        //  Для усложнения задачи нельзя пользоваться вспомогательными массивами.
        //  Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1]
        //  при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
        //  При каком n в какую сторону сдвиг можете выбирать сами.

        // НЕ УСПЕВАЮ СДЕЛАТЬ ОСТАЛОСЬ ЧЕРЕЗ 30 МИН ВРЕМЯ ВЫХОДИТ(((



    }

    private static boolean equalSumReturn(int[] nArr) {
        //  метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
        int sumLeft = 0; //переменная для суммы массива слева
        boolean b = false;
        for (int i = 0; i < nArr.length; i++) {
            sumLeft += nArr[i]; //Сумма всех элементов массива в заданом диапазоне
            int sumRight=0; //переменная для суммы массива справа
            for (int j = i+1; j < nArr.length; j++) {
                sumRight+=nArr[j]; //Сумма всех элементов массива в заданом диапазоне
            }
            //System.out.println("SumL="+sumLeft+", SumR="+sumRight);//Визуальная проверка
            if (sumLeft==sumRight){
                System.out.println(" На элементе № " + (i+1) +" сумма слева = "+sumLeft+" и сумма справа = "+sumRight);
                b = true;
                break;
            }
        }
        return b;
    }
}
