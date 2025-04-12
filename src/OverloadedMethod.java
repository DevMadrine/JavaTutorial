public class OverloadedMethod {
    static int add(int a, int b){
        System.out.println("This is overloaded method 1");
        return a+b;
    }

    static double add(double a, double b, double c){
        System.out.println("This si overloaded method 2");
        return a + b + c;
    }

    public static void main(String[]args){
        System.out.println(add(1,2));
        System.out.println(add(1,2,3));
    }
}
