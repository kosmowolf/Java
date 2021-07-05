package lesson12;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        List<Thread> threadExamples = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            threadExamples.add(new MyThreadExample(i));
//        }

        for (int i = 0; i < 50; i++) {
            MyRunnableExample myRunnableExample = new MyRunnableExample(i, counter);
            Thread t = new Thread(myRunnableExample);
            threadExamples.add(t);
//            t.setDaemon(true);
        }

        for (Thread threadExample : threadExamples) {
            threadExample.start();
        }

        for (Thread threadExample : threadExamples) {
            threadExample.join();
        }

        System.out.println(counter.getCount());
        System.out.println(counter.getCount2());
        System.out.println("Мейн закончил работу");
    }
}
