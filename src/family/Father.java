package family;

public class Father extends Human {
    public Father(){
        super.age=40;
        super.dateOfBirth = "17th October 1980";
        super.gender = "male";
        super.name="Yiga";
        super.occupation="Engineer";
    }

    public void head(){
        System.out.println("The father heads the family");
    }
}
