package lesson2;

public class Main2 {
    public static String hello = "Привет";
    static String hellSasha = hello + " Саша";
    static int i;

    public static void main(String[] args) {
        String s = Main.name;
        if (true) {
            i = 0;
            System.out.println(hello);
            System.out.println(args);
        }
        if (true) {
            int i = 0;
            System.out.println(hello);
            System.out.println(args);
        }
        System.out.println(hello);
        System.out.println(args);
//        System.out.println(i);
        method1(1);
        int asffdfdsf = 123;
        method1(asffdfdsf);
        method2(asffdfdsf);
    }

    public static void method1(int i) {
        System.out.println(hello);
//        System.out.println(args);
    }

    public static void method2(int i) {
        System.out.println(hello);
//        System.out.println(args);
    }
}
