package HomeWork07;

public class MainClass {
    public static void main(String[] args) throws InterruptedException {

        //5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.

        Plate plate = new Plate(240); // Добавляем еду в тарелку
        Cat[] catArr = new Cat[5]; //создаем массив котов
        catArr[0] = new Cat("Барсик", 5, 10);
        catArr[1] = new Cat("Рыжик", 10, 20);
        catArr[2] = new Cat("Мурзик", 6, 12);
        catArr[3] = new Cat("Персик", 4, 8);
        catArr[4] = new Cat("Пушок", 3, 6);

        while (plate.getFood() > 0) {
            for (int i = 0; i < catArr.length; i++) {
                System.out.println("Кот " + catArr[i].catInfo() + " пытается поесть из миски ");
                catArr[i].eat(plate); //просим котов поесть из тарелки и выводим информацию о сытости в консоль
                plate.info();
            }

        }
    }
}
