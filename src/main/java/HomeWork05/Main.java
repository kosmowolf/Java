package HomeWork05;

public class Main {
    public static void main(String[] args) {
        //4. Создать массив из 5 сотрудников. Пример: Person[] persArray = new Person[5];
        //   Вначале объявляем массив объектов persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        //   потом для каждой ячейки массива задаем объект persArray[1] = new Person(...); ... persArray[4] = new Person(...);
        personal[] personalArray = new personal[5];
        personalArray[0] = new personal("Иванов Иван Иванович", "стажер", "iii@gb.ru", "+79273212480", 25000, 25);
        personalArray[1] = new personal("Петров Петр Петрович", "джун", "ppp@gb.ru", "+79273212481", 50000, 30);
        personalArray[2] = new personal("Сидоров Иван Петрович", "мидл", "sip@gb.ru", "+79273212482", 100000, 40);
        personalArray[3] = new personal("Козлов Петр Иванович", "сеньор", "kpi@gb.ru", "+79273212483", 250000, 50);
        personalArray[4] = new personal("Васечкин Павел Алексеевич", "тимлид", "vpa@gb.ru", "+79273212484", 350000, 45);

        System.out.println("\u001B[32m" + "Сотрудники старше 40 лет: \u001B[0m");
        for (int i = 0; i < personalArray.length; i++) {//5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
            if (personalArray[i].getAge()>=40){
                personalArray[i].printPersonalCard();
                System.out.println();
            }
        }

    }
}
