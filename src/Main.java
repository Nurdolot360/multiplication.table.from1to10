import javax.management.timer.TimerNotification;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 1;
        while (a <= 10) {
            int b = 1;
            while (b <= 10) {
                System.out.print(a + "*" + b + "=" + a * b+"\t\t\t\t\t");
                b++;
            }
            System.out.println();
            a++;
        }
    }
}
                                                                            



