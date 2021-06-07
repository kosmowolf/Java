package HomeWork07;

import java.util.ArrayList;

public class FoodObserved {
    //5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
    protected ArrayList<Cat> cats = new ArrayList<>();
    protected ArrayList<Plate> plates = new ArrayList<>();

    private static FoodObserved instance;

    public static FoodObserved getInstance(){
        if (instance == null){
            instance = new FoodObserved();
        }
        return instance;
    }

//    public void addCat(Cat cat){cats.add(cat);}
//    public void addPlate(Plate plate){plates.add(plate);}
//    public void addFood(int food){
//        if (food==0) return;
//        for (Plate plate : plates) {
//            food = plate.addFoodOnPlate(food);
//            if (food == 0){
//                notifyCats();
//                return;
//            }
//        }
//        notifyCats();
//    }
//    public void addFood(int food, int plateNumber){
//        if (plates.size()<plateNumber) {addFood(food);}
//        else {
//            food -= plates.get(plateNumber-1).addFoodOnPlate(food);
//            if (food != 0)
//        }
//    }
}
