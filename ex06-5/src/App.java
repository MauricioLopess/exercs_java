// Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
// o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
// considerando a primeira posição como 0 (zero)

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double greater = 0;
        int greaterIndex = 0;

        System.out.print("Quantos números voce vai digitar? ");
        int n = sc.nextInt();
        double[] reals = new double[n];

        for (int i = 0; i < reals.length; i++) {
            System.out.print("Digite um número: ");
            reals[i] = sc.nextDouble();
            if(reals[i] > greater){
                greater = reals[i];
                greaterIndex = i;
            }
        }

        System.out.println("MAIOR VALOR = " + greater);
        System.out.print("POSIÇÃO DO MAIOR VALOR = " + greaterIndex);

        sc.close();

    }
}
