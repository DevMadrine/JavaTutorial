package oop.polymorphism;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bicy bicy = new Bicy();

        Vehicle[] racers = {car, bicy};

        for(Vehicle vehicle: racers){
            vehicle.go();
        }
    }
}
