// Fazer um programa para ler dois números inteiros M e N, e depois ler
// uma matriz de M linhas por N colunas contendo números inteiros,
// podendo haver repetições. Em seguida, ler um número inteiro X que
// pertence à matriz. Para cada ocorrência de X, mostrar os valores à
// esquerda, acima, à direita e abaixo de X, quando houver, conforme
// exemplo.


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns in the matrix: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matriz = new int[m][n];

        for(int i = 0; i < matriz.length; i++){ // leitor de linha
            for (int j = 0; j < matriz[i].length; j++) { // leitor de coluna
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the element you want to check its positions: ");
        int x = sc.nextInt(); // elemento X para retornar comparação

        for(int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] == x){
                    System.out.println("Position " + i + ", " + j +": ");
                    if (j > 0) {
                        System.out.println("Left: " + matriz[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + matriz[i-1][j]);
                    }
                    if (j < matriz[i].length-1) {
                        System.out.println("Right: " + matriz[i][j+1]);
                    }
                    if (i < matriz.length-1) {
                        System.out.println("Down: " + matriz [i+1][j]);
                    }
                }
            }
        }
    }
}