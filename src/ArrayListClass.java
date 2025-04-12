import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[]args){
        ArrayList<String>food = new ArrayList<String>();
        food.add("pizza");
        food.add("chicken");
        food.add("burger");
        food.add("chapati");
        food.set(0, "pork");
//        food.remove(1);
//        food.clear();

        for(int i = 0; i<food.size(); i++){
            System.out.println(food.get(i));
        }

        //2D Dimensional ArrayLists

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList();
     bakeryList.add("bread");
     bakeryList.add("doughnut");
     bakeryList.add("cookies");

     ArrayList<String> vegetableList = new ArrayList();
     vegetableList.add("cabbages");
     vegetableList.add("tomatoes");
     vegetableList.add("pepper");

     ArrayList<String > drinks = new ArrayList();
     drinks.add("soda");
     drinks.add("water");

     groceryList.add(bakeryList);
     groceryList.add(vegetableList);
     groceryList.add(drinks);

        System.out.println(groceryList);
        System.out.println(groceryList.get(0).get(0));
        System.out.println(groceryList.get(1).get(0));
        System.out.println(groceryList.get(2).get(0));

        for(int j = 0; j<groceryList.size(); j++){
            System.out.println(groceryList.get(j));
        }

    }
}
