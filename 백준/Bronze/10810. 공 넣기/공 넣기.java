import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int m = sc.nextInt();

        for (int c = 0; c < m; c++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            for (int a = i; a <= j; a++) {
                arr[a - 1] = k;
            }
        }

        for (int ball : arr) {
            System.out.print(ball + " ");
        }

        sc.close();
    }
}