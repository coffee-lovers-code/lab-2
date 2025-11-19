import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        int first = in.nextInt(), count = in.nextInt();
        for(int i = 0; i < count; i++){
            if(i % 2 == 0) first += 4;
            else first *= 3;
            out.print(first + " ");
        }
    }
}
