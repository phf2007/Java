import java.util.Scanner;

public class nomeeidade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Qual seu nome?");
        String nome = input.next();
        System.out.println("Agora, qual a sua idade?");
        int idade = input.nextInt();
        System.out.println("Seja muito bem vindo "+nome+" de "+idade+" anos de idade");
        input.close();
    }
}
