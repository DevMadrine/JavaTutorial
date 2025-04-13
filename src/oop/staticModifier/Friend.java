package oop.staticModifier;

public class Friend {
    String name;
    static int numberOfFriends;
    static String occupation = "Teachers";

    Friend(String name){
        numberOfFriends++;
    }

    static int display(){
        return numberOfFriends++;

    }

}
