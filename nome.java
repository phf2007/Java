import java.util.Scanner;

public class nome {
    public static void main(String[] args) {
        Scanner aScanner = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String nome = aScanner.next();
        System.out.println(nome);
        aScanner.close();
    }
}
