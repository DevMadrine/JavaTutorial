import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[]args){
        String [] animals = {"cat", "dog", "rat"};

        for(String i: animals){
            System.out.println(i);
        }

        ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");
        food.add("chicken");
        food.add("liver");

        for(String j: food){
            System.out.println(j);
        }
    }
}
