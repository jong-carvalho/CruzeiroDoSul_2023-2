import java.util.Scanner;

public class desafio_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float peso, altura, imc;

        System.out.println("Digite o seu peso: ");
        peso = scanner.nextFloat();

        System.out.println("Digite a sua altura: ");
        altura = scanner.nextFloat();

        imc = peso / (altura*altura);

        if(imc < 20){
            System.out.println("Abaixo do peso");
        } else if(imc < 25) {
            System.out.println("Peso normal");
        } else if(imc < 30){
            System.out.println("Sobrepeso");
        } else if(imc < 40) {
            System.out.println("Obeso");
        } else {
            System.out.println("Obeso Mórbido");
        }
    }
}
