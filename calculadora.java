import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Calculadora");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("Faça sua escolha");
        int opcao = input.nextInt();

        if (opcao > 4) {
            System.out.println("Número inválido");
        }
        if (opcao < 1) {
            System.out.println("Número inválido");
        }
        if (opcao >= 1 && opcao <= 4){
            System.out.println("Digite o primeiro número:");
            int num1 = input.nextInt();
            System.out.println("Digite o segundo número:");
            int num2 = input.nextInt();
            int total = 0;
            input.close();

            if (opcao == 1) {
                total = num1 + num2;
                System.out.println("O total da adição foi de: "+total);
            }
            if (opcao == 2) {
                total = num1 - num2;
                System.out.println("O total da subtração foi de: "+total);
            }
            if (opcao == 3) {
                total = num1 * num2;
                System.out.println("O total da multiplicação foi de: "+total);
            }
            if (opcao == 4){
                if (num2 == 0) {
                    System.out.println("Não pode ser divido por 0");
                }
                else{
                    total = num1 / num2;
                    System.out.println("O total da divisão foi de: "+total);
                }
            }
        }
    }
}
