import java.util.Scanner;

public class desafio_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b;

        System.out.println("Digite a quantidade de horas: ");
        a = scanner.nextInt();

        System.out.println("Digite a quantidade de minutos: ");
        b = scanner.nextInt();

        System.out.println("A quantidade de minutos que passaram é: " + minutos(a, b));

    }

    static int minutos(int horas, int minut) {
        int res;

        res = horas*60 + minut;
        return res;
    }
}
