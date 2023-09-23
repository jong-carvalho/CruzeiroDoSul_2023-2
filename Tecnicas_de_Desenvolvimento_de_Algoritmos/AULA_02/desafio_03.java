import java.util.Scanner;

public class desafio_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float peso, altura, imc;

        System.out.println("Digite o peso da pessoa (em Kg): ");
        peso = scanner.nextFloat();

        System.out.println("Digite a altura da pessoa (em m): ");
        altura = scanner.nextFloat();

        imc = peso / (altura * altura);

        System.out.println("O IMC da pessoa é: " + imc + " Kg/m2");
    }
}
