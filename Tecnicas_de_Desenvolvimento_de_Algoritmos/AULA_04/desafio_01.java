import java.util.Scanner;

public class desafio_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int idade;

        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();

        if(idade >= 18){
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
}
