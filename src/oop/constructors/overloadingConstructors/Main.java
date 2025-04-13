package oop.constructors.overloadingConstructors;

public class Main {
    public static void main(String[]args){
        Car car = new Car("Range rover", 2, 3,4);
        Car car1 = new Car("Mercedes", 7, 4);
        Car[] cars = new Car[4];

        Car car2 = new Car("bike", 1,2,4);
        Car car3  = new Car("jaj", 4,6,8);
        Car car4 = new Car("bb", 6,5);
        Car car5 = new Car("vv",3,4);

        cars[0] = car2;
        cars[1] = car3;
        cars[3] = car5;
        cars[2] = car4;

        System.out.println(cars[0].doors);
        System.out.println(cars[3].name);
        System.out.print(cars[1]);

        System.out.println("Properties for car: ");
        System.out.println(car.name);
        System.out.println(car.wheels);
        System.out.println(car.mirrors);
        System.out.println(car.doors);

        System.out.println("Properties for car1: ");
        System.out.println(car1.name);
        System.out.println(car1.wheels);
        System.out.println(car1.mirrors);

        //toString() method
        System.out.println(car.toString());//explicitly
        System.out.println(car); //implicitly

        System.out.println(car1.toString());
        System.out.println(car1);
    }
}
