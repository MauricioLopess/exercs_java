package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return this.grossSalary - this.tax ;
    }

    public void increaseSalary(double percent){
        this.grossSalary += this.grossSalary * percent / 100.0;
    }

    public String toString(){
        return this.name + ", $ " + netSalary();
    }
}
