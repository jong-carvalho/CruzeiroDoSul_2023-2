import java.util.Scanner;

public class pratica_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o conceito atingido pelo aluno: ");
        String conceito = scanner.next();

        switch (conceito){
            case "A":
                System.out.println("Excelente");
                break;
            case "B":
                System.out.println("Ótimo");
                break;
            case "C":
                System.out.println("Bom");
                break;
            case "D":
                System.out.println("Regular");
                break;
            case "E":
                System.out.println("Ruim");
                break;
            case "F":
                System.out.println("Reprovado");
                break;
            default:
                System.out.println("Entrada inválida");
        }
    }
}
