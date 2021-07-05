package lesson12;

public class Counter {

    private int count = 0;
    private int count2 = 0;

    private final Object monitor = new Object();
    private final Object monitor2 = new Object();

    public synchronized static void hello(){
        char[] helloString = {'п', 'р', 'и', 'в', 'е', 'т'};
        System.out.println();
        for (char c : helloString) {
            System.out.print(c);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void increase(){
        synchronized (monitor) {
            int tempCount = count;//1
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            tempCount++;//2
            count = tempCount;
        }
    }

    public void increase2(){
        synchronized (monitor2) {
            int tempCount = count2;//1
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            tempCount++;//2
            count2 = tempCount;
        }
    }

    public int getCount() {
        return count;
    }

    public int getCount2() {
        return count2;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void sayHello(int thread) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Привет из потока " + thread);
    }
}
