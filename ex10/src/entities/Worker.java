package entities;

import entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    // composition/relation
    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker(){}
    public Worker(String name, WorkerLevel level, Double baseSalary, Department department){
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public WorkerLevel getLevel(){
        return this.level;
    }

    public void setLevel(WorkerLevel newLevel){
        this.level = newLevel;
    }

    public Double getBaseSalary(){
        return this.baseSalary;
    }

    public void setBaseSalary(Double newBaseSalary){
        this.baseSalary = newBaseSalary;
    }

    // composition methods
    public Department getDepartment(){
        return this.department;
    }

    public void setDepartment(Department newDepartment){
        this.department = newDepartment;
    }

    public List<HourContract> getContracts(){
        return this.contracts;
    }

    public void addContract(HourContract contract){
        this.contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        this.contracts.remove(contract);
    }

    // return the sum of contracts
    public Double income(Integer month, Integer year){
        Double sum = baseSalary;
        for(int i = 0; i < contracts.size(); i++){
            LocalDate dateContract = contracts.get(i).getDate();
            if(dateContract.getMonthValue() == month && dateContract.getYear() == year){
                sum += contracts.get(i).totalValue();
            }
        }
        return sum;
    }

    public String toString(){
        return "Name: " + this.name + "\nDepartment: " + this.department.getName() + "\n";     
    }
}
