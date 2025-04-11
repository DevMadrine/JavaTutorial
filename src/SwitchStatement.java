public class SwitchStatement {

    //switch statements allow value or variables to be tested for equality against a list of values
    public static void main(String[]args){
        String day = "Saturday";

        switch (day){
            case "Monday":
                System.out.println("Today is Monday");
                break;
            case "Tuesday":
                System.out.println("Today is Tuesday");
                break;

            case "Wednesday":
                System.out.println("Today is Wednesday");
                break;
            case "Thursday":
                System.out.println("Today is Thursday");
                break;

            case "Friday":
                System.out.println("Today is Friday");
                break;

            default:
                System.out.println("That is not available");
        }
    }
}
