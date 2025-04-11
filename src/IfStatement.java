import java.util.Scanner;

public class IfStatement {
    // if statement performs a block of code if its condition evaluates to be true
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        if(age>=18){
            System.out.println("You are an adult");
        }
        else{
            System.out.println("You are a child");
        }
    }
}
