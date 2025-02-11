import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class relogio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Timer timer = new Timer();
        LocalDateTime ldt = LocalDateTime.now();

        System.out.println("Tempo será em que tipo de unidade? \n1. Hora \n2. Minutos \n3. Segundos");
        int op = input.nextInt();

        if (op < 1) {
            System.out.println("Número inválido, menor que 1");
        }
        if (op > 3) {
            System.out.println("Número inválido, maior que 3");
        }
        else{
            System.out.println("Quanto tempo?");

            TimerTask ttk = new TimerTask() {
                int num = input.nextInt();
                public void run(){
                    if(num>0){
                        System.out.println("<<"+num+">>");
                        num--;
                    } else {
                        System.out.println("<<Acabou o tempo>>");
                        timer.cancel();
                    }
                }
            };
    
            input.close();
            if (op == 1) {
                timer.scheduleAtFixedRate(ttk, ldt.getSecond(), 3600000);
            }
            if (op == 2) {
                timer.scheduleAtFixedRate(ttk, ldt.getSecond(), 60000);
            }
            if (op == 3) {
                timer.scheduleAtFixedRate(ttk, ldt.getSecond(), 1000);
            }
        }
    }
}