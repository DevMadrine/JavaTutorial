public class Methods {

    static int add(int x, int y){
       return  x+y;
    }

    static void hello(String name, int age){
        System.out.println("My name is: " +name);
        System.out.println("My age is: " +age);
    }

    public static void main(String[]args){
        int x = 5;
        int y = 7;

        String name = "Madrine";
        int age = 18;

        hello(name,age);

        System.out.println(add(x,y));

    }
}
