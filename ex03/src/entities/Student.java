package entities;

public class Student{
    public String name;
    public boolean situation;
    
    public double nota1;
    public double nota2;
    public double nota3;
    public double total; 

    public boolean calcSituation(){
        total = this.nota1 + this.nota2 + this.nota3;
        if(total < 60){
            return false;
        }else{
            return true;
        }
    }

    public String toString(){
        if(calcSituation()){
            return "FINAL GRADE = " + this.total + "\nPASS";
        }else{
            return "FINAL GRADE = " + this.total + "\nFAILED\nMISSING " + (total - 100) + "POINTS";
        }
    }

}