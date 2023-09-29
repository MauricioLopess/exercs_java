// Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
// tela todos os números pares, e também a quantidade de números pares

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int pares = 0;

        System.out.print("Quantos números voce vai digitar? ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um número:");
            numbers[i] = sc.nextInt();
        }

        System.out.println("NÚMEROS PARES:");
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0){
                System.out.print(numbers[i] + " ");
                pares++;
            }
        }

        System.out.print("QUANTIDADE DE PARES = " + pares);

        sc.close();
    }
}
