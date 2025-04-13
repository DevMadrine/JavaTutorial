package oop.package2;
import oop.package1.*;


public class Asub extends A {
    public static void main(String[]args){
        C c = new C();
        Asub asub = new Asub();
        System.out.println(c.defaultMessage);
        System.out.println(asub.protectedMessage);

    }

}
