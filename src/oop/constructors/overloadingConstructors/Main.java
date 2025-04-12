package oop.constructors.overloadingConstructors;

public class Main {
    public static void main(String[]args){
        Car car = new Car("Range rover", 2, 3,4);
        Car car1 = new Car("Mercedes", 7, 4);

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
    }
}
