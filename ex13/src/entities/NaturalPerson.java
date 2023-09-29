package entities;

public class NaturalPerson extends Person {
    private double healthExpenses;

    public NaturalPerson(){}
    public NaturalPerson(String name, double anualIncome, double healthExpenses){
        super(name, anualIncome);
        this.healthExpenses = healthExpenses;
    }

    public double getHealthExpenses(){
        return this.healthExpenses;
    }

    @Override
    public double tax(){
        double taxPercent = 0;
        if(this.anualIncome  < 20000){
            // taxa de 15
            taxPercent = 0.15;
        }else if(this.anualIncome >= 20000){
            // taxa de 25
            taxPercent = 0.25;
        }
        return (this.anualIncome * taxPercent) - (this.healthExpenses * 0.5);
    }
}
