package HomeWork12;

public class Main {
    //Необходимо написать два метода, которые делают следующее (оба делают одно и то же):

    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;

    public static void main(String[] args) throws InterruptedException {
        //1) Создают одномерный длинный массив, например:
        //
        float[] arr1 = new float[SIZE];
        float[] arr2 = new float[SIZE];
        //
        //2) Заполняют этот массив единицами.
        for (int i = 0; i < SIZE; i++) {
            arr1[i] = 1.00f;
            arr2[i] = 1.00f;
        }
        Consider(arr1); //1ый метод расчета
        MultiTreadConsider(arr2); //2ой метод расчета (многопоточный)
    }

    private static void Consider(float[] arr1) {//Первый метод просто бежит по массиву и вычисляет значения.
        long a = System.currentTimeMillis(); //3) Засекают время выполнения:
        for (int i = 0; i < arr1.length; i++) {//4) Проходят по всему массиву и для каждой ячейки считают новое значение по формуле:
            arr1[i] = (float)(arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Метод 1. Время выполнения: " + (System.currentTimeMillis()-a)  + " милисек");//5) В консоль выводится время работы:
    }

    private static void MultiTreadConsider(float[] arr2) throws InterruptedException {
        System.out.println("Метод 2. Разбивает массив на два массива, в двух потоках высчитывает новые значения и потом склеивает эти массивы обратно в один.");
        long a = System.currentTimeMillis(); //3) Засекают время выполнения:
        float[] a1 = new float[HALF]; //Второй разбивает массив
        float[] a2 = new float[HALF]; //на два массива,
        System.arraycopy(arr2, 0, a1, 0, HALF); //первая половина массива
        System.arraycopy(arr2, HALF, a2, 0, HALF);//вторая половина массива
        //
        //в двух потоках высчитывает новые значения
        Thread halfThread1 = new Thread(() -> {
            for (int i = 0; i < a1.length; i++) {//4) Проходят по всему массиву и для каждой ячейки считают новое значение по формуле:
                a1[i] = (float) (a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            System.out.println(".... время выполнения 1го потока: " + (System.currentTimeMillis()-a) + " милисек");
        });

        Thread halfThread2 = new Thread(() -> {
            for (int i = 0; i < a2.length; i++) {//4) Проходят по всему массиву и для каждой ячейки считают новое значение по формуле:
                a2[i] = (float) (a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            System.out.println(".... время выполнения 2го потока: " + (System.currentTimeMillis()-a) + " милисек");
        });
        halfThread1.start();
        halfThread2.start();
        halfThread1.join();
        halfThread2.join();
        //и потом склеивает эти массивы обратно в один.
        long b = System.currentTimeMillis(); // Засечем время выполнения склейки массивов
        System.arraycopy(a1, 0, arr2, 0, HALF);
        System.arraycopy(a2, 0, arr2, HALF, HALF);
        System.out.println(".... время выполнения на склейку массивов: " + (System.currentTimeMillis()-b) + " милисек");
        System.out.println(" Общее время выполнения: " + (System.currentTimeMillis()-a) + " милисек");//5) В консоль выводится время работы:
    }


}
