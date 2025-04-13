package oop.polymorphism.dynamicpolymorphism;

public class Dog extends Animal {
    @Override
    public void speak() {
        super.speak();
        System.out.println("Dog barks");
    }
}
