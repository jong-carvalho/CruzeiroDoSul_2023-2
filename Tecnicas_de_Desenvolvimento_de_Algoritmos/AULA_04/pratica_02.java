import java.util.Scanner;

public class pratica_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        float valorParcelado, valorCompra, valorFinal;
        int qtdeParcelas, juros;

        System.out.println("Entre com o valor da compra: ");
        valorCompra = scanner.nextFloat();

        System.out.println("Entre com a qtde de parcelas: ");
        qtdeParcelas = scanner.nextInt();

        switch (qtdeParcelas) {
            case 2: juros = 3;
                break;
            case 4: juros = 7;
                break;
            case 6: juros = 9;
                break;
            case 8: juros = 12;
                break;
            default: juros = -1;
        }

        if (juros == -1) {
            System.out.println("Número de parcelas incorreto");
        } else {
            valorFinal = valorCompra + valorCompra * juros / 100;
            valorParcelado = valorFinal / qtdeParcelas;
            System.out.println("O valor de cada parcela é " + valorParcelado);
        }

    }
}
