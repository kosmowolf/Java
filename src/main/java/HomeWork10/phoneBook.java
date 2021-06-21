package HomeWork10;

import java.util.HashMap;
import java.util.Map;

public class phoneBook {
    private static HashMap<String, String> pb = new HashMap<String, String>();

    //add - добавляет запись по заданным номеру телефона и фамилии
    public static void add(String phone, String name) {
        pb.put(phone, name);
    }

    public static void get(String name) {//с помощью метода get() искать номер телефона по фамилии.
        System.out.println(" У абонента " + name + " найдены следующие номера телефонов: ");
       if (pb.containsValue(name)){
           for (Map.Entry<String, String> entry : pb.entrySet()) {
               if (entry.getValue().equals(name)) {
                   System.out.println("  " + entry.getKey());
               }
           }
       } else {
           System.out.println(" Абонент " + name + " не найден!");
       }
    }
}
