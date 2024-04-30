package VinteNoveAbril;

import java.util.Scanner;

public class ExOnze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor do carro: ");
        double valorCarro = scanner.nextDouble();
        double precoAVista = valorCarro * 0.8;
        
        System.out.printf("Preço final à vista com desconto: R$ %.2f\n", precoAVista);
        System.out.println("\nTabela de preços:");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("| Quantidade de Parcelas | Preço Final | Valor da Parcela |");
        System.out.println("-------------------------------------------------------------------");
        
        for (int parcelas : new int[]{12, 24}) {
            double percentualAcrescimo = parcelas <= 12 ? 0.05 : 0.07;
            double precoFinalParcelado = valorCarro * (1 + percentualAcrescimo);
            double valorParcela = precoFinalParcelado / parcelas;
            System.out.printf("| %22d | R$ %-9.2f | R$ %-14.2f |\n", parcelas, precoFinalParcelado, valorParcela);
        }
        
        System.out.println("-------------------------------------------------------------------");
        
        scanner.close();
    }
}
