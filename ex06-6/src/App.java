// Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
// terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
// o vetor C gerado.

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        int[] C = new int[n];

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.printf("%do: ", i+1);    
            A[i] = sc.nextInt();
        }   

        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < B.length; i++) {
            System.out.printf("%do: ", i+1);    
            B[i] = sc.nextInt();
        }

        System.out.println("VETOR RESULTANTE");
        for (int i = 0; i < n; i++) {
            C[i] = A[i] + B[i];
            System.out.println(i+1 +"o: " + C[i]);
        }

        sc.close();
    }
}
