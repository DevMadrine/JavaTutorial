package oop.overriding;

public class Main {
    public static void main(String[]args){
        Animal animal = new Animal();
        Animal animal1 = new Dog();

        animal1.speak();
        animal.speak();
    }
}
