// Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
// aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
// digitado, mostrar a mensagem "NENHUM NUMERO PAR"

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pares = 0;
        int paresIndex = 0;

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um número: ");
            numbers[i] = sc.nextInt();
            if(numbers[i] % 2 == 0){
                pares += numbers[i];
                paresIndex++;
            }
        }

        pares = pares/paresIndex;
        
        if(pares > 0){
            System.out.printf("MEDIA DOS PARES = %.2f", pares);
        }else{
            System.out.print("NENHUM NÚMERO PAR");
        }

    }
}
