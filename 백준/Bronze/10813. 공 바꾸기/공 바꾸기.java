import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        Arrays.setAll(arr, i -> i + 1);

        for (int c = 0; c < m; c++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            // 변경 전 데이터 깊은 복사
            int iNum = arr[i - 1];
            int jNum = arr[j - 1];

            // 깊은 복사한 값으로 데이터 서로 교환
            arr[i - 1] = jNum;
            arr[j - 1] = iNum;
        }

        for (int ball : arr) {
            System.out.print(ball + " ");
        }

        sc.close();
    }
}