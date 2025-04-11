import java.util.Scanner;

public class MathClass {
    public static void main(String[]args){
        double a = 3.14;

        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x:");
        x= scanner.nextDouble();

        System.out.println("Enter y:");
        y=scanner.nextDouble();

        z= Math.sqrt((x*x) + (y*y));

        System.out.println(z);
        scanner.close();

        System.out.println(Math.max(x,y));
        System.out.println(Math.round(a));
        System.out.println(Math.min(x,y));
        System.out.println(Math.ceil(a));
        System.out.println(Math.floor(a));
    }
}
