package HomeWork07;
//1. Расширить задачу про котов и тарелки с едой.
//2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
//3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
//4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
//5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
//6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
public class Cat {
    private String name;
    private int appetite;
    private int satiety; //сытость

    public Cat(String name, int appetite, int satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }
    public void eat(Plate p) {
        p.decreaseFood(name, appetite, satiety);
    }
    public boolean satiety(int m){
        //3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
        System.out.println("  Проверка сытости (норма - съедено): " + satiety + " - " + m + " = " + (satiety-m)); //служебная проверка можно закоментить
        if ((satiety-m)==0){
            return true;
        } else {
            //проверка насколько сыт(вне задания)
            if ((satiety-m)>0){
                System.out.println("  \u001B[34m кот сыт на " + ((((double)satiety-m)/satiety)*100) + " % \u001B[0m");
            } else {
                System.out.println("  \u001B[35m кот голоден на " + Math.abs((((double)satiety-m)/satiety)*100) + " % \u001B[0m");
            }
            return false;
        }
    }
    public String catInfo(){
        return name;
    }

}
