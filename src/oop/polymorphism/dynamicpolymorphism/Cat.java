package oop.polymorphism.dynamicpolymorphism;

public class Cat extends Animal{
    @Override
    public void speak() {
        super.speak();
        System.out.println("Cat mews");
    }
}
