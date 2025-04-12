package oop;

public class Main {
    public static void main(String[]args){
        Car myCar = new Car();
        Car car = new Car();

        System.out.println(myCar.color);
        System.out.println(myCar.model);
        System.out.println(myCar.year);
        System.out.println(myCar.make);
        System.out.println(myCar.price);

        myCar.brake();
        myCar.drive();

        System.out.println(car.price);
        System.out.println(car.make);
        System.out.println(car.year);
        System.out.println(car.model);
        System.out.println(car.color);

        car.brake();
        car.drive();
    }
}
