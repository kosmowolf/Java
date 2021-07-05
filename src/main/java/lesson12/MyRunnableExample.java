package lesson12;

public class MyRunnableExample implements Runnable{
    private final int count;
    private final Counter counter;

    public MyRunnableExample(int count, Counter counter) {
        this.count = count;
        this.counter = counter;
    }

    @Override
    public void run() {
        counter.sayHello(count);
        if (count%2==0) {
            counter.increase();
        } else {
            counter.increase2();
        }
//        Counter.hello();
        System.out.println("Привет мир из отдельного раннабл потока №" + count);
    }
}
