import java.util.Scanner;

public class desafio_06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float num1, num2, resto;

        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextFloat();

        System.out.println("Digite o segundo número: ");
        num2 = scanner.nextFloat();

        resto = num1 % num2;

        System.out.println("O resto da divisão de " + num1 + " por " + num2 + " é igual à " + resto);


    }
}
