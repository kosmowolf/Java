package lesson01;

public class Main {

    //служебные слова | что вернуть | название метода (параметры для метода) { тело метода }
//    public static void main(String[] args) {
        //ТипПеременной имяПеременной(идентификатор) = значение;
//        int i = 1123123;
//        double d = 123.11;
//        char c = 'П';
//        boolean b = true; //false
//        String s = "Привет, мир!";
//        System.out.println(s);

        //ТипПеременной имяПеременной(идентификатор) = значение;
//        Object helloWorld = new String("Привет, мир!");
//        System.out.println(helloWorld);

//        int ostatok = 10%3;
//        System.out.println(ostatok);

//        int chislo = 1;
//        System.out.println(chislo);
//        chislo = 2;
//        System.out.println(chislo);
//        chislo = chislo + 1;
//        System.out.println(chislo);
//        chislo += 1;
//        System.out.println(chislo);
//        chislo++;
//        System.out.println(chislo);
//        ++chislo;
//        System.out.println(chislo);

//        System.out.println(chislo++);
//        System.out.println(++chislo);

//        if (chislo == 8) {
//            System.out.println("Число = 8");
//        } else if (chislo == 7){
//            System.out.println("Число = 7");
//        } else {
//            System.out.println("Число точно != 7 или 8");
//        }
//    }

    public static void main(String[] args) {
        System.out.println("значение сложения = " + (1+1));
        printHelloWorld();
        String hello = "Еще раз привет!";
        printHelloWorld(hello);
        String newString = printHelloWorldAndReturn("Одна строка");
        System.out.println(newString);
        System.out.println(sum(1, 4));
    }

    private static void printHelloWorld() {
        System.out.println("Привет, мир!");
    }

    private static void printHelloWorld(String s) {
        System.out.println(s);
    }

    private static String printHelloWorldAndReturn(String s) {
        System.out.println(s);
        return s + s;
    }

    private static int sum(int a, int b) {
        return a + b;
    }


}
