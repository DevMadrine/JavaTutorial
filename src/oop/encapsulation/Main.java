package oop.encapsulation;

public class Main {
    public static void main(String[]args){
        Car car = new Car("Toyota", "Harrier", 2020);
        car.setYear(2025);
        System.out.println(car.getName());
        System.out.println(car.getModel());
        System.out.println(car.getYear());


    }
}
