import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Prime numbers less than 100:");
        int n = 2;
        while (n <= 100) {
            int cnt = 0;
            for (int i = 2; i <= Math.abs(Math.sqrt(n)); i++) {
                if (n - (n / i) * i == 0) cnt ++;
            }
            if (cnt == 0) System.out.println(n);
            n++;
        }
    }
}
