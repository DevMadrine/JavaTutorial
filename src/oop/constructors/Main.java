package oop.constructors;

public class Main {
    public static void main(String[]args){
        Human human = new Human("Madrine", 12, 12.5);
        Human human1 = new Human("Namulindwa", 13, 50.0);

        System.out.println(human.name);
        System.out.println(human.age);
        System.out.println(human.height);

       human.eat();
       human.drink();

        System.out.println(human1.name);
        System.out.println(human1.age);
        System.out.println(human1.height);

        human1.eat();
        human1.drink();
    }
}
