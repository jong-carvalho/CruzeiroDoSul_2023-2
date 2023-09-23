import java.util.Scanner;

public class desafio_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float horas, minutos, totalMinutos;

        System.out.println("Digite o valor das horas: ");
        horas = scanner.nextFloat();

        System.out.println("Digite o valor dos minutos: ");
        minutos = scanner.nextFloat();

        totalMinutos = (horas*60) + minutos;

        System.out.println("Desde o inicio do dia já se passaram " + totalMinutos + " minutos");


    }
}
