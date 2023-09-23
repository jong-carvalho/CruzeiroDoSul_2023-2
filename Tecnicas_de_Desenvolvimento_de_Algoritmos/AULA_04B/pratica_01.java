import java.util.Scanner;

public class pratica_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        escreva
        System.out.println("Digite um número");
//        leia
        int num = scanner.nextInt();

        if(num% 2 == 0){
            System.out.println("Número par");
        } else if(num% 2 != 0){
            System.out.println("Número ímpar");
        } else {
            System.out.println("Entrada inválida");
        }

        
    }
}
