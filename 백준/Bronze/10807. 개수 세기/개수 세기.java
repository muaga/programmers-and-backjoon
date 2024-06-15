import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int c = 0; c < n; c++) {
            int number = sc.nextInt();
            arr[c] = number;
        }

        int v = sc.nextInt();

        int sum = 0;
        for (int number : arr) {
            if (number == v) {
                sum += 1;
            }
        }

        System.out.println(sum);
        sc.close();
    }
}
