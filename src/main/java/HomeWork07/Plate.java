package HomeWork07;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n, int m) {//метод, который уменьшает food на указанную величину n.
        if (food-(n+m)>0) {//2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
            food -= n+m;
        } else {
            System.out.println("\u001B[31m Недостаточно еды в миске!\u001B[0m");
            food = 0; // кот съел остаток миска опустела
        }
    }
    public void info() {
        System.out.println(" Осталось еды в миске : " + food);
    }

    public int getFood() {
       return food;
    }
}
