package oop.constructors.overloadingConstructors;

public class Car {
    String name;
    int wheels;
    int mirrors;
    int doors;

    Car(String name, int wheels, int mirrors, int doors){
        this.name = name;
        this.wheels = wheels;
        this.mirrors = mirrors;
        this.doors = doors;
    }

    Car(String name, int wheels, int mirrors){
        this.name = name;
        this.wheels = wheels;
        this.mirrors = mirrors;
    }
}
