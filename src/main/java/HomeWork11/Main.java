package HomeWork11;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
        String[] myArray = new String[]{"a","b","c","d","e"};
        changeElements(myArray, 2, 3);
        System.out.println("Задача 1. " + Arrays.toString(myArray));

        //Задача 2. Написать метод, который преобразует массив в ArrayList
        List<String> list = convertToList(myArray);
        System.out.println("Задача 2. " + list.getClass() + " : " + list);

        //3. Задача:
        //a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
        //b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому
        //   в одну коробку нельзя сложить и яблоки, и апельсины;
        //c. Для хранения фруктов внутри коробки можно использовать ArrayList;
        //d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
        //   вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
        //e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той,
        //   которую подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
        //   Можно сравнивать коробки с яблоками и апельсинами;
        //f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов:
        //   нельзя яблоки высыпать в коробку с апельсинами. Соответственно, в текущей коробке фруктов не остается, а в другую
        //   перекидываются объекты, которые были в первой;
        //g. Не забываем про метод добавления фрукта в коробку
        System.out.println("Задача 3.");
        Orange orange = new Orange();
        Apple apple = new Apple();
        Box<Orange> orangeBox1 = new Box();
        Box<Orange> orangeBox2 = new Box();
        Box<Apple> appleBox = new Box();
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());

        for (int i = 0; i < 4; i++) {
            orangeBox2.add(new Orange());
        }
        for (int i = 0; i < 6; i++) {
            appleBox.add(new Apple());
        }


        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();

        Float orange1Weigth = orangeBox1.getWeight();
        Float orange2Weigth = orangeBox2.getWeight();
        Float appleWeigth = appleBox.getWeight();
        System.out.println("Вес коробки 1 с апельсинами: " + orange1Weigth);
        System.out.println("Вес коробки 2 с апельсинами: " + orange2Weigth);
        System.out.println("Вес коробки с яблоками: " + appleWeigth);

        System.out.println("Сравнить вес orangeBox1 и appleBox: " + orangeBox1.compare(appleBox));
        System.out.println("Сравнить вес orangeBox2 и appleBox: " + orangeBox2.compare(appleBox));

        orangeBox1.moveAt(orangeBox2);

        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();
    }

    private static <T> void changeElements(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static <E> List<E> convertToList(E[] array) {
        return Arrays.asList(array);
    }
}
