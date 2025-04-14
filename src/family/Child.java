package family;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Child extends Human {
    public Child(String name, int age, String gender, String occupation) {
        super.age = age;
        super.dateOfBirth = LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        super.gender = gender;
        super.name = name;
        super.occupation = occupation;
    }


    public void goesToSchool() {
        System.out.println("I go to school");
    }


    public void goingToSchool() {
        System.out.println("I going to school");
    }


    public void goneToSchool() {
        System.out.println("I have gone to school");
    }


    public void fromSchool() {
        System.out.println("I am from school");
    }
}
