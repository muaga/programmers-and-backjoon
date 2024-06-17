import java.io.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] numbers = new int[9]; // 크기가 9인 배열 생성

        // 각 입력마다 한 줄씩 자연수 입력 받기
        for (int i = 0; i < 9; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        // 최댓값 찾기
        int max = Arrays.stream(numbers).max().getAsInt();

        // 최댓값의 인덱스 찾기 (1부터 시작하는 인덱스)
        int maxIndex = Arrays.stream(numbers)
                             .boxed()
                             .collect(Collectors.toList())
                             .indexOf(max) + 1;

        // 최댓값과 최댓값의 인덱스 출력
        bw.write(max + "\n");
        bw.write(maxIndex + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
