package task3;
import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        int num = in.nextInt();
        int el = 0;
        while(el == 0){
            if(num % 10 % 2 != 0) el = num % 10;
            num /= 10;
            if(num == 0) break;
        }
        if(el == 0) out.print("NO");
        else out.print(el);
    }
}