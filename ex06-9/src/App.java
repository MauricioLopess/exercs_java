// Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
// devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
// da pessoa mais velha.

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String olderName = "";
        int olderAge = 0;

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();
        String[] names = new String[n];
        int[] ages = new int[n];

        for (int i = 0; i < n ; i++) {
            System.out.printf("Dados da %da pessoa:\n", i+1);
            sc.nextLine();

            System.out.print("Nome: ");
            names[i] = sc.nextLine();

            System.out.print("Idade: ");
            ages[i] = sc.nextInt();
                    
            if(ages[i] > olderAge){
                olderAge = ages[i];
                olderName = names[i];
            }
        }

        System.out.print("PESSOA MAIS VELHA: " + olderName);

        sc.close();
    }
}
