package oop.encapsulation;

public class Car {
    private String name;
    private String model;
    private int year;

    Car(String name, String model, int year){
       this.setName(name);
       this.setModel(model);
       this.setYear(year);

    }
Car(Car X){
        this.copy(X);
}
    public String getName(){
        return name;
    }

    public String getModel(){
        return model;
    }

    public Integer getYear(){
        return year;
    }
public void setName(String name){
        this.name = name;
}

    public void setModel(String model){
        this.model= model;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void copy(Car X){
        this.setName(X.getName());
        this.setModel(X.getModel());
        this.setYear(X.getYear());

    }

}
