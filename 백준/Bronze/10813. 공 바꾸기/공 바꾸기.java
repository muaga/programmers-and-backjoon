import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 한 줄 입력 시, 공백을 기준으로 입력 값 배열로 담기
        String[] firstLine = br.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int m = Integer.parseInt(firstLine[1]);
        int[] arr = new int[n];

        // 배열 값 초기화
        Arrays.setAll(arr, i -> i + 1);

        for (int c = 0; c < m; c++) {
            String[] secondLine = br.readLine().split(" ");
            int i = Integer.parseInt(secondLine[0]);
            int j = Integer.parseInt(secondLine[1]);

            // 변경 전 데이터 깊은 복사
            int iNum = arr[i - 1];
            int jNum = arr[j - 1];

            // 깊은 복사한 값으로 데이터 서로 교환
            arr[i - 1] = jNum;
            arr[j - 1] = iNum;
        }

        // for문 돌면서 배열 값 추출
        for (int ball : arr) {
            bw.write(ball + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
