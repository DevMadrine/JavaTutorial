import java.util.Scanner;

public class LogicalOperators {
    public static void main(String []args) {
        /*
         * AND(&&) -> both conditions must be true
         * OR(||) -> either of the conditions must be true
         * !=(NOT) -> reverses boolean value of a condition
         */
//AND OPERATOR
        int age = 40;
        if (age >= 18 && age <= 30) {
            System.out.println("You are a youth");
        }else if(age >= 31 && age <=45){
            System.out.println("You are a juvenile");
        }
        else{
            System.out.println("You are old");
        }

        // OR OPERATOR

        Scanner scanner = new Scanner(System.in);
        System.out.println("You are playing a game! Press q or Q to quit");
        String response = scanner.next();

        if(response.equals("q") || response.equals("Q")){
            System.out.println("You have quit the game!!!");
        }else {
            System.out.println("You are still playing the game");
        }

        //NOT EQUAL

        if(!response.equals("q") && !response.equals("Q")){
            System.out.println("You are still playing the game!!!");
        }else {
            System.out.println("You have quit the game");
        }
    }
}
