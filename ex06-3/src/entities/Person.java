package entities;

public class Person {
    private String name;
    private int age;
    private double height;

    public Person(String name, int age, double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

    public double getHeight(){
        return this.height;
    }

    public void setHeight(double newHeight){
        this.height = newHeight;
    }
}
