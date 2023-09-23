import java.util.Scanner;

public class desafio_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float n1, n2, n3, n4, media;

        System.out.println("Digite o 1º valor:");
        n1 = scanner.nextFloat();

        System.out.println("Digite o 2º valor:");
        n2 = scanner.nextFloat();

        System.out.println("Digite o 3º valor:");
        n3 = scanner.nextFloat();

        System.out.println("Digite o 4º valor:");
        n4 = scanner.nextFloat();

        media = (n1+n2+n3+n4)/4;

        System.out.println("A média dos valores é: ");

    }
}
