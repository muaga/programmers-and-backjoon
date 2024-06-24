import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 첫 번째 줄에서 n과 m을 읽음
        String[] firstLine = br.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int m = Integer.parseInt(firstLine[1]);

        int[] arr = new int[n];

        // m번 공을 넣는 작업 수행
        for (int c = 0; c < m; c++) {
            String[] input = br.readLine().split(" ");
            int i = Integer.parseInt(input[0]);
            int j = Integer.parseInt(input[1]);
            int k = Integer.parseInt(input[2]);

            // i번 바구니부터 j번 바구니까지 k번 공을 넣음
            for (int a = i; a <= j; a++) {
                arr[a - 1] = k; // 배열 인덱스는 0부터 시작하므로 i-1, j-1로 접근
            }
        }

        // 결과 출력
        for (int ball : arr) {
            bw.write(ball + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
