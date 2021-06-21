package HomeWork11;

import java.util.Arrays;
import java.util.List;

public class Main {

    //3. Задача:
    //a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
    //
    //b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
    //
    //c. Для хранения фруктов внутри коробки можно использовать ArrayList;
    //
    //d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
    //
    //e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
    //
    //f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами. Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
    //
    //g. Не забываем про метод добавления фрукта в коробку
    public static void main(String[] args) {
        //1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
        String[] myArray = new String[]{"a","b","c","d","e"};
        changeElements(myArray, 2, 3);
        System.out.println("1. " + Arrays.toString(myArray));

        //Задача 2. Написать метод, который преобразует массив в ArrayList
        List<String> list = convertToList(myArray);
        System.out.println("2. " + list.getClass() + " : " + list);
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
