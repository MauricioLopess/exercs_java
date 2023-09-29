// Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
// - Imprimir todos os elementos do vetor
// - Mostrar na tela a soma e a média dos elementos do vetor

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {   
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] numbers = new double[n];
        double soma = 0;
        double media = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um número: ");
            numbers[i] = sc.nextDouble();
            soma += numbers[i];
        }

        System.out.print("VALORES =");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(" " + numbers[i] + " ");   
        }
        System.out.println();
        media = soma/n;
        System.out.printf("SOMA = %.2f\n", soma);
        System.out.printf("MÉDIA = %.2f", media);
        sc.close();
    }
}
