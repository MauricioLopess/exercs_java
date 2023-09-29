package entities;

public class LegalPerson extends Person {
    private int numberOfEmployees;

    public LegalPerson(){}
    public LegalPerson(String name, double anualIncome, int numberOfEmployees){
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees(){
        return this.numberOfEmployees;
    }

    @Override
    public double tax(){
        double taxPercent = 0.16;
        if(this.numberOfEmployees > 10){
            taxPercent = 0.14;
        }

        return this.anualIncome * taxPercent;
    }
}
