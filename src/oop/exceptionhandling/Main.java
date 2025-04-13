package oop.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.println("Enter x");
            int x = scanner.nextInt();

            System.out.println("Enter y");
            int y = scanner.nextInt();

            int z = x/y;

            System.out.println(z);
        }catch (ArithmeticException e){
            System.out.println("You can not divide by 1");
        }catch (InputMismatchException e){
            System.out.println("Please enter a number");
        }catch (Exception e){
            System.out.println("Something is wrong");
        }finally {
            System.out.println("Exception handling in java");
            scanner.close();
        }
    }
}
