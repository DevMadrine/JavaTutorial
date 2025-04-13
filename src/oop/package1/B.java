package oop.package1;
import oop.package2.*;

public class B extends C{
    public static void main(String[]args){
        C c = new C();
        System.out.println(c.publicMessage);

        B b = new B();
        System.out.println(b.protectedMessage);


    }
}
