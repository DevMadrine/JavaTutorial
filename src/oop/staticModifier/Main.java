package oop.staticModifier;

public class Main {
    public static void main(String[]args){
        Friend friend = new Friend("Madrine");
        Friend friend1 = new Friend("Tiffah");
        System.out.println("You have " +Friend.display() + " friends and they are all " +Friend.occupation);
    }
}
