public class ArrayClass {
    public static void main(String[]args){
        //Arrays are used to store multiple values in a single variable
        String[] cars = {"prado", "kawundo", "tesla"};
        cars[0] = "Mustang";
        System.out.println(cars[0]);
        System.out.println(cars[1]);

        String[] food = new String[4];
        food[0] = "pizza";
        food[1] ="mattoke";
        food[2] = "chicken";
        food[3] = "liver";

        for(int i = 0; i< food.length; i++){
            System.out.println(food[i]);
        }


        //2D Arrays -> storing array of rows and columns

        String[][] items = new String[3][3];
        items[0][0] = "good";
        items[0][1] = "better";
        items[0][2] = "best";
        items[1][0] = "bad";
        items[1][1] = "worse";
        items[1][2] = "worst";
        items[2][0] = "great";
        items[2][1] = "greater";
        items[2][2] = "greatest";

        for(int i =0; i<items.length; i++){
            System.out.println();
            for(int j=0; j<items[i].length; j++){
                System.out.print(items[i][j] + " ");
            }
        }

    }
}
