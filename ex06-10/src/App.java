// Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
// no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
// os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
// igual a 6.0 (seis).

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Quantos alunos serão digitados? ");
        int n = sc.nextInt();
        
        String[] names = new String[n];
        double[] firstQuarter = new double[n];
        double[] secondQuarter = new double[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno: \n", i+1);
            names[i] = sc.nextLine();
            firstQuarter[i] = sc.nextDouble();
            secondQuarter[i] = sc.nextDouble();

        }
        
        System.out.println("ALUNOS APROVADOS: ");
        for (int i = 0; i < n; i++) {
            if (((firstQuarter[i] + secondQuarter[i]) / 2) >= 6) {
                System.out.println(names[i]);
            }
        }

        sc.close();
    }
}
