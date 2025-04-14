package family;

public class Mother extends Human {
    public Mother() {
        super.age = 35;
        super.dateOfBirth = "17th November 1985";
        super.gender = "female";
        super.name = "Teddy";
        super.occupation = "Business woman";
    }

    public void cares() {
        System.out.println("The mother takes care of the family");
    }

    public Child giveBirth(String name, int age, String gender, String occupation) {
        System.out.println("Mother has given birth");
        return new Child(name, age, gender, occupation);
    }
}
