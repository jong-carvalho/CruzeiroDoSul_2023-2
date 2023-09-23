import java.util.Scanner;

public class desafio_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float quantidadeParcelas, valorCompra;

        System.out.println("Digite o valor da compra: ");
        valorCompra = scanner.nextFloat();

        System.out.println("Digite a quantidade de parcelas: ");
        quantidadeParcelas = scanner.nextFloat();

        System.out.println("O valor da parcela é: " + calcularParcelas(valorCompra, quantidadeParcelas));

    }

    static float calcularParcelas(float quantidadeParcelas, float valorCompra) {
        float juros, valorParcelas;

        juros = 0.05f;

        valorParcelas = (valorCompra * (1+juros)) / quantidadeParcelas;

        return valorParcelas;
    }
}
