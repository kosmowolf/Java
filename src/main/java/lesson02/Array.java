package lesson02;

public class Array {
    public static void main(String[] args) {
//        double[] array = new double[10];
//        array[0]=1.23;
//        System.out.println(array[0]);
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i+0.5;
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);  = i+0.5;
//        }
        int[][] arr = new int[5][10];
        for (int i = 0; i < arr.length; i++) {
            int[] ints = arr[i];
            for (int j = 0; j < ints.length; j++) {
                ints[j] =i*j;
                System.out.println(ints[j]);
            }
        }
    }
}
