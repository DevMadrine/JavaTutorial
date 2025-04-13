package oop.package1;
import oop.package2.*;

public class A extends C{

    protected String protectedMessage = "This is a protected";    public static void main(String[]args){
        C c = new C();
        System.out.println(c.publicMessage);

        A a = new A();
        System.out.println(a.protectedMessage);


    }

}
