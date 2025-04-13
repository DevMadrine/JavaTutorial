package oop.polymorphism.dynamicpolymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.println("What is the Animal you want");
        System.out.println("1=Dog or 2=Cat: ");
        int choice = scanner.nextInt();

        if(choice==1){
            Animal dog = new Dog();
            dog.speak();
        }else {
            Animal cat = new Cat();
            cat.speak();
        }

    }
}
