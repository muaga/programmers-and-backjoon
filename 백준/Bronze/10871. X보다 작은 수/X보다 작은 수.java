import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] a = new int[n];
        for (int c = 0; c < n; c++) {
            int number = sc.nextInt();
            a[c] = number;
        }

        for (int num : a) {
            if (num < x) {
                System.out.print(num + " ");
            }
        }
        sc.close();
    }
}
