// Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
// que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
// de homens.

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double minHeight = 0;
        double maxHeight = 0;
        double midWomanHeight = 0;
        int midWomanHeightIndex = 0;
        int mens = 0;
        
        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        double[] height = new double[n];
        char[] gender = new char[n];
        System.out.println();

        for (int i = 0; i < n; i++) {

            System.out.printf("Altura da %da pessoa: ", i+1);
            height[i] = sc.nextDouble();

            System.out.printf("Genero da %da pessoa: ", i+1);
            gender[i] = sc.next().charAt(0);

            if(height[i] < minHeight){
                minHeight = height[i];
            }
            
            if(height[i] > maxHeight){
                maxHeight = height[i];
            }

            if(gender[i] == 'M'){
                mens++;
            }

            if(gender[i] == 'F'){
                midWomanHeight += height[i];
                midWomanHeightIndex++;
            }

            System.out.println();

        }

  
        midWomanHeight = midWomanHeight/midWomanHeightIndex;
      
        
        System.out.printf("Menor altura = %.2f\n", minHeight);
        System.out.printf("Maior altura = %.2f\n", maxHeight);
        System.out.printf("Media das alturas das mulheres = %.2f\n", midWomanHeight);
        System.out.println("Número de homens = " + mens);

        sc.close();
    
    }

}
