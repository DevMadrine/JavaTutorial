package family;

public abstract class Human {
    String name;
    int age;
    String occupation;
    String dateOfBirth;
    String gender;

    public void eat() {
        System.out.println("Human being eats");
    }

    public void sleep(){
        System.out.println("Human being sleeps");
    }

    public void walk(){
        System.out.println("Human being walks");
    }

    public void cry(){
        System.out.println("Human being cries");
    }

    public void dies(){
        System.out.println("Human being dies");
    }

    public void age(){
        System.out.println("I am " +age+ " years old.");
    }
    public void occupation(){
        System.out.println("I am an " +occupation);
    }

    public void name(){
        System.out.println("My name is "+name);
    }
}
