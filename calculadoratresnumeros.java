import java.util.Scanner;

public class calculadoratresnumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, num3, total;
        total = 0;

        System.out.println("Calculadora de 3 números");
        System.out.println("1. Adição \n2. Subtração \n3. Multiplicação \n4. Divisão");
        int opcao = input.nextInt();
        
        if (opcao == 1) {
            System.out.println("Digite o primeiro número");
            num1 = input.nextDouble();
            System.out.println("Digite o segundo número");
            num2 = input.nextDouble();
            System.out.println("Digite o terceiro número");
            num3 = input.nextDouble();

            total = num1 + num2 + num3;
            System.out.println("O resultado foi de: "+total);
        }
        if (opcao == 2) {
            System.out.println("Digite o primeiro número");
            num1 = input.nextDouble();
            System.out.println("Digite o segundo número");
            num2 = input.nextDouble();
            System.out.println("Digite o terceiro número");
            num3 = input.nextDouble();

            total = num1 - num2 - num3;
            System.out.println("O resultado foi de: "+total);
        }
        if (opcao == 3) {
            System.out.println("Digite o primeiro número");
            num1 = input.nextDouble();
            System.out.println("Digite o segundo número");
            num2 = input.nextDouble();
            System.out.println("Digite o terceiro número");
            num3 = input.nextDouble();

            total = num1 * num2 * num3;
            System.out.println("O resultado foi de: "+total);
        }
        if (opcao == 4) {
            System.out.println("Digite o primeiro número");
            num1 = input.nextDouble();
            System.out.println("Digite o segundo número");
            num2 = input.nextDouble();

            if (num2 != 0) {
                System.out.println("Digite o terceiro número");
                num3 = input.nextDouble();

                total = num1 / num2 / num3;
                System.out.println("O resultado foi de: "+total);
            } else {
                System.out.println("Não dá pra divir por 0");
            }
        } else {
            System.out.println("Escolha somente número entre 1 a 4");
        }
        input.close();
    }
}