import java.util.Scanner;

public class desafio_05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float valorCompra;
        int parcelas;

        System.out.println("Digite o valor da compra: ");
        valorCompra = scanner.nextFloat();

        System.out.println("Digite a quantidade de parcelas: ");
        parcelas = scanner.nextInt();

        if(parcelas == 1){
            System.out.println("O valor a ser pago é: " + (valorCompra - (valorCompra * 0.1)));
        } else if(parcelas == 2){
            System.out.println("O valor a ser pago é: " + (valorCompra - (valorCompra * 0.3)));
        } else if(parcelas == 3){
            System.out.println("O valor a ser pago é: " + (valorCompra - (valorCompra * 0.6)));
        } else if(parcelas == 4){
            System.out.println("O valor a ser pago é: " + (valorCompra - (valorCompra * 0.9)));
        } else if(parcelas == 5){
            System.out.println("O valor a ser pago é: " + (valorCompra - (valorCompra * 0.12)));
        }
    }
}
