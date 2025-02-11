import java.util.Random;
import java.util.Scanner;

public class roletarussa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random ran = new Random();
        int resposta = ran.nextInt(3) +1;

        System.out.println("Roleta Russa");
        System.out.println("Escolha um número de 1 a 3");
        int num = input.nextInt();
        input.close();

        if (num <1) {
            System.out.println("Número inválido, 1 a 3 somente!");
        }
        if (num >3) {
            System.out.println("Número inválido, 1 a 3 somente!");
        }
        if (num >= 1 && num <= 3) {
            if (num == resposta) {
                System.out.println("Você perdeu");
            }
            else{
                System.out.println("Você venceu");
                System.out.println("A resposta era: "+resposta);
            }
        }
    }
}