package HomeWork10;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
        // Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем). (используй сет)
        //
        String[] stringArray = { "Иванов", "Петров", "Иванов", "Сидоров", "Васечкин", "Сидоров", "Иванов", "Козлов" };
        Set<String> uniKeys = new TreeSet<>();
        uniKeys.addAll(Arrays.asList(stringArray));
        System.out.println("1. Вывод уникальных слов из массива: " + uniKeys);

        //2. Посчитать, сколько раз встречается каждое слово. (используй мап)
        //
        HashMap<String, Integer> wordToCount = new HashMap<>();
        System.out.println("2. Вывод количества повторений слов в массиве: ");
        for (String word : stringArray)
        {
            if (!wordToCount.containsKey(word))
            {
                wordToCount.put(word, 0);
            }
            wordToCount.put(word, wordToCount.get(word) + 1);
        }
        for (String word : wordToCount.keySet())
        {
            System.out.println("  " + word + " " + wordToCount.get(word));
        }
        //3. Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
        // В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии.
        // Следует учесть, что под одной фамилией может быть несколько телефонов (несколько номеров у одного человека),
        // тогда при запросе такой фамилии должны выводиться все телефоны. Нет смысла хранить для одного человека несколько одинаковых номеров.
        phoneBook.add("+78901234569","Иванов");
        phoneBook.add("+78901234570","Петров");
        phoneBook.add("+78901234571","Иванов");
        phoneBook.add("+78901234572","Сидоров");
        phoneBook.add("+78901234573","Иванов");
        phoneBook.add("+78901234574","Козлов");
        System.out.println("3. Поиск в телефонном справочнике: ");
        phoneBook.get("Иванов");
    }

}
