package VinteNoveAbril;
import java.util.Scanner;

public class ExDezoito {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float num, quadrado, cubo, raiz;

        System.out.print("Digite um número: ");
        num = sc.nextFloat();

        while (num > 0) {
            quadrado = num * num;
            cubo = num * num * num;
            raiz = (float) Math.sqrt(num);

            System.out.println("\nValor digitado: " + num);
            System.out.println("Seu quadrado: " + quadrado);
            System.out.println("Seu cubo: " + cubo);
            System.out.println("Sua raiz quadrada: " + raiz);

            System.out.print("\nPara encerrar digite um número menor ou igual a 0. Se quiser usar o sistema novamente, digite um número maior que 0!\n<< ");
            num = sc.nextFloat();
        }

        sc.close();
    }
}
