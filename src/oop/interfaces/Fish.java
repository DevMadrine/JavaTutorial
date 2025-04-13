package oop.interfaces;

public class Fish implements Prey, Predator{

    @Override
    public void hunt() {
        System.out.println("This fish is hunting");
    }

    @Override
    public void flee() {
        System.out.println("This flee is fleeing");
    }
}
