//Faça um programa que receba várias idades, calcule e mostre a média das idades digitadas. Finalize digitando idade igual a zero
package VinteNoveAbril;

import java.util.Scanner;

public class SegExercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int somaIdades = 0;
        int quantidadeIdades = 0;
        
        System.out.println("Digite as idades (digite 0 para finalizar):");
        int idade = scanner.nextInt();
        
        while (idade != 0) {
            somaIdades += idade;
            quantidadeIdades++;
            
            System.out.println("Digite a próxima idade (ou 0 para finalizar):");
            idade = scanner.nextInt();
        }
        
        if (quantidadeIdades == 0) {
            System.out.println("Nenhuma idade foi inserida.");
        } else {
            double mediaIdades = (double) somaIdades / quantidadeIdades;
            System.out.println("A média das idades é: " + mediaIdades);
        }
        
        scanner.close();
    }
}
