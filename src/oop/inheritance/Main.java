package oop.inheritance;

public class Main {

    public static void main(String[]args){
        Car car = new Car(4);
        car.go();
        car.stop();

        Bicycle bicycle = new Bicycle();
        bicycle.go();
        bicycle.stop();
    }
}
