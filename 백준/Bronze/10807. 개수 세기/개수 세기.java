import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int c = 0; c < n; c++){
            int number = sc.nextInt();
            arr[c] = number;
        }

        int v = sc.nextInt();
        
        long count = Arrays.stream(arr).filter(num -> num == v).count();
        System.out.println(count);
        sc.close();
    }
}
