package HomeWork07;

public class Plate {
    private int food;
    private int isAngry;
    public Plate(int food) {//6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
        this.food = food;
    }
    public void decreaseFood(String catName, int n, int m) {//метод, который уменьшает food на указанную величину n.
        if (food-(n+m)>0) {//2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
            food -= n+m;
            isAngry = m;
        } else {
            System.out.println("\u001B[31m Недостаточно еды в миске!\u001B[0m");
            isAngry = (n+m)-food;
            //усложняю логику вопреки 4му заданию, у меня кот может быть наполовину сыт, доедает до конца)
            food = 0; // кот съел остаток миска опустела
        }
        Cat cat = new Cat(catName,n,m);
        System.out.println("  сытость кота " + catName + " = " + cat.satiety(isAngry));
    }
    public void info() {
        System.out.println(" Осталось еды в миске : " + food);
    }
    public int getFood() {
       return food;
    }
}
