// Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). Depois, solicitar
// do usuário um mês e mostrar qual foi o salário do funcionário nesse mês, conforme exemplo
// (próxima página)

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter department's name: ");
        String departmentAux = sc.nextLine();
        Department department = new Department(departmentAux);

        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String workerName = sc.nextLine();

        System.out.print("Level(JUNIOR, MID_LEVEL, SENIOR): ");
        String auxlevel = sc.next();
        WorkerLevel level = WorkerLevel.valueOf(auxlevel);

        System.out.print("Base salary: ");
        Double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, level, baseSalary, department);

        System.out.print("How many contracts to this worker? ");
        Integer workers = sc.nextInt();

        for (int i = 0; i < workers; i++) {
            System.out.printf("Enter contract #%d data:\n", i);
            System.out.print("Date (DD/MM/YYYY): ");
            String dateString = sc.next();
            LocalDate date = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();

            System.out.print("Duration (hours): ");
            Integer hours = sc.nextInt();

            HourContract contract = new HourContract(date, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthYearString = sc.next();
        Integer month = Integer.parseInt(monthYearString.substring(0, 2));
        Integer year = Integer.parseInt(monthYearString.substring(3));
        // LocalDate monthYear = LocalDate.parse(monthYearString, DateTimeFormatter.ofPattern("MM/yyyy"));
        Double income = worker.income(month, year);

        System.out.print(worker.toString());
        System.out.print("Income for " + monthYearString +  ": " + income);

        sc.close();

    }
}
