import java.util.Scanner;

public class pratica_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        String letra = scanner.next();

        switch (letra){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("Vogal");
                break;
            default:
                System.out.println("Consoante");
        }
    }
}
