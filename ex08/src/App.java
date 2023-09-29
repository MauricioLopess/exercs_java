import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        System.out.println();

        List<Employee> employeeList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i+1));
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            employeeList.add(new Employee(id, name, salary));

            System.out.println();
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        Employee emp = employeeList.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        // foi encontrado o funcionário daquele ID

        System.out.print("Enter the percentage: ");
        double percentage = sc.nextDouble();

        System.out.println();
        System.out.println("List of employees: ");
        for (int i = 0; i < employeeList.size(); i++) {
            if(employeeList.get(i) == emp){
                employeeList.get(i).increaseSalary(percentage);
            }else{
                System.out.println("This id does not exist!");
            }
            System.out.println(employeeList.get(i));
        }
    }
}