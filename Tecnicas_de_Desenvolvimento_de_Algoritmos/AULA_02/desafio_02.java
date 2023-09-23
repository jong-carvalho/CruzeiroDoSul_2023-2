import java.util.Scanner;

public class desafio_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float ladoA, ladoB, perim, area;

        System.out.println("Digite o valor de um lado (em cm): ");
        ladoA = scanner.nextFloat();

        System.out.println("Digite o valor do outro lado (em cm): ");
        ladoB = scanner.nextFloat();

        perim = 2*ladoA + 2*ladoB;

        System.out.println("Perímetro: " + perim + " cm");

        area = ladoA * ladoB;

        System.out.println("Área do retângulo: " + area + " cm2");

    }
}
