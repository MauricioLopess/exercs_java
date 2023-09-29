import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        sc.nextLine();
        Student[] students = new Student[10]; 

        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.println("Rent #" + (i+1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Room: ");
            int room = sc.nextInt();
            System.out.println();
            sc.nextLine();


            students[room] = new Student(name, email, room);
        }

        System.out.println("Busy rooms:");
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && i == students[i].getRoom()) {
                System.out.println(students[i]);
            }
        }

        sc.close();
    }
}
