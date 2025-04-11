import java.util.Scanner;

public class Loops {
    public static void main(String[]args){
        //while loops -> executes block of code as long as the condition remains true

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while (name.isBlank()){
            System.out.println("Enter name");
            name = scanner.nextLine();
        }
        System.out.println("My name is: "+name);


        // do while loop

        do{
            System.out.println("Enter name");
            name = scanner.nextLine();
        } while (name.isBlank());
        System.out.println("My name is: "+name);

        //for loop -> Executes a block of code a limited amount of time

        for (int i = 0; i<=10; i++){
            System.out.println(i);
        }

        for (int i=10; i>=0; i--){

            System.out.println(i);
        }
        System.out.println("Happy new year");

        //nested loops

        int rows;
        int columns;
        String symbols ="";

        System.out.println("Enter # of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter # of columns: ");
        columns = scanner.nextInt();

        System.out.println("Enter symbol to use:");
        symbols = scanner.next();

        for(int i = 1; i<=rows; i++){
            System.out.println();
            for (int j = 1; j<=columns; j++){
                System.out.print(symbols);
            }
        }


    }
}
