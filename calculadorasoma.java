import java.util.Scanner;

public class calculadorasoma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Calculadora de Somatória");
        System.out.println("Digite o primeiro número");
        int num1 = input.nextInt();
        System.out.println("Digite o segundo número");
        int num2 = input.nextInt();
        int total = 0;
        total = num1 + num2;
        input.close();
        System.out.println("O resultado foi de "+total);
    }
}
