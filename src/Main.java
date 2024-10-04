import java.awt.event.ItemEvent;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("input :");
        Scanner ll = new Scanner(System.in);
        String input = ll.nextLine();
        char[] chars = input.toCharArray();
        System.out.println(same(input));
    }

    public static long same(String n) {
        int s = n.length();
        int fac = factorial(s);
        int[] arr = new int[256];
        for (char o : n.toCharArray()) {
            arr[o]++;
        }
        for (int i = 0; i < 256; i++) {
            if (arr[i]>1){
                fac /= factorial(arr[i]);
            }
        }
        return fac;
    }
    public static int factorial(int s) {
        if (s == 0) {
            return 1;
        } else {
            return s * factorial(s - 1);
        }
    }
}