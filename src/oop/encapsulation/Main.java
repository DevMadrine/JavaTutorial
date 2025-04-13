package oop.encapsulation;

public class Main {
    public static void main(String[]args){
        Car car = new Car("Toyota", "Harrier", 2020);
        //Car car1 = new Car("Pjero", "harrier", 2020);


        //car1.copy(car);

        Car car1 = new Car(car);


//        car.setYear(2025);


        System.out.println(car1);
        System.out.println(car);

        System.out.println(car.getName());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

        System.out.println();

        System.out.println(car1.getName());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());


    }
}
