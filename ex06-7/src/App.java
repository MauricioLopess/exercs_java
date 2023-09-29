// Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
// mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
// os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double media = 0;

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double[] reals = new double[n];

        for (int i = 0; i < reals.length; i++) {
            System.out.print("Digite um número: ");
            reals[i] = sc.nextDouble();
            media += reals[i]; // ja soma tudo
        }

        media = media/reals.length;

        System.out.printf("MÉDIA DO VETOR = %.3f\n", media);
        System.out.println("VALORES ABAIXO DA MÉDIA: ");
        for (int i = 0; i < reals.length; i++) {
            if(reals[i] < media){
                System.out.println(reals[i]);
            }
        }
        sc.close();
    }
}
