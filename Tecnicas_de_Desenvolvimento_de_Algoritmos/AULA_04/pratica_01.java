import java.util.Scanner;

public class pratica_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num;

        System.out.println("Digite um número inteiro: ");
        num = scanner.nextInt();

        if(num % 2 == 0) {
            System.out.println("O número: " + num + " é par!");
        }

    }
}
