package lesson01;

public class Main {
    //1. Создать пустой проект в IntelliJ IDEA и прописать метод main().

    public static void main(String[] args) {

        //2. Создать переменные всех пройденных типов данных и инициализировать их значения.
        short sVal = 12442;
        int iVal = 1000;
        long lVal = 200000L;
        float fVal = 12.23f;
        double dVal = -123.123;
        char cVal = '*';
        boolean bVal = false;

        //3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
        //   где a, b, c, d – аргументы этого метода, имеющие тип float.
        System.out.println("3. " + formula(2.3f, 3.5f, 4.6f, 5.9f)); //3. вызов метода

        //4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
        //   в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
        System.out.println("4. " + sum(5, 20));

        //5. Написать метод, которому в качестве параметра передается целое число,
        //  метод должен напечатать в консоль, положительное ли число передали или отрицательное.
        //  Замечание: ноль считаем положительным числом.
        System.out.println("5. " + checkInt(-1));
        //6. Написать метод, которому в качестве параметра передается целое число.
        //  Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
        System.out.println("6. "+checkNegative(-2));

        //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
        // Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
        System.out.println(helloName("Петр!"));
    }

    private static String helloName(String s) {//7.
        return "Привет, " + s;
    }

    private static boolean checkNegative(int j) {//6.
        if (j < 0) {
            return true;
        } else {
            return false;
        }
    }

    private static String checkInt(int i) {//5.
        if (i < 0) {
            return "Отрицательное";
        } else {
            return "Положительное";
        }
    }


    public static float formula(float a, float b, float c, float d) {//3.
        float formula = a * (b + (c / d));
        return formula;
    }

    public static boolean sum(int a, int b) {//4.
        if (a + b >= 10 & 20 >= a + b) {
            return true;
        } else {
            return false;
        }
    }
}