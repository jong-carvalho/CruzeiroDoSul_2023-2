import java.util.Scanner;

public class pratica_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int mes = scanner.nextInt();

        switch (mes){
            case 2:
                System.out.println("Esse mês possui 28 dias");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Esse mês possui 30 dias");
                break;
            default:
                System.out.println("Esse mês possui 31 dias");
        }
    }
}
