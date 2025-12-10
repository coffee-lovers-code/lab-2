package task2;
import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        int count = in.nextInt();
        int el = in.nextInt();
        int result = 0;
        int j = 0, k = 0;
        for(int i = 1; i < count; i++){
            int past = el;
            el = in.nextInt();
            if(el % 2 == 0 && past % 2 == 0 && el != 0 && past != 0){
                if(el > past) j++;
                k = 0;
            }
            else if(el % 2 != 0 && past % 2 != 0){
                if(el > past) k++;
                j = 0;
            }
            if(k > result) result = k;
            if(j > result) result = j;
        }
        out.print(result);
    }
}