import java.util.Scanner;

public class pratica_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float base, altura;

        System.out.println("Qual a base?");
        base = scanner.nextFloat();

        System.out.println("Qual a altura?");
        altura = scanner.nextFloat();

        System.out.println("Área " + calculaAreaTriangulo(base, altura));
    }

    static float calculaAreaTriangulo(float base, float altura){
        float area;
        area = base * altura / 2;
        return area;
    }
}
