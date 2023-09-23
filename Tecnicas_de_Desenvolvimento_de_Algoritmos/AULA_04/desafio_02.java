import java.util.Scanner;

public class desafio_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float n1, n2, m;

        System.out.println("Digite a nota 1: ");
        n1 = scanner.nextFloat();

        System.out.println("Digite a nota 2: ");
        n2 = scanner.nextFloat();


        m = (n1 + n2) / 2;

        if (m >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
