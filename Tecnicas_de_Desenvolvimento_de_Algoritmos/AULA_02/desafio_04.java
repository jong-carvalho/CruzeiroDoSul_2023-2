import java.util.Scanner;

public class desafio_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float valor, dolar, total;

        System.out.println("Digite a cotação do dólar hoje: ");
        dolar = scanner.nextFloat();

        System.out.println("Digite a quantidade de reais que desja converter: ");
        valor = scanner.nextFloat();

        total = dolar * valor;

        System.out.println("O valor: " + valor + " converdito na cotação do dólar hoje que é: " + dolar + " é igual a " + total);
    }
}
