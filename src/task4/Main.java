package task4;
import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        int n = in.nextInt(), k = in.nextInt();
        int[] m = new int[n];
        for(int i = 0; i < n; i++) m[i] = in.nextInt();
        for(int i = 0; i < k; i++){
            int last = m[0];
            for(int j = 0; j < n-1; j++){
                int el = m[j+1];
                m[j+1] = last;
                last = el;
            }
            m[0] = last;
        }
        for(int i: m) out.print(i + " ");
    }
}