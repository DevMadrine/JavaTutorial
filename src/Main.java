import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //variables

        /*creating a variable
        declaration -> datatype variable_name; -> int a;
        assignment -> variable_name = value; -> a = 10;
        initialization -> declaration + assignment -> datatype variable_name = value; -> int a = 2;
        */
       int a; //declaration
       a=10; //assignment
       int b = 20; //initialization

      //swapping variables(you introduce a third variable)
       int c = b;
       b= a;
       a=c;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //Accepting user input - (use of the scanner class)


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = scanner.nextLine();

        System.out.println("Enter age:");
        int age = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Enter favorite dish:");
        String dish = scanner.nextLine();


        System.out.println("My name is: "+name);
        System.out.println("My age is: "+age);
        System.out.println("My favorite dish is: " +dish);



    }
}