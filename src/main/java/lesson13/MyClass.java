package lesson13;

public class MyClass implements Runnable{
    private static boolean isFirstFinish  = false;

    @Override
    public void  run(){
        if (!isFirstFinish){
            try {
                Thread.sleep(10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            isFirstFinish = true;
        }
    }


}
