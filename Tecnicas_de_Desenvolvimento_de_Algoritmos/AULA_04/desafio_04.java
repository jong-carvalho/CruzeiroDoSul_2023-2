import java.util.Scanner;

public class desafio_04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float n1, n2;
        String tipo;

        System.out.println("Nota1: ");
        n1 = scanner.nextFloat();

        System.out.println("Nota2: ");
        n2 = scanner.nextFloat();

        System.out.println("Qual o tipo (A ou P): ");
        tipo = scanner.nextLine();

        System.out.println("Média: " + calculaMedia(n1, n2, tipo));
    }

    static float calculaMedia(float nota1, float nota2, String tipo){
        float media;

        if(tipo.equals("A") || tipo.equals("a")){
            media = (nota1+nota2) / 2;
        } else {
            media = (nota1*3 + nota2*7)/10;
        }

        return media;
    }
}
