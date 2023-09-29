package entities;

public abstract class Person {
    protected String name;
    protected double anualIncome;
    
    public Person(){}
    public Person(String name, double anualIncome){
        this.name = name;
        this.anualIncome = anualIncome;
    }   

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public double getAnualIncome(){
        return this.anualIncome;
    }

    public abstract double tax();

}
