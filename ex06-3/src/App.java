/*
*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. 
*Depois, mostrar na tela a altura média das pessoas, 
*e mostrar também a porcentagem de pessoas com menos de 16 anos,
*bem como os nomes dessas pessoas caso houver.
*/

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double midHeight = 0;
        double minSixteen = 0;


        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        Person[] arrPerson = new Person[n];

        for (int i = 0; i < arrPerson.length; i++) { 
            System.out.printf("Dados da %da pessoa: \n", i+1);
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Idade: ");
            int age = sc.nextInt();

            System.out.print("Altura: ");
            double height = sc.nextDouble();
            
            arrPerson[i] = new Person(name, age, height);

            System.out.println();
            System.out.println("----------");
            System.out.println();

        }

        // altura média
        for (int i = 0; i < arrPerson.length; i++) {
            midHeight += arrPerson[i].getHeight();
        }
        midHeight = midHeight/arrPerson.length;
        
        // menores de 16
        for (int i = 0; i < arrPerson.length; i++) {
            if(arrPerson[i].getAge() < 16){
                minSixteen++;
            }
        }
        minSixteen = ((double)minSixteen/(double)arrPerson.length) * 100 ;

        System.out.printf("Altura média: %.2f\n", midHeight);
        System.out.printf("Pessoas com menos de 16 anos: %.2f  ", minSixteen);

        for (int i = 0; i < arrPerson.length; i++) {
            if(arrPerson[i].getAge() < 16){
                System.out.println(arrPerson[i].getName());
            }
        }

        sc.close();
    }
}
