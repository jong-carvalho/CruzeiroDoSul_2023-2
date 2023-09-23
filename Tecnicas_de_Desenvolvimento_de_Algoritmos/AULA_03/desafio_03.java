import java.util.Scanner;

public class desafio_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float larg, alt, prof;

        System.out.println("Digite a largura da caixa em cm: ");
        larg = scanner.nextFloat();

        System.out.println("Digite a altura da caixa em cm: ");
        alt = scanner.nextFloat();

        System.out.println("Digite a profundidade da caixa em cm: ");
        prof = scanner.nextFloat();

        volume(larg, alt, prof);
    }

    static void volume(float l, float a, float p){
        float res;
        res = (l/100 * a/100 * p/100);

        System.out.println("O volume da caixa é " + res + " m³");
    }
}
