import java.util.Scanner;

public class idade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual sua idade?");
        int idade = input.nextInt();
        System.out.println(idade);
        input.close();
    }
}
